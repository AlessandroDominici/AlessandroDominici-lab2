import java.util.Random;

// inherits all fields and methods from Thing class
public class TypeC extends Thing {
    // private variable to track diagonal movment 
    private int diagonalStep;

    // Constructor, inherits from superclass/parentclass Thing
    public TypeC(int row, int col) {
        // Type C gets a Yellow label 
        super(row, col, 'y');
        // Initalize step
        this.diagonalStep = 0;
    }

    @Override
        public void maybeTurn(Random rand) {
        // increment in a cycle of 4 
        diagonalStep = (diagonalStep + 1) % 4;
        if (diagonalStep == 0 || diagonalStep == 2) {
            // call inherited method from Thing class to turn right 
            rightTurn();  
        }
    }
}
