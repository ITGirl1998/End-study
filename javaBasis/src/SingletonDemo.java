import java.time.Instant;

class AddSingleton {
    private static volatile AddSingleton instance = null;

    private AddSingleton() {
        System.out.println("------------");
    }

    public static AddSingleton getInstance() {
        //DCL 双端检索的机制
        if (instance == null) {
            synchronized (AddSingleton.class) {
                if (instance == null) {
                    instance = new AddSingleton();
                }
            }
        }
        return instance;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                AddSingleton.getInstance();
            }, "thread").start();
        }
    }
}
