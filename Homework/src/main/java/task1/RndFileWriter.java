package task1;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class RndFileWriter {

    private File tempFile;
    @PostConstruct
    private void init() {
        try {
            tempFile = File.createTempFile("task01", ".txt");
            System.out.println(tempFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Async
    @EventListener
    public void print(RndInfo rndInfo){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile, true));
            writer.write("Rnd " + rndInfo.getGenerationDate().toString() + " " + rndInfo.getGeneratedValue());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
