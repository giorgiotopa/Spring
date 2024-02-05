package it.epicode.week5day1.bean;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    List<Pizza> pizzeList;
    List<Topping> toppingList;
    List<Bevanda> bevandaList;
}
