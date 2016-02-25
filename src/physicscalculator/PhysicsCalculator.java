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
        int choice2 = 0;
        int choice21 = 0;
        int choice210 = 0;
        int timeChoice = 0;
        double mass;
        double vel;
        double momentum;
        double force;
        double energy;
        double height;
        double change;
        double time1;
        double time2 = 0;
        double impulse;
        double v1;
        double v2;
        double a;
        double t;
        double d;
        double m;
        double g;
        double gf;
        double net;
        int choice3b;
        double cf;
        double f;
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
                System.out.println("3: Energy");
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
                    mass = kb.nextDouble();
                    System.out.println("Velocity(m/s) = ?");
                    vel = kb.nextDouble();
                    System.out.println("Momentum = " + multiply(vel, mass) + " kg m/s");
                } else if (choice21 == 2) {
                    System.out.println("Momentum (kg m/s) = ?");
                    momentum = kb.nextDouble();
                    System.out.println("Velocity(m/s) = ?");
                    vel = kb.nextDouble();
                    System.out.println("Velocity = " + divide(momentum, vel) + " kg m/s");
                } else if (choice21 == 3) {
                    System.out.println("Mass(kg) = ?");
                    mass = kb.nextDouble();
                    System.out.println("Momentum (kg m/s) = ?");
                    momentum = kb.nextDouble();
                    System.out.println("Momentum = " + divide(momentum, mass) + " kg m/s");
                }
            } else if (choice2 == 2) {
                while (choice21 > 3 || choice21 < 1) {
                    System.out.println("Variable to be solved for:");
                    System.out.println("1: Impulse");
                    System.out.println("2: Force");
                    System.out.println("3: Change in time");
                    choice21 = kb.nextInt();
                }
                if (choice21 == 1) {
                    while (timeChoice > 2 || timeChoice < 1) {
                        System.out.println("For time:");
                        System.out.println("1. Has it been calulated");
                        System.out.println("2. Do you need to find the difference in values");
                        timeChoice = kb.nextInt();
                    }
                    if (timeChoice == 1) {
                        System.out.println("Force(N) = ?");
                        force = kb.nextDouble();
                        System.out.println("Change in time(s) = ?");
                        change = kb.nextDouble();
                        System.out.println("Impulse = " + multiply(force, change) + " Ns");
                    } else if (timeChoice == 2) {
                        System.out.println("Force(N) = ?");
                        force = kb.nextDouble();
                        System.out.println("Time 1(s) = ?");
                        time1 = kb.nextDouble();
                        while (time2 <= time1) {
                            System.out.println("Time 2(s) = ?");
                            time2 = kb.nextDouble();
                        }
                        System.out.println("Impulse = " + multiply(force, subtract(time2, time1)) + " Ns");
                    }
                } else if (choice21 == 2) {
                    while (timeChoice > 2 || timeChoice < 1) {
                        System.out.println("For time:");
                        System.out.println("1. Has it been calulated");
                        System.out.println("2. Do you need to find the difference in values");
                        timeChoice = kb.nextInt();
                    }
                    if (timeChoice == 1) {
                        System.out.println("Impulse(Ns) = ?");
                        impulse = kb.nextDouble();
                        System.out.println("Change in time(s) = ?");
                        change = kb.nextDouble();
                        System.out.println("Force = " + divide(impulse, change) + " N");
                    } else if (timeChoice == 2) {
                        System.out.println("Impulse(Ns) = ?");
                        impulse = kb.nextDouble();
                        System.out.println("Time 1(s) = ?");
                        time1 = kb.nextDouble();
                        while (time2 <= time1) {
                            System.out.println("Time 2(s) = ?");
                            time2 = kb.nextDouble();
                        }
                        System.out.println("Force = " + divide(impulse, subtract(time2, time1)) + " N");
                    }
                } else if (choice21 == 3) {
                    System.out.println("Impulse(Ns) = ?");
                    impulse = kb.nextDouble();
                    System.out.println("Force(N) = ?");
                    force = kb.nextDouble();
                    System.out.println("Change in time " + divide(impulse, force) + " s");
                }
            } else if (choice2 == 3) {
                while (choice21 > 3 || choice21 < 1) {
                    System.out.println("1: Kinetic Energy");
                    System.out.println("2: Gravitational Potential Energy");
                    System.out.println("3: Rest Energy");
                    choice21 = kb.nextInt();
                }
                if (choice21 == 1) {
                    while (choice210 > 3 || choice210 < 1) {
                        System.out.println("Variable to be solved for:");
                        System.out.println("1: Energy");
                        System.out.println("2: Mass");
                        System.out.println("3: Velocity");
                        choice210 = kb.nextInt();
                    }
                    if (choice210 == 1) {
                        System.out.println("Mass(kg) = ?");
                        mass = kb.nextDouble();
                        System.out.println("Velocity(m/s) = ?");
                        vel = kb.nextDouble();
                        System.out.println("Energy = " + kineticEnergy(mass, vel) + " J");
                    } else if (choice210 == 2) {
                        System.out.println("Energy(J) = ?");
                        energy = kb.nextDouble();
                        System.out.println("Velocity(m/s) = ?");
                        vel = kb.nextDouble();
                        System.out.println("Mass = " + kineticMass(energy, vel) + " kg");
                    }else if (choice210 == 3){
                        System.out.println("Energy(J) = ?");
                        energy = kb.nextDouble();
                        System.out.println("Mass(kg) = ?");
                        mass = kb.nextDouble();
                        System.out.println("Velocity = " + kineticVelocity(energy, mass) + " m/s");
                    }
                }else if (choice21 == 2){
                    //mgh
                    while (choice210 > 3 || choice210 < 1) {
                        System.out.println("Variable to be solved for:");
                        System.out.println("1: Energy");
                        System.out.println("2: Mass");
                        System.out.println("3: Height");
                        choice210 = kb.nextInt();
                    }
                    if(choice210 == 1){
                        System.out.println("Height(m) = ?");
                        energy = kb.nextDouble();
                        System.out.println("Mass(kg) = ?");
                        mass = kb.nextDouble();
                        System.out.println("Energy = " + fricForce(energy, mass) + " J");
                    }else if(choice210 == 2){
                        System.out.println("Height(m) = ?");
                        energy = kb.nextDouble();
                        System.out.println("Energy(J) = ?");
                        height = kb.nextDouble();
                        System.out.println("Mass = " + potentialMass(energy, height) + " kg");
                    }
                }
            }
        }
           if (choice == 3) {
            System.out.println("Equation to be used:");
            System.out.println("1: Net Force");
            System.out.println("2: Gravitational Force");
            System.out.println("3: Frictional Force");
            int choice3 = kb.nextInt();
            if (choice3 == 1) {
                System.out.println("Variable to be solved for:");
                System.out.println("1: Net Force");
                System.out.println("2: Mass");
                System.out.println("3: Acceleration");
                choice3b = kb.nextInt();
                if (choice3b == 1) {
                    System.out.println("Mass of object = ?");
                    m = kb.nextDouble();
                    System.out.println("Acceleration of object = ?");
                    a = kb.nextDouble();
                    net = netForce(choice3b, m, a);
                    System.out.println("The net force is " + net + "N");
                } else if (choice3b == 2) {
                    System.out.println("Net force of object = ?");
                    net = kb.nextDouble();
                    System.out.println("Acceleration of object = ?");
                    a = kb.nextDouble();
                    m = netForce(choice3b, net, a);
                    System.out.println("The mass of the object is " + m + "kg");
                } else if (choice3b == 3) {
                    System.out.println("Net force of object = ?");
                    net = kb.nextDouble();
                    System.out.println("Mass of object = ?");
                    m = kb.nextDouble();
                    a = netForce(choice3b, net, m);
                    System.out.println("The acceleration of the object is " + a + "m/s^2");
                }
            } else if (choice3 == 2) {
                System.out.println("Variable to be solved for:");
                System.out.println("1: Gravitational Force");
                System.out.println("2: Mass");
                choice3b = kb.nextInt();
                if (choice3b == 1) {
                    System.out.println("Mass of object = ?");
                    m = kb.nextDouble();
                    g = gravForce(choice3b, m);
                    System.out.println("The gravitational force is " + g + "N");
                } else if (choice3b == 2) {
                    System.out.println("Gravitational Force = ?");
                    g = kb.nextDouble();
                    m = gravForce(choice3b, g);
                    System.out.println("The mass of the object is " + m + "kg");
                }
            } else if (choice3 == 3) {
                System.out.println("Variable to be solved for:");
                System.out.println("1: Frictional Force");
                System.out.println("2: Mass");
                System.out.println("3: Coefficient of friction");
                choice3b = kb.nextInt();
                if (choice3b == 1) {
                    System.out.println("Coefficient of friction = ?");
                    cf = kb.nextDouble();
                    System.out.println("Mass of object = ?");
                    m = kb.nextDouble();
                    f = fricForce(choice3b, cf, m);
                    System.out.println("The frictional force is " + f + "N");
                } else if (choice3b == 2) {
                    System.out.println("Frictional Force = ?");
                    f = kb.nextDouble();
                    System.out.println("Coefficient of friction = ?");
                    cf = kb.nextDouble();
                    m = fricForce(choice3b, f, cf);
                    System.out.println("The mass of the object is " + m + "kg");
                } else if (choice3b == 3) {

                }
            }
        }
    }

    /**
     *
     * @param process
     * @param first
     * @param second
     * @return
     */
    public static double netForce(int process, double first, double second) {
        if (process == 1) {
            return first * second;
        } else {
            return first / second;
        }
    }

    /**
     *
     * @param process
     * @param first
     * @return
     */
    public static double gravForce(int process, double first) {
        if (process == 1) {
            return first * 9.8;
        } else {
            return first / 9.8;
        }
    }

    /**
     *
     * @param friction
     * @param mass
     * @return
     */
    public static double fricForce(int process, double first, double second) {
        if (process == 1) {
            return first * second * 9.8;
        } else {
            return first / (second * 9.8);
        }
    }

    /**
     *
     * @param mass
     * @param acc
     * @return
     */
    public static double netForce(double mass, double acc) {
        double nf = mass * acc;
        return nf;
    }

    /**
     *
     * @param mass
     * @return
     */
    public static double gravForce(double mass) {
        double gf = mass * 9.8;
        return gf;
    }

    /**
     *
     * @param friction
     * @param mass
     * @return
     */
    public static double fricForce(double friction, double mass) {
        double ff = friction * mass * 9.8;
        return ff;
    }

    /**
     *
     * @param a a double that will be multiplied by b
     * @param b a double that will be multiplied by a
     * @return a double that represents a*b
     */
    public static Double multiply(Double a, Double b) {
        double c = a * b;
        return c;
    }

    /**
     *
     * @param a a double that will be divided by b
     * @param b a double that will divide a
     * @return a double that represents a/b
     */
    public static Double divide(Double a, Double b) {
        Double c = a / b;
        return c;
    }

    public static Double subtract(Double a, Double b) {
        Double c = a - b;
        return c;
    }

    public static Double kineticEnergy(Double m, Double v) {
        Double E = 0.5 * m * (v * v);
        return E;
    }
    public static Double kineticMass(Double E, Double v){
        Double m = (2*E)/(v*v);
        return m;
    }
    public static Double kineticVelocity(Double E, Double m){
        Double v;
        v = Math.sqrt((2*E)/m);
        return v;
    }
    public static Double potentialMass(Double E, Double h){
        Double m = E/(h*9.8);
        return m;
    }
}
