import java.util.*;

class Ar extends Thread{
    public void run(){
        for(int i=0;i<25;i++){
            System.out.println(this.getName());
        }
    }
}
class Br extends Thread{
    public void run(){
        for(int i=0;i<25;i++){
            System.out.println(this.getName());
        }
    }
}
public class Multi {
    public static void main(String args[]){
        Ar a = new Ar();
        Br b= new Br();
        a.setName("Thread 1");
        b.setName("Thread 2");
        a.setPriority(1);
        b.setPriority(10);
       // a.start();
        b.start();
        a.start();
    }
    
}
