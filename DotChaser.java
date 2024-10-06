import java.util.Random;

// responsible for running simulation
public class DotChaser {

    // global random object 
    public static Random rand = new Random(System.currentTimeMillis());

    // main entrance instead of everything here, the functionality is broken into well defined classes
    public static void main(String[] args) {
        ThingList list = new ThingList();
        int N = 200;

        // allow number of rounds to be set by command line arguments
        if (args.length != 0) {
            N = Integer.parseInt(args[0]);
        }
        
        // track rounds
        int count = 0;
        
        // infinite simulation loop
        while (true) {
            // Every N rounds add new Type a b c objects to the ThingList
            if (count % N == 0) {
                list.addThing(new TypeA(45, 50));  // Add TypeA
                list.addThing(new TypeB(55, 50));  // Add TypeB
            }

            // Every 2N rounds, add a new TypeC (Yellow) Thing
            if (count % (2 * N) == 0) {
              list.addThing(new TypeC(50, 50));  // Adds a yellow TypeC Thing
            }

            // prints positons and moves all based on behavior
            list.printAll();  
            list.moveAll(rand);   

            // increment round counter 
            count++;
        }
    }
}


