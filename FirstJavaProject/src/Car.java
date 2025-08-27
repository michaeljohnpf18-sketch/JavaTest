public class Car extends Vehicle {
     private String modelName = "Mustang"; // Car attribute

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk(); // Call the honk() method from the parent
        System.out.println(myCar.brand + " " + myCar.modelName +" | Color:"+" ("+myCar.PrimaryColor+" & "+myCar.SecondaryColor+")"); // Display inherited brand and Car's model
    }
}
