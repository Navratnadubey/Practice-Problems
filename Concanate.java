import java.util.Scanner;
public class Concanate{
  public static String concanateTwoString(String a, String b){
    return a+b;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String a=input.next();
    String b=input.next();
    System.out.println(concanateTwoString(a,b));
  }
}