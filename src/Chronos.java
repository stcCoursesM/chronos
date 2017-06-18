
public class Chronos implements Runnable {

    public static int getSeconds() {
        return seconds;
    }

    public static void setSeconds(int seconds) {
        Chronos.seconds = seconds;
    }

    CommonSwitch cs;

    Chronos(CommonSwitch cs){
        this.cs = cs;
    }

    static boolean notStopped = true;
    static int seconds;

    public void setSeconds() {
        long start = System.currentTimeMillis();

        while(cs.isTurnedOn()) {
            int diff = ((int) ((System.currentTimeMillis() - start)));
            if (diff>1000) {
                setSeconds(getSeconds() + 1);
                System.out.println("Current second: "+seconds);
                start = System.currentTimeMillis();
            }
            if (seconds>100) cs.setIsTurnedOff();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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