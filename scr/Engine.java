public class Engine {

    private String cc_A;

    private String hp_A;

    public Engine(String cc1, String hp1){
        this.cc_A = cc1;
        this.hp_A = hp1;
    }

    public void setCC(String cc2){
        this.cc_A = cc2;
    }

    public String getCC(){
        return this.cc_A;   //returns proper value
    }

    public void setHP(String hp2){
        this.hp_A = hp2;
    }

    public String getHP(){
        return this.hp_A;
    } //gets hp

}
