public class Chrono5 implements Runnable {

    public void check5(){
        if (Chronos.seconds%5==0){
            System.out.println("5 seconds!");
        }
    }


    public void run(){

        try{
            check5();
            notifyAll();
            wait();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


}