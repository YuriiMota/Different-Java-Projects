
package cesar;

import static java.lang.Math.random;
import java.util.Scanner;

public class Cesar {

      public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
          System.out.println("Input Text");
          String text = sc.nextLine();
          char[] achText= text.toCharArray();
          int achKey = 3;
          char[] achResult = new char[achText.length];
          char[] achDecrypt = new char[achText.length];
      
          int Min=97;
          int Max=122;
          if (achKey>26)achKey=(int)(achKey%26);
          for(int i=0;i<achText.length;i++){
              
              if ((achText[i]+achKey)>(Max)) achResult[i]=(char)(achText[i]+achKey-Max+Min-1);
              else achResult[i]=(char)(achText[i]+achKey);
          }
          System.out.println("Text: "+String.valueOf(achText));
          System.out.println("Key: "+achKey);
           System.out.println("Result: "+String.valueOf(achResult));
           String S= String.valueOf(achResult);
           for(int i=0;i<achText.length;i++){
              if(achResult[i]-achKey<Min) achDecrypt[i]=(char)(achResult[i]-achKey+Max-Min+1);
              else  achDecrypt[i]=(char)(achResult[i]-achKey);
           }
           System.out.println("Decrypt: "+String.valueOf(achDecrypt));
}}
