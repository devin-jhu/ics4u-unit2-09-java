/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
 * Truck class.
 */

public class Truck extends Vehicle {

    /**
    * License plate.
    */
    private String licensePlate;

    /**
     * Truck constructor.
     *
     * @param color this is the color.
     * @param licensePlate this is the license plate.
     * @param maxSpeed this is the max speed.
     */
    public Truck(String color, String licensePlate, int maxSpeed) {
        super(color, maxSpeed);
        this.licensePlate = licensePlate;
    }

    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * This sets the licensePlate.
     *
     * @param newLicensePlate this is the new variable.
     */
    public void setLicensePlate(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * This is the air pressure breaking method.
     *
     * @param airPressure this is the air pressure.
     */
    public void provideAir(int airPressure) {
        super.setSpeed(super.getSpeed() - airPressure / 2);

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }

    /**
     * This is the status method.
     */
    public void status() {
        System.out.println(" ---> Speed: " + super.getSpeed());
        System.out.println(" ---> maxSpeed: " + super.getMaxSpeed());
        System.out.println(" ---> Color: " + super.getColor());
        System.out.println(" ---> licensePlate: " + this.getLicensePlate());
    }
}
