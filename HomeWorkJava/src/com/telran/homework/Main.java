

package com.telran.homework;

import com.telran.Personage.Personage;
import com.telran.genre.Genre;

public class Main {

    public static void main(String[] args) {
        Personage LittleRedRidingHood = new Personage("Girl", "low", 110);
        Personage Wolf = new Personage("Wolf", "high", 80);
        Personage Grandmother = new Personage("Old Woman", "low", 90);
        Genre Book = new Genre ("Fairy", "Fable");

        Book.PlaceOfEvents("This is the Story", "of" );
        LittleRedRidingHood.MainCharacter("Little Red Riding Hood");

        System.out.println(Book.getBook());
        System.out.println(LittleRedRidingHood.getCharacter());

        Personage Woodsman = new Personage("Man", "high", 90);
        System.out.println("Strongest"+ " " + Woodsman.toString());
    }
}