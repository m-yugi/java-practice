import java.util.concurrent.*;
class shared{
    static int count=0;
}
class mythread extends Thread{
    Semaphore sem;
    String ThredName;
    public  mythread(Semaphore sem, String thredName){
        super(thredName);
        this.sem=sem;
        this.ThredName=thredName;
    }
    @Override
    public void run(){
        System.out.println("starting "+ThredName);
        try{
            System.out.println("is waiting for a permit");
            sem.acquire();
            System.out.println("gets a permit");
            for(int i=0;i<10;i++){
                shared.count++;
                System.out.println(ThredName+":"+shared.count);
                Thread.sleep(10);
            }
        }
        catch (InterruptedException exc){
            System.out.println(exc);
        }
        System.out.println(ThredName+" release the permit");
        sem.release();
    }
}
public class sharedmemory {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem=new Semaphore(1);
        mythread mt1= new mythread(sem,"A");
        mt1.start();
        mt1.join();
        System.out.println("count :"+shared.count);
    }
}
