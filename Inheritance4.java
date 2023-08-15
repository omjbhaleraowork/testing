final class Bus {
    void show() {
        System.out.print("Generic Bus. ");
    }
}

class ElectricBus extends Bus {
    void show() {
        System.out.println("Electric Bus. ");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        ElectricBus eb = new ElectricBus();
        eb.show();
    }
}