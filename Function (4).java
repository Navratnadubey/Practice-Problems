import java.util.*;
public class Function{
  public static int sumofArray(int n,int a[],int sum){
    for(int i=0;i<a.length;i++){
      sum=sum+a[i];
    }
    System.out.println(sum);
    return sum;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int sum=0;
      sumofArray(n,a,sum);
  }
}