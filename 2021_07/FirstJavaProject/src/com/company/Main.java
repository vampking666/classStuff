package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    /* modifiers are basically things that give access to classes, fields, or methods. static is a different kind of modifier. We can use fields without stating the class. Void means that after the program runs, nothing else should follow. Void is a return-type. main() is the name of the function, and inside of it's parenthesis is the arguments. */
    public static void main(String[] args) {

        System.out.println(titleCase("i am a developer")); //printing it to console

    }

    /*  */
    public static String titleCase(String input) {

        //split string into array of strings
        //iterate
        //join array back into one string

        //let splitInput = input.split(" ");
        String[] splitInput = input.split(" ");

        for (int i =0; i < splitInput.length; i++) {
            //System.out.println(splitInput[i].toUpperCase().substring(0, 1) + "" + splitInput[i].toLowerCase().substring(1)); /*pushing each word in the string from the main method and making each first letter a capital*/
            splitInput[i] = splitInput[i].toUpperCase().substring(0, 1) + "" + splitInput[i].toLowerCase().substring(1); /*assigning the previous code to the splitInput variable splitInput[i] = i + " ";*/

        }
        //System.out.println(splitInput);
        String newStr = "";
        for (int i = 0; i < splitInput.length; i++) {
            //System.out.println(splitInput[i]);
            newStr += splitInput[i] + " "; // putting it together
        }

        return newStr;
    }

}