package it.epicode.week5day1.bean;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ElementiMenu {
    private String nome;
    private int calorie;
    private double prezzo;

    @Override
    public String toString() {
        return     nome +
                ": calorie=" + calorie +
                ": prezzo=" + prezzo
                ;
    }
}
