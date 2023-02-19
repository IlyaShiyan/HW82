import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        MyThread1 mt1 = new MyThread1(str);
        mt1.run();

        MyThread2 mt2 = new MyThread2(str);
        mt2.run();
        
    }
}
