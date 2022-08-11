import java.util.*;
public class sumDemo{
  public static int mySum(int a,int b){
    int sum=a+b;
    return sum;
  }
  public static void main(String args[]){
    Scanner input=new Scanner (System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int sum=mySum(a,b);
    System.out.println(sum);
  }
}