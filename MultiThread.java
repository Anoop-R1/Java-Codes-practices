

class Book implements Runnable{
    public void ru(){
        System.out.println("food");
    }
   public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(i);

            try {
                Thread.sleep(10000);
              
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
               System.out.println("sleep");
            }
       
        }
    }
   
}

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("started");
       Runnable book = new Book();
        Thread t1=new Thread(book);
        t1.start();
        for(int i=0;i<=5;i++)
        {
        try{
            Thread.sleep(2000);
            t1.interrupt();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
       //System.out.println(t1.isInterrupted()); 
        
    }
}

