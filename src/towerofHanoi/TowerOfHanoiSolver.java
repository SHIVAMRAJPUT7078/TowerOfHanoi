package towerofHanoi;

public class TowerOfHanoiSolver {
    private static int n;

    public static void show(char fromPeg, char toPeg) {
        System.out.println("move disk from peg '" + fromPeg + " 'to peg '" + toPeg + "'");
    }

    public static void hanoi(int numberOfDisks, char fromPeg, char viaPeg, char toPeg) {
        n++;
        if (numberOfDisks == 0) {
            return;
        }
        hanoi(numberOfDisks - 1, fromPeg, toPeg, viaPeg);
        show(fromPeg, toPeg);
        hanoi(numberOfDisks - 1, viaPeg, fromPeg, toPeg);
    }

}
