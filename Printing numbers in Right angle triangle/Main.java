import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for(int row=0;row<n;row++){
        for(int col=0;col<=row;col++){
          System.out.print(num +"");
        }
        num = num+1;
        System.out.print("\n");
      }
	    // Type your code here
	}
}
