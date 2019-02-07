package task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class App01 {
    public static void main(String[] args) {
        try(AbstractApplicationContext context = new AnnotationConfigApplicationContext(App01.class)){
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
