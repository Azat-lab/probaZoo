package by.azatzootest.zen.herbivores;

import by.azatzootest.zen.Fishes;
import by.azatzootest.zen.enumeration.HerbivoresDiet;
import by.azatzootest.zen.enumeration.Sex;

public class Dolphin extends Fishes {
    private String floats;
    HerbivoresDiet diet;
    Sex sex;

    public Dolphin(String floats, String eat, int flippers) {
        super(floats, eat, flippers);
    }

    @Override
    public String getFloats() {
        return floats;
    }

    @Override
    public void setFloats(String floats) {
        this.floats = floats;
    }

    public HerbivoresDiet getDiet() {
        return diet;
    }

    public void setDiet(HerbivoresDiet diet) {
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
        return "Dolphin{" +
                "swimFast='" + floats + '\'' +
                '}';
    }
}
