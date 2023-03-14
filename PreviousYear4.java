
interface Motorbike {
    public void speed();
}

interface Cycle {
    public void distance();
}

class Car {
    public void display() {
        System.out.println("This is a Car.");
    }
}

class TwoWheeler extends Car implements Motorbike, Cycle {

    public void speed() {
        System.out.println("Motorbike speed is 90km/hr.");
    }

    public void distance() {
        System.out.println("Cycle distance is 50 meters.");
    }
}

public class PreviousYear4 {
    public static void main(String[] args) {

        TwoWheeler tw = new TwoWheeler();

        tw.display();
        tw.speed();
        tw.distance();
    }
}
