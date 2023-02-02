package by.azatzootest.zen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Birds {

    private String fly;
    private String eat;
    private String voice;
    private int wings;

    public Birds(String fly, String eat, String voice, int wings, String color) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
