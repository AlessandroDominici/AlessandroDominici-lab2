import java.util.Random;  

// maybeTurn is called every round unlike type B which is every 10
// inherits from Thing class
public class TypeA extends Thing {
    // constructor supercalss parentclass Thing
    public TypeA(int row, int col) {
        // initalize to red
        super(row, col, 'r');  // Red label for TypeA
    }

    @Override
    // Polymorphism Type A provides its own behavior 
    public void maybeTurn(Random rand) {
        // random number between 0 and 2 
        int i = rand.nextInt(3);
        // if random number is 1 turn right if 2 go left if 0 no turn 
        if (i == 1) {
            rightTurn();
        } else if (i == 2) {
            leftTurn();
        }
    }
}
