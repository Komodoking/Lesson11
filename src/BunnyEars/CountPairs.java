
package BunnyEars;

import java.util.ArrayList;


public class CountPairs {
      ArrayList<Integer>testdata;
    ArrayList<Integer> expected;
       String id;
       
          testdata=al;
        expected=ex;
        id=name;
    public int solve(String str) {
int result = 0;
if(str.length() <= 2) {
return 0;
}

if(str.charAt(0) == str.charAt(2)) {
result++;
}
result += solve(str.substring(1, str.length()));
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
