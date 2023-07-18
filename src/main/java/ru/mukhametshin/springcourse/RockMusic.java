package ru.mukhametshin.springcourse;

public class RockMusic implements Music{

    // create init & destroy methods
    public void doMyInit1() {
        System.out.println("Doing my initialization-1");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    public void doMyDestroy1() {
        System.out.println("Doing my destruction-1");
    }
}
