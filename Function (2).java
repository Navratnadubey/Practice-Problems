import java.util.*;
public class Function{
  public static String concanateTwoString(String s1,String s2){
    System.out.println(s1+s2);
    return s1+s2;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
      String s1=input.next();
      String s2=input.next();
      concanateTwoString(s1,s2);
  }
}