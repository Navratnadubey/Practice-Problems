import java.util.*;
public class myName{
  public static void myName(String name){
    System.out.println(name);
    return;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String name=input.next();
    myName(name);
  }
}