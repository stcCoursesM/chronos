public class Chrono7 implements Runnable {

    public void check7(){
        if (Chronos.seconds%7==0){
            System.out.println("7 seconds!");
        }
    }


    public void run(){

        try{
            check7();
            notifyAll();
            wait();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}