package towerofHanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int noOfDisks = sc.nextInt();
        TowerOfHanoiSolver.hanoi(noOfDisks, 'A', 'B', 'C');
    }
}
