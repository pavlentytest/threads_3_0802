public class MyPrintThread extends Thread {

    private String mess;
    public boolean flag = true;
    MyPrintThread(String m) {
        this.mess = m;
    }

    @Override
    public void run() {
        while(flag) {
            Main.test(this.mess);
        }
    }
}
