/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BunnyEars;

import java.util.ArrayList;
public class BunnyEars {
    ArrayList<Integer>testdata;
    ArrayList<Integer> expected;
    String id;
    BunnyEars(ArrayList<Integer>al,ArrayList<Integer>ex,String name){
        testdata=al;
        expected=ex;
        id=name;
    }
    public static void main(String args[]){
ArrayList<Integer> in=new ArrayList();
ArrayList<Integer> out=new ArrayList();
in.add(0); in.add(1);in.add(2);
in.add(3);in.add(4);in.add(5);
in.add(12);in.add(50);in.add(234);
out.add(0);out.add(1);out.add(2);
out.add(3);out.add(4);out.add(5);
out.add(24);out.add(100);out.add(468);
BunnyEars prob=new BunnyEars(in,out,"BunnyEars");
prob.test();}
    public int solve(int bunnies){
        if(bunnies==0){
            return 0;
        }
        else{
            return 2+solve(bunnies-1);
        }
        
    }
 
public int array11(int[] nums, int index) {

  if (index >= nums.length) return 0;

  if (nums[index] == 11) return 1 + array11(nums,index+1);

  else return array11(nums,index+1);

}

    public int countPairs(String str) {
int result = 0;
if(str.length() <= 2) {
return 0;
}

if(str.charAt(0) == str.charAt(2)) {
result++;
}
result += countPairs(str.substring(1, str.length()));
return result;
}
    public void test(){
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("======================");
        for (int i = 0; i < testdata.get(i); i++) {
            String output=id+"("+testdata.get(i)+")->"+expected.get(i);
            System.out.println(String.format("%-25a", output));
            int result=solve(testdata.get(i));
            String status=result==expected.get(i)?"Ok":"Fail";
            System.out.println(result+"\t"+status);
            
        }
        
    }
    


}
