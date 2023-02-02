package by.azatzootest.zen.predators;

import by.azatzootest.zen.Birds;
import by.azatzootest.zen.enumeration.PredatorsDiet;
import by.azatzootest.zen.enumeration.Sex;

public class Eagle extends Birds {

    private String soarsAcrossTheSky;
    PredatorsDiet diet;
    Sex sex;

    public Eagle(String fly, String eat, String voice, int wings, String soarsAcrossTheSky) {
        super(fly, eat, voice, wings);
        this.soarsAcrossTheSky = soarsAcrossTheSky;
    }

    public String getSoarsAcrossTheSky() {
        return soarsAcrossTheSky;
    }

    public void setSoarsAcrossTheSky(String soarsAcrossTheSky) {
        this.soarsAcrossTheSky = soarsAcrossTheSky;
    }

    public PredatorsDiet getDiet() {
        return diet;
    }

    public void setDiet(PredatorsDiet diet) {
        this.diet = diet;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "soarsAcrossTheSky='" + soarsAcrossTheSky + '\'' +
                '}';
    }
}
