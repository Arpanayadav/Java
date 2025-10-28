class Mainss{
    public static void main(String a[]){
        Customer c= new Customer();
        Thread t1=new Thread(){
        public void run(){
            c.withdraw(2000);
            System.out.println("After withdrawal, amount is "+c.amount);
            }
        };
        Thread t2=new Thread(){
        public void run(){
            c.deposit(5000);
            System.out.println("After deposit, amount is "+c.amount);
            }
        };
        t1.start();
        t2.start();
    }
}
class Customer{
    int amount = 0;
    int flag = 0;
    synchronized void withdraw (int amount){
        System.out.println(Thread.currentThread().getName() +": is going to withdraw.");
        if (flag==0){
            try {
                System.out.println("Waiting...");
                wait();
            }
            catch (Exception e){
                System.out.println("Something went wrong");
            }
        }
        this.amount-=amount;
        System.out.println("Withdrawal completed!");
    }
    synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" : is going to deposit.");
        this.amount+=amount;
        notifyAll();
        System.out.println("Deposit completed!");
        flag=1;
    }
}