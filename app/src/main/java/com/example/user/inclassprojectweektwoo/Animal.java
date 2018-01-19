package com.example.user.inclassprojectweektwoo;

/**
 * Created by user on 1/19/2018.
 */

public  class Animal {


    int energy = 0;



    public int animaSleep() {

        energy += 10;
        return energy;
    }

    public int animaEat() {

        energy += 5;
        return energy;
    }

    public int animaSpeak() {
        energy -= 3;
        return energy;
    }
}
