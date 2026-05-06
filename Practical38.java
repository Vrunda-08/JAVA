class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class Practical38 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}