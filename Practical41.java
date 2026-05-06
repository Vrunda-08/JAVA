class SumThread1 extends Thread {
    private long sum = 0;

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

class SumThread2 extends Thread {
    private long sum = 0;

    public void run() {
        for (int i = 1001; i <= 2000; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class Practical41 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        SumThread1 t1 = new SumThread1();
        SumThread2 t2 = new SumThread2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e) {}

        long total = t1.getSum() + t2.getSum();

        System.out.println("Sum from 1 to 1000  : " + t1.getSum());
        System.out.println("Sum from 1001 to 2000: " + t2.getSum());
        System.out.println("Final Sum           : " + total);
    }
}