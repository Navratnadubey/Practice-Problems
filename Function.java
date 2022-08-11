import java.util.*;
public class Function{
  public static int Sum(int a,int b,int sum){
    System.out.println(sum);
    return sum;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int sum=a+b;
    Sum(a,b,sum);
  }
}