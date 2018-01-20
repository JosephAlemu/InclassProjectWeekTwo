package com.example.user.inclassprojectweektwoo;

/**
 * Created by user on 1/19/2018.
 */

public class Monkey extends Animal{


    private static int count = 0;

    public Monkey ()
    {
        count ++;

    }


    @Override
    void animaEating(String food) {
        System.out.println("***** Eating *******");
        energy = energy + 2;
        System.out.println("Donkey level energy: " + energy);
    }

    @Override
    void animalMakingSound() {

        System.out.println("***** Making Sound *******");
        energy = energy -4;
        System.out.println("Donkey level energy: " + energy);
    }


    void play() {

        if (energy < -8) {

            System.out.println("Monkey is not playing");
            System.out.println("Monkey is too tired");

        } else {
            System.out.println("Monkey is playing");
            System.out.println("Oooo Oooo Oooo");
        }

    }
}
