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
public class proste {
    public static void main(String args[]){
        boolean b= true;
        int n= 200;
        for(int i=2;i<n;i++){
        for(int j=2;j<i;j++)
            if((i % j)==0){
            b=false;  
           break;  
           
        }
          if (b) System.out.print(i+" "); 
          b=true;
    }
}}
