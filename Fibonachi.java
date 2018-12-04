/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Yura
 */
class Fibo{
    void Fibon(int n){
       
        int a=1;
        int b=1;
        int f;
        if (n==1)System.out.print(a+" ");
        else System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
          f=a+b;
          a=b;
          b=f;
           System.out.print(f+" ");
        }
    }
}
public class Fibonachi {
     public static void main(String args[]){
         int k=10;
         Fibo F = new Fibo();
         F.Fibon(k);
     }
}
