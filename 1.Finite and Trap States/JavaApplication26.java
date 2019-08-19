package javaapplication26;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MTG
 */
public class JavaApplication26 {
    
    public enum State {
        A, BFiniteState, CTrapState
    }

    
    public static void main(String[] args) {
        State currentState=State.A;
        String input;
        ArrayList<Character> array=new ArrayList();
        array.clear();
        boolean isValid=true;
        Scanner scan=new Scanner(System.in);
        
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
                    switch(currentState) {
                        case A: if(array.get(i)=='0') currentState=State.BFiniteState;
                                else currentState=State.CTrapState;
                                break;
                        case BFiniteState: if(array.get(i)=='0') currentState=State.BFiniteState;
                                else currentState=State.BFiniteState;
                                break;
                        case CTrapState: if(array.get(i)=='0') currentState=State.CTrapState;
                                else currentState=State.CTrapState;
                                break;
                    }
                }
            }
            if(isValid==true) System.out.println(currentState);
        }
        else {
            if(isValid==true) System.out.println(currentState);
        }
        
    }
    
}
