import java.util.*;
public class Function{
  public static String reverse(String s){
    for(int i=s.length()-1;i>=0;i--){
      char ch=s.charAt(i);
      System.out.print(ch);
    }
    return s;
  }
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    reverse(s);
  }
}