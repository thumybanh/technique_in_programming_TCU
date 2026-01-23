/**
 * This program will display the speed of the car after calling the accelerate method five times and then calling the
 * brake method 5 times.
 *
 * @author mybanh
 * @version 1.0
 * @since 2026-01-14
 *
 */

public class Car {
    /** The model year of the vehicle. */
    private int yearModel;
    /** The make (manufacturer) of the vehicle. */
    private String make;
    /** The current speed of the vehicle. */
    private int speed;

    /**
     * Constructs a Car object with the specified year model and make.
     * The speed is initialized to 0 inside the constructor.
     *
     * @param y the model year of the car
     * @param m the manufacturer of the car
     */
    public Car(int y, String m) {
        yearModel = y;
        make = m;
        speed = 0;
    }

    public void setYearModel(int y) {
        yearModel = y;
    }
    public void setMake(String m){
        make = m;
    }
    public void setSpeed(int s){
        speed = s;
    }

    /**
     *  Returns the year model of the vehicle.
     * @return the year model
     */
    public int getYearModel(){
        return yearModel;
    }
    /**
     * Returns the make of the vehicle.
     * @return the vehicle make
     */
    public String getMake(){
        return make;
    }
    /**
     * Returns the current speed of the vehicle.
     * @return the current speed
     */
    public int getSpeed(){
        return speed;
    }

    /**
     * Increases the current speed of the car by 5 units
     */
    public void accelerate(){
       speed += 5;
    }
    /**
     * Decreases the current speed of the car by 5 units
     */
    public void brake(){
        speed -= 5;
    }

    /**
     * The main body of the program.
     * Creates a Car object, accelerates it five times, then brakes it five times,
     * displaying the car's speed after each operation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args){
        // Create a new object car1 with an example of the year model and its manufacturer.
        Car car1 = new Car(2019, "Toyota");

        // Accelerate the car five times
        for(int i = 1; i <= 5; i++){
            car1.accelerate();
            System.out.println(car1.getSpeed());
        }

        // Brake the car five times
        for(int i = 1; i <= 5; i++){
            car1.brake();
            System.out.println(car1.getSpeed());
        }
    }
}
