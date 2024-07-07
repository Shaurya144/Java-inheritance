class Vehicle {
    protected String brand = "Toyato"; // Vehicle attribute

    public void honk() { //
        System.out.println("Beep!! Beep!!");
    }
}

class Car extends Vehicle {

    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.modelName + " " + myCar.brand);
    }
}