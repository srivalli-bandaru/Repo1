package Practice1;

import java.util.Scanner;

class Exception1{
    public static void main (String[] args) {
    	int a;
        int b;
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number");
    
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("value of a : "+a);
      System.out.println("value of b : "+b);
      
      try{
    	  int num = a/b;
          System.out.println("Division"+num);
        }
      
      catch(Exception e){
        System.out.println("Arthmetic Exception");
      }
      
       finally {
        	System.out.println("I am here");
        }
    }
}
