public class TrainCar {
    private int capacity;

    public TrainCar(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}


class Locomotive extends TrainCar {
    public Locomotive(int capacity) {
        super(capacity);
    }
}


class PassengerCar extends TrainCar {
    public PassengerCar(int capacity) {
        super(capacity);
    }
}


class FreightCar extends TrainCar {
    public FreightCar(int capacity) {
        super(capacity);
    }
}


class Train {
    private TrainCar[] car;

    public Train(TrainCar[] cars) {
        this.car = cars;
    }


    public int SumCap() {
        int totalCapacity = 0;
        for (TrainCar car : car) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }
}

class TrainAndCar {
    public static void main(String[] args) {
        Locomotive locomotive = new Locomotive(65);
        PassengerCar passengerCar1 = new PassengerCar(68);
        PassengerCar passengerCar2 = new PassengerCar(90);
        FreightCar freightCar1 = new FreightCar(185);


        TrainCar[] trainCars = {locomotive, passengerCar1, passengerCar2, freightCar1};
        Train myTrain = new Train(trainCars);


        System.out.println("Total Carrying Capacity of the Train: " + myTrain.SumCap());
    }
}