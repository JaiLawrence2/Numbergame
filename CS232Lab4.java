/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs232lab4;

import java.util.Scanner;

/**
 *
 * @author jlaw
 */
public class CS232Lab4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        final int INTEGERS=10;
        
        int small=100;
        int large=1; 
        int num;
        double average=0;
        double sum=0;
        
 
        System.out.println("Enter 10 integers between 1 and 100 and I will tell you");
        System.out.println("the smallest, the largest, and the average.\n");
        Scanner input=new Scanner(System.in);

        for(int i=0;i<INTEGERS;i++)
        {
          num=input.nextInt();
          sum = sum +num;
          
          if (num<small){
              small=num;
          }
          else if(num>large)
          {
           large=num;
          }
        }  
        average = sum/INTEGERS;
          System.out.println("Smallest: "+small);
          System.out.println("Largest:"+large);
          System.out.println("Average: "+average);
          //gives the largest number in n numbers
        // TODO code application logic here
    }
    
}