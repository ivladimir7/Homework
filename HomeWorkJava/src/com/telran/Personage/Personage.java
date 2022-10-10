package com.telran.Personage;

public class Personage {
    private String character;
    private String strength;
    private double iq;

    public Personage(String character, String strength, int iq) {
        this.character = character;
        this.strength = strength;
        this.iq = iq;
    }


    @Override
    public String toString() {
        return "Personage{" +
                "character='" + character + '\'' +
                ", strength='" + strength + '\'' +
                '}';
    }
    public void MainCharacter(String character) {
        System.out.println(character);
    }

    public String getCharacter() {
        return character;
    }
    public String getStrength() {
        return strength;
    }
    public double getiq() {
        return iq;
}
}