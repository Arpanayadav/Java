class Marks{
     int s1,s2,s3;
     int total;
     double per;
    Marks(int s1,int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;}
    void calculateSum(){
          total=s1+s2+s3;
    }
    void calculatePercentage(){
       
        per=total/3.0;
    }
    void display()
    {
        System.out.println("Total marks obtained="+total);
        System.out.println("Total percentage="+per);
    }
}

public class Main {
    public static void main(String a[]){
        Marks obj1=new Marks(56,65,54);
       
        obj1.calculateSum();
       
        obj1.calculatePercentage();
       
        obj1.display();
       
    }
}