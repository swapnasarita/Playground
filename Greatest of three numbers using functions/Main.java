import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = greatest_number(n1,n2);
      System.out.print(greatest_number(result,n3));
      
      // Type your code here
	}
  public static int greatest_number(int num1, int num2)
  {
    int max = 0;
    if(num1>num2){
      max = num1;
    }
    else{
      max = num2;
    }
    return max;
  }
}