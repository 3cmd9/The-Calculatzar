package physicscalculator;

import java.util.Scanner;

/**
 *
 * @author Liam, Mikael, Matt
 */
public class PhysicsCalculator {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int choice = 0;
        double v1;
        double v2;
        double a;
        double t;
        double d;
        while (choice > 3 || choice < 1) {
            System.out.println("Select topic:");
            System.out.println("1: Kinematics");
            System.out.println("2: Work, Energy, Momentum");
            System.out.println("3: Dynamics");
            choice = kb.nextInt();
        }
        if (choice == 1) {
            choice = 0;
            while (choice > 5 || choice < 1) {
                System.out.println("Variable to be solved for:");
                System.out.println("1: Initial Velocity");
                System.out.println("2: Final Velocity");
                System.out.println("3: Acceleration");
                System.out.println("4: Time");
                System.out.println("5: Distance");
                choice = kb.nextInt();
            }
            System.out.println("Initial velocity = ?");
            v1 = kb.nextDouble();
            System.out.println("Final velocity = ?");
            v2 = kb.nextDouble();
            System.out.println("Acceleration = ?");
            a = kb.nextDouble();
            System.out.println("Time = ?");
            t = kb.nextDouble();
            System.out.println("Distance = ?");
            d = kb.nextDouble();

        }
        if (choice == 2) {
            System.out.println("Initial velocity = ?");
            v1 = kb.nextDouble();
            System.out.println("Final velocity = ?");
            v2 = kb.nextDouble();
            System.out.println("Acceleration = ?");
            a = kb.nextDouble();
            System.out.println("Time = ?");
            t = kb.nextDouble();
            System.out.println("Distance = ?");
            d = kb.nextDouble();
        }
        if (choice == 3) {
            System.out.println("Initial velocity = ?");
            v1 = kb.nextDouble();
            System.out.println("Final velocity = ?");
            v2 = kb.nextDouble();
            System.out.println("Acceleration = ?");
            a = kb.nextDouble();
            System.out.println("Time = ?");
            t = kb.nextDouble();
            System.out.println("Distance = ?");
            d = kb.nextDouble();
        }
    }

}
