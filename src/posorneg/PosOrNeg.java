/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posorneg;

/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class PosOrNeg {
    public static void main(String[] args) {
    Scanner obj=new Scanner (System.in);
        System.out.print("Enter number:");
    int num=obj.nextInt();
    
    if(num<0){
        System.out.println("The number is negative");
              }
    else{
        System.out.println("The number is positive");
        }   
    }
}
