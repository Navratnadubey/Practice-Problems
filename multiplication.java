import java.util.*;
public class multiplication{
  public static int Calculater(int a, int b){
    int mul=a*b;
    int sum=a+b;
    return mul;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int mul=Calculater(a,b);
    System.out.println(mul);
    int sum=Calculater(a,b);
    System.out.println(sum);
  }
}