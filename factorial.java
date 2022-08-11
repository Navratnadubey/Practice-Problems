import java.util.*;
public class factorial{
  public static int fact(int n,int fact){
    return fact;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println(fact(n,fact));
  }
}