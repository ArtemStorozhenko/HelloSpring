package task1;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RndConsoleWriter {
    @EventListener
    public void print(RndInfo rndInfo){
        System.out.println("Rnd " + rndInfo.getGenerationDate().toString() + " " + rndInfo.getGeneratedValue());
    }
}
