import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 implements Runnable{

    String str;

    private final Lock lock = new ReentrantLock();

    public MyThread2(String str) {
        this.str = str;
        new Thread(this);
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(str.replace("а","н"));
        }finally {
            lock.unlock();
        }
    }
}