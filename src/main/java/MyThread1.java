import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread1 implements Runnable{

    String str;

    private final Lock lock = new ReentrantLock();

    public MyThread1(String str) {
        this.str = str;
        new Thread(this);
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(str.replace("а", "о"));
        }finally {
            lock.unlock();
        }
    }
}
