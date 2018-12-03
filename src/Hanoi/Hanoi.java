/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hanoi;

import TerminalIO.*;
public class Hanoi {

   static int nummoves=0;
   
    public static void main(String[] args) {
        KeyboardReader k= new KeyboardReader();
        int numrings=k.readInt("Enter number of rings 3 to 10 ");
        if(numrings<3||numrings>10){
            System.out.println("Invalid input-program will now end. ");
            return;
        }
                move(numrings,1,3,2);
                System.out.println("Total moves = "+nummoves);
    }
    public static void move(int n,int i, int j, int k){
        if(n>0){
        nummoves++;
        move(n-1,i,k,j);
            System.out.println("Move ring "+n+" form peg"+i+" to peg "+j);
            move(n-1,k,j,i);
            
        }
    }
}
