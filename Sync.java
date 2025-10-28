
class Update{
     void updateSum(int n){
        Thread t=Thread.currentThread();
        for(int i=1;i<=5;i++){
            System.out.println(t.getName()+":"+(n+i));
        }
    }
}

class A extends Thread{
    Update u= new Update();
    public void run(){
        u.updateSum(5);
    }
}
public class Sync {
    public static void main (String args[]){
        A t1 =new A();
        A t2=new A();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();

    }
    
}
