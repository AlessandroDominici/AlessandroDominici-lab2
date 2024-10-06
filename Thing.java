import java.util.Random;

// base class super class
// type a n and c inherit
public abstract class Thing {
    // protected fields that types can access
    // initalizes row col dir and lab for color 
    protected int row;  
    protected int col;  
    protected int dir;  
    protected char lab;

    // constructor that subclasses will call
    // default to face north
    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0;  
    }

    // use modulo to cycle the direction to the right
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    // use modulo to cycle the direction to the left
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    // step moves Thing one step in current direction
    public void step() {
        final int[] dc = { 0, 1, 0, -1 }, dr = { 1, 0, -1, 0 };
        // update row and column
        row += dr[dir];
        col += dc[dir];
    }

    // abstract method allows subclasses to implement polymorphic designs 
    public abstract void maybeTurn(Random rand);  
    
    @Override
    // provides string representation 
    public String toString() {
        return row + " " + col + " " + lab;
    }
}
