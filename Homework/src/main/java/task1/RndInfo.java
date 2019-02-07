package task1;

import java.util.Date;

public class RndInfo {
    private Date generationDate;
    private int generatedValue;

    public RndInfo(Date generationDate, int generatedValue){
        this.generationDate = generationDate;
        this.generatedValue = generatedValue;
    }

    public Date getGenerationDate() {
        return generationDate;
    }

    public int getGeneratedValue() {
        return generatedValue;
    }
}