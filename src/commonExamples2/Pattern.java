package commonExamples2;

public class Pattern {
public static void main(String[] args) {
	
	int n=4;
	pyramid(n);
}

private static void pyramid(int n) {
	// TODO Auto-generated method stub
	 int i,j;int space = n - 1;
      for (j = 1; j <= n; j++) 
      {
    	  System.out.println(" ");
          for (i = 1; i <= space; i++) 
          {
              System.out.print(" ");
          }
       
          space--;
          for (i = 1; i <= 2 * j - 1; i++) 
          {
              System.out.print("*");                
          }
          System.out.println("");
      }
}}
