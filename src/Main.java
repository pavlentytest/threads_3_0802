public class Main {
    public static void main(String[] args) throws InterruptedException {
        // [+][-][+][-][+][-].....
        MyPrintThread thread1 = new MyPrintThread("+");
        MyPrintThread thread2 = new MyPrintThread("-");
        thread1.start();
        thread2.start();
        Thread.sleep(3000);
        thread1.flag = false;
     //   thread1.join(); // ждем завершения потока
        test("1 thread stopped!");
    }

    public static final Object KEY = new Object();
    public static void test(String message) {
     //   synchronized (KEY) {
            try {
                System.out.print("[");
                Thread.sleep(500);
                System.out.print(message);
                Thread.sleep(500);
                System.out.print("]");
              //  KEY.notify(); // возобн. поток в реж. ожид.
              //  KEY.wait(); // поток в режиме ожидания
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
       // }

    }

}












class MyThread extends Thread {
    @Override
    public void run() {
        // логика
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run() {

    }
}

// Процесс (программа)
// Поток