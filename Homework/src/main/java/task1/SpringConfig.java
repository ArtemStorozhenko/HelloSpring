package task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
@EnableScheduling
public class SpringConfig {
    @Bean
    Executor taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        // always set the poolsize
        scheduler.setPoolSize(5);
        // for logging add a threadNamePrefix
        scheduler.setThreadNamePrefix("myTaskScheduler-");
        // wait for completion of the tasks
        scheduler.setWaitForTasksToCompleteOnShutdown(true);
        scheduler.setAwaitTerminationSeconds(3000);
        return scheduler;
    }
}
