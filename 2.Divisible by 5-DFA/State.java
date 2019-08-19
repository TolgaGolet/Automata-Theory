package javaapplication43;

/**
 *
 * @author MTG
 */
public class State {
    int currentState=0;  //Default is initial state.
    int[][] table={
        {0, 1},
        {2, 3},
        {4, 0},
        {1, 2},
        {3, 4}
    };
    
    public void input(int x) {
        currentState=table[currentState][x-48];
    }
    
    public int getCurrentState() {
        return currentState;
    }
    
}
