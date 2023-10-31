package ru.mukhametshin.springcourse;

import org.springframework.stereotype.Component;

@Component("tranceMusicBean")
public class TranceMusic implements Music{
    @Override
    public String getSong() {
        return "Sun and Moon";
    }
}
