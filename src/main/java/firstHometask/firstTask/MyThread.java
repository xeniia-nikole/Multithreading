package firstHometask.firstTask;

class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
            try {
                while(!isInterrupted()) {
                    Thread.sleep((long) (Math.random()*2500));
                    System.out.printf("Я %s, всем привет!\n", Thread.currentThread().getName());
                }
            } catch (InterruptedException err) {
                System.out.println(getName() + ": не буди спящее зло...");
            } finally {
                System.out.printf("%s завершен\n", getName());
            }
    }
}

