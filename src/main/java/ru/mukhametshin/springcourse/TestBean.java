package ru.mukhametshin.springcourse;

public class TestBean {
    private String name; // передаем значение сюда из контекста <constructor-arg value="Ruslan"/>

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
