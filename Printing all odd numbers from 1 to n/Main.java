import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int n = 0; n<=num; n = n+1)
      {
        if(n%2!=0)
        {
          System.out.println(n);
        }
      }
	     // Type your code here
	}
}