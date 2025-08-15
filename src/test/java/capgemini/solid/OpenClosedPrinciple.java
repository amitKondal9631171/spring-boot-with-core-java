package capgemini.solid;

/**
 * The open-closed principle states that according to new requirements the module
 * should be open for extension but closed for modification.
 * The extension allows us to implement new functionality to the module.
 */

class Vehicle {

    double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

}

class Car extends Vehicle{

}
class Bike extends Vehicle{

}
class Truck extends Vehicle{

}

/**
 * If we want to add another subclass named Truck, simply,
 * we add one more if statement that violates the open-closed principle.
 * The only way to add the subclass and achieve the goal of principle by
 * overriding the vehicleNumber() method
 */

class VehicleInfo {

    /**
     * This instance of implementation is wrong as we need to add the instance type every time
     * even though it can work without it also. This is what developer has to think about this
     * principal before doing any implementation
     *
     * Below implementation can simply written as
     * return vcl.getNumber(); as no need to add instance of check
     */
    public double vehicleNumber(Vehicle vcl) {
        if (vcl instanceof Car) {
            return vcl.getNumber();
        }
        if (vcl instanceof Bike) {
            return vcl.getNumber();
        }
        return 0.0;
    }
}


class VehicleInfoNew{
    public double vehicleNumber(Vehicle vcl) {
        return vcl.getNumber();
    }
}


public class OpenClosedPrinciple {


    public static void main(String[] args) {

        Vehicle car = new Car();
        car.setNumber(123);
        Vehicle bike = new Bike();
        bike.setNumber(456);
        Vehicle truck = new Truck();
        truck.setNumber(789);

        VehicleInfo info = new VehicleInfo();
        System.out.println(info.vehicleNumber(car));
        System.out.println(info.vehicleNumber(bike));
        System.out.println(info.vehicleNumber(truck));//will return 0.0 as no implementation for truck

        System.out.println("=======================");

        VehicleInfoNew infoNew = new VehicleInfoNew();
        System.out.println(infoNew.vehicleNumber(car));
        System.out.println(infoNew.vehicleNumber(bike));
        System.out.println(infoNew.vehicleNumber(truck));

    }

}
