package by.azatzootest.zen.herbivores;

import by.azatzootest.zen.Birds;
import by.azatzootest.zen.enumeration.HerbivoresDiet;
import by.azatzootest.zen.enumeration.Sex;

public class Parrot extends Birds {

    private String color;
    HerbivoresDiet diet;
    Sex sex;

    public Parrot(String fly, String eat, String voice, int wings, String color) {
        super(fly, eat, voice, wings, color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Parrot{" +
                "color='" + color + '\'' +
                '}';
    }
    String getDietFor() throws Exception{
        throw new Exception("Error don't give it!!!");
    }
}
