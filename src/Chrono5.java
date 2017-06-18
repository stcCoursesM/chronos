public class Chrono5 implements Runnable {

    CommonSwitch cs;

    Chrono5(CommonSwitch cs){
        this.cs = cs;
    }

    public void check5(){
        while(cs.isTurnedOn()) {
            if (Chronos.seconds % 5 == 0 && Chronos.seconds >0) {
                System.out.println("5 more seconds have passed!");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run(){

            check5();
    }


}