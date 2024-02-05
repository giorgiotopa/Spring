package it.epicode.week5day1.bean;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pizza extends ElementiMenu{

    private List<Topping> toppingList;
}
