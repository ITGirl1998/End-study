import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//volatile 的可见性（工作内存 ——>copy 主内存——>改变数据——>刷新主内存 ——>同步工作内存 ）

//volatile 不保证原子性  当有多个线程 同时修改同一个被 volatile 修饰的变量 会造成 数据被重写的问题
//解决方案：使用synchronized ————>由于是重量级的锁，会造成性能为题  可以使用原子类 AtomicInteger....

//volatile 禁止指令重排

class ChangeNumber {
    volatile int num = 0;

    AtomicInteger atomicInteger = new AtomicInteger();
    public void change() {
        num = 666;
    }
    public void addChange() {
        num++;
    }
    public void atomicAddChange() {
        atomicInteger.getAndIncrement();
    }
}

public class VolatileDemo {
    public static void main(String[] args) {
        ChangeNumber changeNumber = new ChangeNumber();
        for (int j = 0; j < 20; j++) {
            new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    changeNumber.atomicAddChange();
                }
            }, String.valueOf(j)).start();
        }

        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(changeNumber.atomicInteger);
    }

    public void atomicNoVolatile() {
        ChangeNumber changeNumber = new ChangeNumber();
        for (int j = 0; j < 20; j++) {
            new Thread(() -> {
                for (int i = 0; i < 100; i++) {
                    changeNumber.atomicAddChange();
                }
            }, String.valueOf(j)).start();
        }

        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(changeNumber.atomicInteger);
    }

    public void seeOkVolatile() {
        ChangeNumber changeNumber = new ChangeNumber();
        new Thread(() -> {
            System.out.println(changeNumber.num);
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            changeNumber.change();
            System.out.println(changeNumber.num);
        }, "thread").start();

        while (changeNumber.num == 0) {

        }
        System.out.println(changeNumber.num);
    }
}
