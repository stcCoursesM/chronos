public class Main {



    public static void main(String[] args) {


        CommonSwitch cs = new CommonSwitch();

        Thread thr1 = new Thread(new Chronos(cs));
        Thread thr2 = new Thread(new Chrono5(cs));
        Thread thr3 = new Thread(new Chrono7(cs));
        thr1.start();
        thr2.start();
        thr3.start();

//        long start = System.currentTimeMillis();
//        Date before = new java.util.Date();
//        int i = 0;
//        int y = 0;
//        while (i<900000000) {
//            i++;
//            while (y<900000000) {
//                y++;
//            }
//        };
//
//        long end = System.currentTimeMillis();
//        Date after = new java.util.Date();
//
//        int dif1 = (int)((end-start)/10);
//        int dif2 = (int)((after.getTime() - before.getTime())/10);
//
//        System.out.println(dif1);
//        System.out.println(dif2);



    }


}
