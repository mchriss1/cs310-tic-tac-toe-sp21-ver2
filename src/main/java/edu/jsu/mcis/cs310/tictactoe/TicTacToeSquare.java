package edu.jsu.mcis.cs310.tictactoe;

/**
* TicTacToeSquare represents the state of an individual square on a Tic-Tac-Toe
* game board, or the specified player's mark.
*
* @author  Martez Christian
* @version 1.0
*/
public enum TicTacToeSquare {
    
    /**
     * X
     */    
    X("X"),
    
    /**
     * O
     */
    O("O"),
    
    /**
     * Empty Square
     */
    EMPTY(" ");

    static void EMPTY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String message;

    private TicTacToeSquare(String msg) {
        message = msg;
    }

    @Override
    public String toString() {
        return message;
    }
    
}