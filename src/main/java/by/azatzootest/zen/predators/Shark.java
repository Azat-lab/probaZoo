package by.azatzootest.zen.predators;

import by.azatzootest.zen.Fishes;
import by.azatzootest.zen.enumeration.PredatorsDiet;
import by.azatzootest.zen.enumeration.Sex;

public class Shark extends Fishes {
    private String swimInSaltWatter;
    PredatorsDiet diet;
    Sex sex;

    public Shark(String floats, String eat, int flippers) {
        super(floats, eat, flippers);
    }

    public String getSwimInSaltWatter() {
        return swimInSaltWatter;
    }

    public void setSwimInSaltWatter(String swimInSaltWatter) {
        this.swimInSaltWatter = swimInSaltWatter;
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
        return "Shark{" +
                "swimInSaltWatter='" + swimInSaltWatter + '\'' +
                '}';
    }
}
