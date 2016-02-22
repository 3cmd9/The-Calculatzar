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
        int choice2 = 0;
        int choice21 = 0;
        double momMass;
        double momVel;
        double momentum;
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
            while (choice2 > 3 || choice2 < 1) {
                System.out.println("1: Momentum");
                System.out.println("2: Impulse");
                System.out.println("3: Dynamics");
                choice2 = kb.nextInt();
            }
            if (choice2 == 1) {
                while (choice21 > 3 || choice21 < 1) {
                    System.out.println("Variable to be solved for:");
                    System.out.println("1: Momentum");
                    System.out.println("2: Mass");
                    System.out.println("3: Velocity");
                    choice21 = kb.nextInt();
                }
                if (choice21 == 1) {
                    System.out.println("Mass(kg) = ?");
                    momMass = kb.nextDouble();
                    System.out.println("Velocity(m/s) = ?");
                    momVel = kb.nextDouble();
                    System.out.println("Momentum = " + momentum(momVel, momMass) + "kg m/s");
                } else if (choice21 == 2) {
                    System.out.println("Momentum (kg m/s) = ?");
                    momentum = kb.nextDouble();
                    System.out.println("Velocity(m/s) = ?");
                    momVel = kb.nextDouble();
                    System.out.println("Velocity = " + momMass(momentum, momVel) + "kg m/s");
                } else if (choice21 == 3) {
                    System.out.println("Mass(kg) = ?");
                    momMass = kb.nextDouble();
                    System.out.println("Momentum (kg m/s) = ?");
                    momentum = kb.nextDouble();
                    System.out.println("Momentum = " + momVel(momentum, momMass) + " kg m/s");
                }
            } else if (choice2 == 2) {
                while (choice21 > 3 || choice21 < 1) {
                    System.out.println("Variable to be solved for:");
                    System.out.println("1: Impulse");
                    System.out.println("2: Force");
                    System.out.println("3: Change in time");
                    choice21 = kb.nextInt();
                }
            } else if (choice2 == 3) {

            }
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

    /**
     *
     * @param vel a double that represents velocity
     * @param mass a double that represents mass
     * @return a double that represents the momentum acquired by multiplying
     * velocity by mass
     */
    public static Double momentum(Double vel, Double mass) {
        double momentum = vel * mass;
        return momentum;
    }

    /**
     *
     * @param mom a double that represents momentum
     * @param mass a double that represents mass
     * @return a double that represents velocity acquired by dividing momentum
     * by mass
     */
    public static Double momVel(Double mom, Double mass) {
        Double vel = mom / mass;
        return vel;
    }

    /**
     *
     * @param mom
     * @param vel a double that represents velocity
     * @return a double that represents mass acquired by dividing momentum by
     * velocity
     */
    public static Double momMass(Double mom, Double vel) {
        Double mass = mom / vel;
        return mass;
    }
}
