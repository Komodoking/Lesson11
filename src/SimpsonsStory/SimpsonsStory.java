/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpsonsStory;

/**
 *
 * @author ajdy5510
 */
public class SimpsonsStory {

    static String start[] = {"Simpsons in Cave", "Lisa Trapped with Burns", "Burns at Moe's", "Moe with Edna", "Edna in School"};
    static String end[] = {"Simpsons leave cave", "Lisa takes picture with Burns", "Moe puts gold in machine", "Edna stays on as teacher"};

    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            System.out.println("\n"+start[story(i)]);
            int n=i;
         
            if(n==4){
                while(true){
                    
                n--;
                System.out.println("\n"+end[story(i)]);
           if(n==0){
               break;
           }
                }
        }

    

}

}public static int story(int s) {

        return s;
    }
}