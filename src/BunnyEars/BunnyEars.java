/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BunnyEars;

import java.util.ArrayList;

/**
 *
 * @author ajdy5510
 */
public class BunnyEars {
    ArrayList<Integer>testdata;
    ArrayList<Integer> expected;
    String id;
    BunnyEars(ArrayList<Integer>al,ArrayList<Integer>ex,String name){
        testdata=al;
        expected=ex;
        id=name;
    }
    public int solve(int bunnies){
        if(bunnies==0){
            return 0;
        }
        else{
            return 2+solve(bunnies-1);
        }
        
    }
    public void test(){
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("======================");
        for (int i = 0; i < testdata.get(i); i++) {
            String output=id+"("+testdata.get(i)+")->"+expected.get(i);
        }
        
    }
}
