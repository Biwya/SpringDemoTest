package springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    public String getFortune() {
        return "GET some fortune from here!";
    }
}
