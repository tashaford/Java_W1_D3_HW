package example.codeclan.com.godzilla;

public class Godzilla extends Kaiju implements Attack {

    public Godzilla(String name, int healthValue, int destructiveForce){
        super(name, healthValue, destructiveForce);
    }

    public String roar() {
        return "Roooooaooooaaaaaaaaar!!";
    }

    public void attack(HumanConstructs construct){
        construct.healthValue -= destructiveForce;
    }
}
