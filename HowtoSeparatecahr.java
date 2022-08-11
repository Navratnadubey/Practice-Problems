import java.util.*;

public class HowtoSeparatecahr {
    public static void main(String[] args) {
      String s="Nav#ra#tna";
      char ch;
      for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(ch!='#'){
          System.out.print(ch);
        }else{
          System.out.print("");
        }
      }
      for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(ch=='#'){
          System.out.print(ch);
        }else{
          System.out.print("");
        }
      }
  }
}