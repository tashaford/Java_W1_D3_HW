package example.codeclan.com.godzilla;

public class KingKong extends Kaiju implements Attack {

    public KingKong(String name, int healthValue, int destructiveForce){
        super(name, healthValue, destructiveForce);
    }

    public String roar() {
        return "Come at me!!!";
    }

    public void attack(HumanConstructs construct) {
        construct.healthValue -= destructiveForce;
    }
}
