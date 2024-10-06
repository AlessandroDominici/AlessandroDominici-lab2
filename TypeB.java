import java.util.Random;  

// inherits from Thing
public class TypeB extends Thing {
    private int timeSinceLast;

    // constructor calls parent thing class 
    public TypeB(int row, int col) {
        // Type B Blue label 
        super(row, col, 'b');  
        this.timeSinceLast = 0;
    }

    @Override
    public void maybeTurn(Random rand) {
        // increment count to track
        timeSinceLast++;
        // turn every ten rounds
        if (timeSinceLast == 10) {
            // random number between 0 and 2
            int i = rand.nextInt(3);
            timeSinceLast = 0;
            // right if i is 1
            if (i == 1) {
                rightTurn();
            // left if i is 2
            } else if (i == 2) {
                leftTurn();
            }
            // if i is 0 no turn
        }
    }
}
