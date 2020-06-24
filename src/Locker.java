import java.util.Arrays;
public class Locker {
    public static void main(String[] args) {
        final int NUMBEROFLOCKERS = 100;
        boolean[] lockers = new boolean[NUMBEROFLOCKERS];
        int incrementBy = 0;

//        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        [1, 0, 0, 1, 0, 0, 0, 0, 1,  0]

        for (int l = 0; l < NUMBEROFLOCKERS; l++){
            incrementBy = l + 1;
            for (int k = l;  k< NUMBEROFLOCKERS; k +=incrementBy){
                // Start with the first locker and for every locker open it.
                if (l == 0) openLocker(lockers, k);
                // For ever other lockers
                else
                    // if the locker is open, close it.
                    if (lockers[k]) closeLocker(lockers, k);
                    // if the locker is closed, open it.
                    else openLocker(lockers, k);
            }
        }

        int numOfOpenLocker = 0;
        System.out.println("Below are the open lockers: ");
        for (int lockerIndex = 0; lockerIndex < NUMBEROFLOCKERS; lockerIndex++){
            if (lockers[lockerIndex]) {
                numOfOpenLocker++;
                System.out.println("\t Locker #: " + (lockerIndex + 1) + " ");
            }
        }

        // Displaying Results:
        System.out.printf("There are %d lockers that remain open.\n\n", numOfOpenLocker);

        System.out.println("What do you notice about the lockers that remain open?");
        System.out.println("I think the lockers that remain open have some type of sequence in between them." +
                        "If we look at the position of the lockers:\n1 \n4 \n9 \n16\n" +
                        "The difference between them goes like this: 3, 5, 7, 9 etc.");

    }

    // Open a locker;
    public static void openLocker(boolean[] lockers, int index) {
        lockers[index] = true;
    }
    // Close a locker;
    public static void closeLocker(boolean[] lockers, int index) {
        lockers[index] = false;
    }
}
