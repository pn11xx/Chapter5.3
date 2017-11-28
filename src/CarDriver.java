public class CarDriver {
    public static void main(String [] args){
        Car myCar;
        Car hisCar;
        Car herCar;

        myCar = new Car("White", "240", "2.0", "Land Rover");
        hisCar = new Car("Black","400","3.5","Honda");
        herCar = new Car("Pink", "300", "2.5", "Volks");

        System.out.println(myCar.toString());
        System.out.println(hisCar.toString());
        System.out.println(herCar.toString());

        myCar.setColor("Blue");
        hisCar.setColor("Blue");
        herCar.setColor("Blue");

        System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " +  myCar.getEngineSize() + " " + myCar.getMake());
        System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " +  hisCar.getEngineSize() + " " + hisCar.getMake());
        System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " +  herCar.getEngineSize() + " " + herCar.getMake());


    }


}
