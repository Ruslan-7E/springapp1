package ru.mukhametshin.springcourse;

public class ClassicalMusic implements Music{

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }

    // destroy метод не вызывается при наличии scope "prototype"
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
