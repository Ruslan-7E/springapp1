package ru.mukhametshin.springcourse;

public class ClassicalMusic implements Music{

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
