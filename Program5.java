class ExceptionDemo{
    public void checkedNumber(int a){
        if (a<0){
           throw new IllegalArgumentException("Number is INVALID!");
        }
        else{
            System.out.println("Number is valid");
            System.out.println("The number is "+a);
        }
    }
}
public class Program5 {
    public static void main(String args[]){
        ExceptionDemo e= new ExceptionDemo();
        try{
           System.out.println("Checking number's validity...");
            e.checkedNumber(-10);
        }
        catch(IllegalArgumentException b){
           System.out.println("An Exception has occurred.");
           System.out.println(b.getMessage());
            
        }
        finally{
            System.out.println("Program Ended!");
        }
    }
    
}
