package com.example.user.inclassprojectweektwoo.Encoding;

/**
 * Created by user on 1/19/2018.
 */

public class Encoing {


    public static void main(String[] args) {

        String text = "acp";


       String encoedtext =  ChangeText(text);
        System.out.println("\n ****** " + encoedtext);

    }

    static String ChangeText(String text) {

        char [] charrArray = new   char [text.length()];
        for (int i = 0; i < text.length(); i++) {

            int difference = 0;

            char c = text.charAt(i);
/////     small charcter check
            if ( c >= 'a' && c <= 'z') {


                difference = c - 'a';
                difference =  'z' - difference;
                charrArray[i]= (char)difference;


            }
 ///// cap character check
            else if (c >= 'A' && c <= 'Z') {
                System.out.println("\nCap " + c);
                difference = c - 'A';
                difference =  'Z' - difference;
                charrArray[i]= (char)difference;
            }
 ///// non  like  character save
            else {

                charrArray[i] =  c;


            }


        }


        return new String (charrArray);
    }


}