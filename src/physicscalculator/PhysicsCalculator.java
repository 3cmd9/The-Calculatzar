package physicscalculator;

import java.util.Scanner;

/**
 *
 * @author Liam, Mikael, Matt
 */
public class PhysicsCalculator {

    //i am a god
    
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
            System.out.println("Variable to be solved for:");
                System.out.println("1: Net Force");
                System.out.println("2: Gravitational Force");
                System.out.println("3: Frictional Force");
                int choice2 = kb.nextInt();
                if (choice2 == 1) {
                    System.out.println("Mass of object = ?");
                    double m = kb.nextDouble();
                    System.out.println("Acceleration of object = ?");
                    a = kb.nextDouble();
                    double net = netForce(m, a);
                    System.out.println("The net force is " + net);
                } else if (choice2 == 2) {
                    System.out.println("Mass of object = ?");
                    double m = kb.nextDouble();
                    double g = gravForce(m);
                    System.out.println("The gravitational force is " + g);
                } else if (choice2 == 3) {
                    System.out.println("Coefficient of friciton = ?");
                    double cf = kb.nextDouble();
                    System.out.println("Mass of object = ?");
                    double m = kb.nextDouble();
                    double f = fricForce(cf, m);
                    System.out.println("The frictional force is " + ff);
                }
        }
    }
    /**
     * 
     * @param mass
     * @param acc
     * @return 
     */
    public static double netForce (double mass, double acc) {
        double nf = mass * acc;
        return nf;
    }
    /**
     * 
     * @param mass
     * @return 
     */
    public static double gravForce (double mass) {
        double gf = mass * 9.8;
        return gf;
    }
    /**
     * 
     * @param friction
     * @param mass
     * @return 
     */
    public static double fricForce (double friction, double mass) {
        double ff = friction * mass * 9.8;
        return ff;
    }
}
