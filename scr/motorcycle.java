import javax.swing.*;

public class motorcycle {
    private String color_A;
    private Frame frame_A;
    private Wheel[] wheels;



    public motorcycle(String color1, Material frameMaterial, double wheelSize){
        this.color_A = color1;
        this.frame_A = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);

    }

    public String getColor(){
        return this.color_A;
    }
    public Material getFrameMaterial(){
        return frame_A.getMaterial();
    }
    public double getWheelSize(){
        return wheels[0].getSize();
    }

}