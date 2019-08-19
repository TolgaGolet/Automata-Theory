package javaapplication43;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MTG
 */
public class JavaApplication43 {

    public static void main(String[] args) {
        State dfa=new State();
        String input;
        ArrayList<Character> array=new ArrayList();
        boolean isValid=true;
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Input: ");
        input=scan.nextLine();
        if(!input.isEmpty()) {
            for(int i=0;i<input.length();i++) {
                if(input.charAt(i)!='0'&&input.charAt(i)!='1') {
                    System.out.println("Invalid input");
                    isValid=false;
                    break;
                }
                else array.add(input.charAt(i));
            }
            if(isValid==true) {
                for(int i=0;i<array.size();i++) {
                    dfa.input(array.get(i));
                }
            }
            if(isValid==true) {
                if(dfa.getCurrentState()==0) System.out.println("q0-Divisible by 5");
                else System.out.println(dfa.getCurrentState());
            }
        }
        else {
            if(isValid==true) {
                if(dfa.getCurrentState()==0) System.out.println("q0-Divisible by 5");
                else System.out.println(dfa.getCurrentState());;
            }
        }
        
    }
    
}
