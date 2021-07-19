package firstHometask.secondTask;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
        private String name;

        public MyCallable(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public Integer call() throws Exception {
            int i = 0;
            long t = System.currentTimeMillis();
            long end = t + 20000;
            try {
                while (System.currentTimeMillis() < end) {
                    Date date = new Date();
                    System.out.println("Это Поток #" + getName() +
                            " -- Сегодня " + date + " -- Хорошего дня!");
                    i++;
                    Thread.sleep(2500);
                }
            } catch(InterruptedException e){
                System.out.println("Прерывание работы " + getName());
            } finally{
                System.out.printf("Поток %s завершён, число исполнений - %d.\n", getName(), i);
            }
            return i;
        }
}
