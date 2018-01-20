package com.example.user.inclassprojectweektwoo;

/**
 * Created by user on 1/19/2018.
 */

public class Tiger extends Animal {


    private static int count = 0;

    public Tiger ()
    {
        count ++;

    }

    @Override
    void animaSleeping() {

        System.out.println("***** Sleeping *******");
        energy = energy + 5;
        System.out.println("Donkey level energy: " + energy);
    }

    @Override  /// done
    void animaEating(String food) {


        if ( food.equalsIgnoreCase("grain"))
        {
            System.out.println(" Tigers can't eat grain because they have sensitive digestive systems.");

        }else {

            System.out.println("Donkey is making a sound");
            energy = energy + 5;
            System.out.println("Donkey level energy: " + energy);
        }

    }


}
