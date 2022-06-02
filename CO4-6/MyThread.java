import java.util.*;

class fibonacci implements Runnable{

    public fibonacci(int limit)
    {
        this.limit = limit;
    }

    public void run(){
    firstTerm = 0;
    secondTerm = 1;
    System.out.println("Fibonacci Series till " + this.limit + " terms:");

    for (int i = 1; i <= this.limit; ++i) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
class even implements Runnable{

    public even(int limit)
    {
        this.limit = limit;
    }

    


    public void run(){
      
        for (int i=1; i<=this.limit; i++)   
        {  
        if (i%2==0)   
        {  
        System.out.print(i + " ");  
        }  
        }  
        }  
}


public class MyThread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        fibonacci r = new fibonacci(limit);
        Thread t = new Thread(r);
        t.start();
        even r2 = new even(limit);
        Thread t2 = new Thread(r2);
        t2.start();


    }
}




