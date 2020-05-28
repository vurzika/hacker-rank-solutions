package thirtydaysofcoding.day20;


import static thirtydaysofcoding.day20.HairColor.BLACK;
import static thirtydaysofcoding.day20.HairColor.PINK;

public class Person {

    HairColor hairColor = BLACK;

    public Person() {
    }

    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;

        peterParker.hairColor = PINK;

        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spiderman: " + spiderMan.hairColor);
    }
}
