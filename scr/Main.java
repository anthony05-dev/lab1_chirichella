public class Main {
    public static void main(String[] args){
        motorcycle m1 = new motorcycle("red", Material.ALUMINIUM, 22);
        System.out.println(("Motorcycle Color - " + m1.getColor()));
        System.out.println(("Frame Material - " + m1.getFrameMaterial()));
        Brand bikeBrand1 = new Brand("Kawasaki");
        System.out.println("Motorcycle Brand - " + bikeBrand1.getBrand());
        Engine myEngine = new Engine("800", "300");
        System.out.println("Engine CC - " + myEngine.getCC());
        System.out.println("Engine HP - " + myEngine.getHP());
        System.out.println("Wheel size: " + m1.getWheelSize());
        System.out.println(" ");

        motorcycle m2 = new motorcycle("blue", Material.TITANIUM, 19);
        System.out.println(("Motorcycle Color - " + m2.getColor()));
        System.out.println(("Frame Material - " + m2.getFrameMaterial()));
        Brand bikeBrand2 = new Brand("Kawasaki");
        bikeBrand2.setBrand("BMW");
        System.out.println("Motorcycle Brand - " + bikeBrand2.getBrand());
        myEngine.setHP("600");
        myEngine.setCC("500");
        System.out.println("Engine CC - " + myEngine.getCC());
        System.out.println("Engine HP - " + myEngine.getHP());
        System.out.println("Wheel size: " + m2.getWheelSize());
        System.out.println(" ");

        motorcycle m3 = new motorcycle("green", Material.CARBONFIBER, 23);
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
