import java.util.concurrent.atomic.AtomicInteger;

//1.CAS  compareAndSet 比较并交换
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        System.out.println(atomicInteger.compareAndSet(5, 8) + "---" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(8, 9) + "---" + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5, 10) + "---" + atomicInteger.get());
    }
}
