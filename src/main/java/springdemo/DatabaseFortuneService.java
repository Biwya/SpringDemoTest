package springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    public String getFortune() {
        return "Your DB looks great!";
    }
}
