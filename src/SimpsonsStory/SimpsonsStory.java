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
    static String end[] = {"Simpsons leave cave", "Lisa takes picture with Burns","Burns gets gold ","Moe puts gold in machine", "Edna stays on as teacher"};

    public static void main(String[] args) {
        story(0);
        
    



}public static void story(int s) {
            System.out.println(start[s]);
 if(s<3) story(s+1);
            System.out.println(end[s]);
}
}