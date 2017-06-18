public class Chrono7 implements Runnable {

    CommonSwitch cs;

    Chrono7(CommonSwitch cs){
        this.cs = cs;
    }

    public void check7() throws InterruptedException {
        while(cs.isTurnedOn()) {
            if (Chronos.seconds % 7 == 0 & Chronos.seconds > 0) {
                System.out.println("7 more seconds have passed!");
                Thread.sleep(6000);
            }
            Thread.sleep(100);
        }
    }


    public void run(){

        try {
            check7();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}