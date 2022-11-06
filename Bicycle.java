/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
 * This is the Bicycle class.
 */

public class Bicycle extends Vehicle {
    /**
     * This is the cadence.
     */
    private int cadence;

    /**
     * This is the constructor for Bicycle.
     *
     * @param color this is the color.
     * @param maxSpeed this is the maxSpeed.
     *
     */
    public Bicycle(String color, int maxSpeed) {
        super(color, maxSpeed);
    }

    /**
     * This sets the appliedPower.
     *
     * @param appliedPower this is the new variable.
     */
    public void accelerate(int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * Cadence.
     *
     * @return this returns the cadence.
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * This is the ringbell.
     */
    public void ringBell() {
        System.out.println("ding ding");
    }

    /**
     * This is the status function.
     */
    public void status() {
        System.out.println(" ---> Speed: " + super.getSpeed());
        System.out.println(" ---> MaxSpeed: " + super.getMaxSpeed());
        System.out.println(" ---> Color: " + super.getColor());
        System.out.println(" ---> Cadence: " + this.getCadence());
    }
}
