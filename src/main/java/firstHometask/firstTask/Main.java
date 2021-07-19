package firstHometask.firstTask;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threads = new ThreadGroup("Main group");

        final Thread thread1 = new MyThread(threads, "Поток 1");
        final Thread thread2 = new MyThread(threads, "Поток 2");
        final Thread thread3 = new MyThread(threads, "Поток 3");
        final Thread thread4 = new MyThread(threads, "Поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threads.interrupt();
    }
}
