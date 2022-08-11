import java.util.*;
public class multiplication{
  public static int calculaterMul(int a, int b){
    return a*b;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    System.out.println(calculaterMul(a,b));
  }
}