package com.example.user.inclassprojectweektwoo.LettersCount;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by user on 1/19/2018.
 */

public class LetterCount {


    public static void main(String[] args) {
        letterCount("APPLee");
    }


    private  static void  letterCount(String text)
    {
        int prev;

        String  lowerText= text.toLowerCase();
        Hashtable<Character,Integer> hashtable =new Hashtable<Character,Integer>();

        for (int i = 0; i < lowerText.length(); i++)
        {
            if ( hashtable.containsKey(lowerText.charAt(i)))
            {

                prev = hashtable.get(lowerText.charAt(i))+1;

                hashtable.put(lowerText.charAt(i),prev);

            }
            else
            {

                hashtable.put(lowerText.charAt(i),1);
            }
        }


        char key;
        Enumeration enumkey = hashtable.keys();
        while(enumkey.hasMoreElements()) {
            key =  (char)enumkey.nextElement();
            System.out.println(key+ ": " + hashtable.get(key));
        }

    }

}
