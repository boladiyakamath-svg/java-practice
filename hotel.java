public class hotel implements Runnable {
    String s;
    hotel(String s){
        this.s=s;
    }
    
    public void run(){
        try {
            System.out.println(s+" is running " +Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println(s+" done");
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    }
}

class demo{
    public static void main(String[] args) {
        hotel h= new hotel("room cleaning");
        hotel h2= new hotel("food");
        hotel h3= new hotel("maintenance");

        Thread t1=new Thread(h,"room thread ");
        Thread t2=new Thread(h2,"room food ");
        Thread t3=new Thread(h3,"maintenance thread ");

        t1.start();t2.start();t3.start();
        

    }
}
