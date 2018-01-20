package com.example.user.inclassprojectweektwoo;

/**
 * Created by user on 1/19/2018.
 */

public abstract class Animal {

    int energy = 0;




    void animaSleeping() {
        System.out.println("***** Sleeping *******");
        energy = energy + 10;
        System.out.println(" gained Energy 10 + now you have "+energy);
    }



    void animaEating(String food) {
        System.out.println("***** Eating *******");
        energy = energy + 5;
        System.out.println(" gained Energy 5+ now you have "+energy);
    }


    void animalMakingSound() {

        System.out.println("***** Making Sound *******");
        energy = energy - 3;

        System.out.println("  lost energy -3  : now you have "+energy);
    }
}
