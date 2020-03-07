package springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "A",
            "B",
            "C"
    };

    private Random random = new Random();

    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
