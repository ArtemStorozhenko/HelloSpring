package task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class RndGenerator {
    @Autowired
    private ApplicationEventPublisher publisher;
    @Scheduled(initialDelay = 1, fixedDelay = 1000)
    public void generateRandom(){
        publisher.publishEvent(new RndInfo(new Date(), ThreadLocalRandom.current().nextInt(0, 100)));
    }
}
