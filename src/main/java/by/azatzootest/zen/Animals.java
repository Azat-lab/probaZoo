package by.azatzootest.zen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Animals {

    private String moves;
    private String voice;
    private String eat;
    private int paws;

    public Animals(String moves) {
        if(this.moves.isEmpty()){
            this.moves = moves;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
