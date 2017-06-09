
public class Chronos implements Runnable {

    public static int getSeconds() {
        return seconds;
    }

    public static void setSeconds(int seconds) {
        Chronos.seconds = seconds;
    }

    static boolean notStopped = true;
    static int seconds;

    public void setSeconds() {
        long start = System.currentTimeMillis();
        while(notStopped) {
            if ((int) ((start - System.currentTimeMillis()) / 1000) == 1) {
                setSeconds(getSeconds() + 1);
                start = System.currentTimeMillis();
            }
        }
        try{
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }


    public void run(){


        try{
            setSeconds();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}