import java.util.*;
public class Function{
  public static String Concatenate(String s,String m){
    System.out.println(s+m);
    return s+m;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s=input.next();
    String m=input.next();
    Concatenate(s,m);
  }
}