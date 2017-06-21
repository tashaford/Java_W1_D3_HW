package example.codeclan.com.godzilla;

/**
 * Created by natashaford on 21/06/2017.
 */

public class Runner {
    public static void main(String[] args){
        Godzilla zilla = new Godzilla("Godzilla", 100, 50);
        KingKong kong = new KingKong("King Kong", 120, 30);
        Skyscraper skyscraper = new Skyscraper("building", 30);
        Tank tank = new Tank("vehicle", 60);

        System.out.println("Here comes " + zilla.getName() + " and " + kong.getName() + "! Run!!");

        System.out.println(zilla.getName() + " has just hit a " + skyscraper.getType() + ".");

        System.out.println(skyscraper.destroy());

        System.out.println(kong.getName() + " has just hit a " + tank.getType() + ".");

        System.out.println(kong.getName() + " has just hit the " + tank .getType() + " again!. " + tank.destroy());

        System.out.println("The city has been destroyed by " + zilla.getName() + " and " + kong.getName() + ".");
    }
}
