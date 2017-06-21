package example.codeclan.com.godzilla;

public class Skyscraper extends HumanConstructs implements Destroyable {

    public Skyscraper(String type, int healthValue){
        super(type, healthValue);
    }

    public String destroy(){
        return "Kabooooooooom";
    }

}
