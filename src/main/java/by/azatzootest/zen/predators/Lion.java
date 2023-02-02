package by.azatzootest.zen.predators;

import by.azatzootest.zen.Animals;
import by.azatzootest.zen.enumeration.PredatorsDiet;
import by.azatzootest.zen.enumeration.Sex;

public class Lion extends Animals {

    private String moves;

    PredatorsDiet diet;
    Sex sex;
    public Lion(String run, String voice, String eat, int paws) {
        super(run, voice, eat, paws);
        this.moves = run;
    }

    @Override
    public String getMoves() {
        return moves;
    }

    @Override
    public void setMoves(String run) {
        if(moves.isEmpty())
        this.moves = run;
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
}
