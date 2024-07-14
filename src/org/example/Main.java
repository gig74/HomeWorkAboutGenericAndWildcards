package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Для задания 3
        Stable<Horse> stable = new Stable<>();

        Mustang mustang = new Mustang();
        stable.addHorse(mustang);

        Pony pony = new Pony();
        stable.addHorse(pony);

        List<Mustang> wildMustangs = new ArrayList<>();
        wildMustangs.add(new Mustang());
        wildMustangs.add(new Mustang());

        stable.addHorses(wildMustangs);
        // Для задания 4
        //Stable<Horse> stable = new Stable<>();
        Stable<Animal> animalsStable = new Stable<>();
        moveHorses(stable, animalsStable);
    }

    public static <T> void moveHorses(Stable<? extends T> source, Stable<? super T> destination){
        destination.addHorses(source.getHorses());
    }

}