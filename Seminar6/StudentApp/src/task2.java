/**
 * 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
 * public class SpeedCalculation {
 * public double calculateAllowedSpeed(Vehicle vehicle) {
 * if (vehicle.getType().equalsIgnoreCase("Car")) {
 * return vehicle.getMaxSpeed() * 0.8;
 * } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
 * return vehicle.getMaxSpeed() * 0.6;
 * }
 * •
 * return 0.0;
 * }
 * }
 * public class Vehicle {
 * int maxSpeed;
 * String type;
 * public Vehicle(int maxSpeed, String type) {
 * this.maxSpeed = maxSpeed;
 * this.type = type;
 * }
 * public int getMaxSpeed() {
 * return this.maxSpeed;
 * }
 * public String getType() {
 * return this.type;
 * }
 * }
 * •
 * Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle),
 * напишите метод calculateAllowedSpeed(). Использование этого метода позволит
 * сделать класс SpeedCalculation соответствующим OCP
 */

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getType();
    }
}

public class Vehicle {
    int maxSpeed;
    double type = 1;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public Double getType() {
        return this.type;
    }
}

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
        super.type = 0.8;
    }

}

public class Bus extends Vehicle {

    public Bus(int maxSpeed) {
        super(maxSpeed);
        super.type = 0.6;
    }

}