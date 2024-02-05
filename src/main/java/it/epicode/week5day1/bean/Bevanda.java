package it.epicode.week5day1.bean;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bevanda extends ElementiMenu{

    private double quantita;
    private double gradazione;

    @Override
    public String toString() {
        return "Bevanda{" +
                "quantita=" + quantita + "l" +
                ", gradazione=" + gradazione + "%" +
                '}';
    }
}





