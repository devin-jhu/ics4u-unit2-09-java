/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
 * Vehicle class.
 */

public class Vehicle {

    /**
     * Color.
     */
    private String color;

    /**
    * Max speed.
    */
    private int maxSpeed;

    /**
     * Speed.
     */
    private int speed;

    /**
     * Vehicle Constructor.
     *
     * @param color The vehicles color.
     * @param maxSpeed The vehicles max speed.
     *
     */
    public Vehicle(
        String color,
        int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    /**
     * This returns color.
     *
     * @return returns color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * This gets color.
     *
     * @param setColorNew the new color.
     */
    public void setColor(String setColorNew) {
        this.color = setColorNew;
    }

    /**
     * This sets speed.
     *
     * @param newSpeed the speed.
     */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * This gets speed.
     *
     * @return returns speed.
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * This gets max speed.
     *
     * @return returns max speed.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**
     * Acceleration function
     * This calculates the acceleration speed.
     *
     * @param accelerationPower the acceleration power.
     * @param accelerationTime the acceleration time.
     *
     */

    public void accelerate(int accelerationPower, int accelerationTime) {
        this.speed = (accelerationPower * accelerationTime) + this.speed;

        if (speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    /**
     * Breaking function
     * This calculates the breaking speed.
     *
     * @param breakPower the breaking power.
     * @param breakTime the break time.
     *
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed = this.speed - (breakPower * breakTime);

        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
