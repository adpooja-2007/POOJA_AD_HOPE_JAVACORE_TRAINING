package DAY11;
public class complileTime{
    public static void main(String[] args){
        Thread  t = new Thread(()->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(5000);
                System.out.println(":thread wake");
             }
            catch(InterruptedException e ){
                System.out.println("Sleep interrupted");
            }
      });
      t.start();
      t.interrupt();
try{
    Thread.sleep(4000);
}
catch(Exception e){
    System.out.println("Not t");
}
t.interrupt();
}
}
