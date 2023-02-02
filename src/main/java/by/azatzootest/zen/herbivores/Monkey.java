package by.azatzootest.zen.herbivores;

import by.azatzootest.zen.Animals;
import by.azatzootest.zen.enumeration.HerbivoresDiet;
import by.azatzootest.zen.enumeration.Sex;

public class Monkey extends Animals {
    private String walksOnItsHindLegs;
    HerbivoresDiet diet;
    Sex sex;

    public Monkey(String moves, String voice, String eat, int paws) {
        super(moves, voice, eat, paws);
    }

    public String getWalksOnItsHindLegs() {
        return walksOnItsHindLegs;
    }

    public void setWalksOnItsHindLegs(String walksOnItsHindLegs) {
        this.walksOnItsHindLegs = walksOnItsHindLegs;
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
        return "Monkey{" +
                "walksOnItsHindLegs='" + walksOnItsHindLegs + '\'' +
                '}';
    }
}
