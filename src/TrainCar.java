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
    private int numberofpassengers;

    public Train(TrainCar[] cars,  int numberofpassengers ) {
        this.car = cars;
        this.numberofpassengers = numberofPassengers;
    }
    public int getnumberofpassengers(){
        return  numberofpassengers;
    }
    public void setNumberofpassengers(int numberofpassengers){
        this.numberofpassengers = numberofpassengers;
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
        Train passengercar = new Train(50);

        TrainCar[] trainCars = {locomotive, passengerCar1, passengerCar2, freightCar1};
        Train myTrain = new Train(trainCars);

        int passengerInpassengercar = passengercar.getnumberofpassengers();
        System.out.println("Количестово пассажирова в вагоне :" + passengerInpassengercar);
        passengercar.setNumberofpassengers(90);
        passengerInpassengercar = passengercar.getnumberofpassengers();
        System.out.println("Обновление количество пассажиров в пассажирском вагоне" + passengerInpassengercar);

        System.out.println("Total Carrying Capacity of the Train: " + myTrain.SumCap());
    }
}



