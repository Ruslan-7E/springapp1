package ru.mukhametshin.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

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
