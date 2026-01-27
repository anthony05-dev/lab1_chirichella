/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Anthony Chirichella
 * Date Developed: 1/26
 * Last Date Changed: 1/27
 * Rev: 9

 */




public class Main {
    public static void main(String[] args){

        motorcycle m1 = new motorcycle("red", Material.ALUMINIUM, 22); //sets up first motorcycle
        System.out.println(("Motorcycle Color - " + m1.getColor()));
        System.out.println(("Frame Material - " + m1.getFrameMaterial()));
        Brand bikeBrand1 = new Brand("Kawasaki");
        System.out.println("Motorcycle Brand - " + bikeBrand1.getBrand());
        Engine myEngine = new Engine("800", "300");
        System.out.println("Engine CC - " + myEngine.getCC());
        System.out.println("Engine HP - " + myEngine.getHP());
        System.out.println("Wheel size: " + m1.getWheelSize());
        System.out.println(" ");

        motorcycle m2 = new motorcycle("blue", Material.TITANIUM, 19); //sets up second motorcycle
        System.out.println(("Motorcycle Color - " + m2.getColor()));
        System.out.println(("Frame Material - " + m2.getFrameMaterial()));
        Brand bikeBrand2 = new Brand("Kawasaki");   //brand
        bikeBrand2.setBrand("BMW");
        System.out.println("Motorcycle Brand - " + bikeBrand2.getBrand());
        myEngine.setHP("600");  //sets hp and cc
        myEngine.setCC("500");
        System.out.println("Engine CC - " + myEngine.getCC()); //prints cc and hp
        System.out.println("Engine HP - " + myEngine.getHP());
        System.out.println("Wheel size: " + m2.getWheelSize());
        System.out.println(" ");

        motorcycle m3 = new motorcycle("green", Material.CARBONFIBER, 23); //sets up third motorcycle
        System.out.println(("Motorcycle Color - " + m3.getColor()));
        System.out.println(("Frame Material - " + m3.getFrameMaterial()));
        Brand bikeBrand3 = new Brand("Harley");
        System.out.println("Motorcycle Brand - " + bikeBrand3.getBrand());
        myEngine.setHP("1000");
        myEngine.setCC("700");
        System.out.println("Engine CC - " + myEngine.getCC());
        System.out.println("Engine HP - " + myEngine.getHP());
        System.out.println("Wheel size: " + m3.getWheelSize());


    }
}
