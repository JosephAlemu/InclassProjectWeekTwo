package com.example.user.inclassprojectweektwoo;

/**
 * Created by user on 1/19/2018.
 */

public class Monkey extends Animal{


    int energy = 0;
    @Override
    public int animaEat() {
        return  energy = energy+2;
    }

    @Override
    public int animaSpeak() {
        return energy = energy -4;
    }
}
