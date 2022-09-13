/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld_2;
import java.util.*;
/**
 *
 * @author param
 */
public class HelloWorld_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Do you know... I want to say hello to this world \nBtw, could you please help me with solving this complex algorithm of 2+2");
        Scanner in = new Scanner(System.in);
        if(in.nextInt() == 4)
        {
            System.out.println("Correct!!  My freind. \n We homosapiens are proud of you. \n Lets meet sometime and we will discuss more of such complex algorithms");
        }
        else
            System.out.println("Oh that's cool.. but that's not what one of the mathematicians taught me.. Dont worry, I will talk with them, maybe they are wrong (saying its 4).");
        
        System.out.println("\nThanks a lot my homosapien freind. we will see you around!!");
        
    }
    
}
