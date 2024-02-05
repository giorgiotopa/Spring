package it.epicode.week5day1;

import it.epicode.week5day1.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {

    // Pizze
    @Bean("Margherita")
    public Pizza getMargheritaPizza(){
        Pizza p = new Pizza();
        p.setNome("Margherita");
        p.setPrezzo(4.99);
        p.setCalorie(1104);
        List<Topping> toppings = List.of(getTomato(),getCheese());
        p.setToppingList(toppings);
        return p;
    }
    @Bean("Hawaiian")
    public Pizza getHawaiianPizza(){
        Pizza p = new Pizza();
        p.setNome("Hawaiian");
        p.setPrezzo(6.49);
        p.setCalorie(1024);
        List<Topping> toppings = List.of(getTomato(),getCheese(),getPineapple(),getHam());
        p.setToppingList(toppings);
        return p;
    }
    @Bean("Salame")
    public Pizza getSalamiPizza(){
        Pizza p = new Pizza();
        p.setNome("Salame");
        p.setPrezzo(6.49);
        p.setCalorie(1160);
        List<Topping> toppings = List.of(getTomato(),getCheese(),getSalami());
        p.setToppingList(toppings);
        return p;
    }


    // Bevande
    @Bean("Lemonade")
    public Bevanda getLemonade(){
        Bevanda b = new Bevanda();
        b.setNome("Lemonade");
        b.setPrezzo(1.29);
        b.setCalorie(128);
        b.setQuantita(0.33);
        return b;
    }
    @Bean("Water")
    public Bevanda getWater(){
        Bevanda b = new Bevanda();
        b.setNome("Water");
        b.setPrezzo(1.29);
        b.setCalorie(0);
        b.setQuantita(0.5);
        return b;
    }
    @Bean("Wine")
    public Bevanda getWine(){
        Bevanda b = new Bevanda();
        b.setNome("Wine");
        b.setPrezzo(7.49);
        b.setCalorie(607);
        b.setGradazione(13);
        return b;
    }
    // Toppings
    @Bean("Cheese")
    public Topping getCheese(){
        Topping t = new Topping();
        t.setNome("Cheese");
        t.setCalorie(92);
        t.setPrezzo(0.69);
        return t;
    }
    @Bean("Tomato")
    public Topping getTomato(){
        Topping t = new Topping();
        t.setNome("Tomato");
        t.setCalorie(20);
        t.setPrezzo(0.69);
        return t;
    }
    @Bean("Ham")
    public Topping getHam(){
        Topping t = new Topping();
        t.setNome("Ham");
        t.setCalorie(35);
        t.setPrezzo(0.99);
        return t;
    }
    @Bean("Onion")
    public Topping getOnion(){
        Topping t = new Topping();
        t.setNome("Onion");
        t.setCalorie(22);
        t.setPrezzo(0.69);
        return t;
    }
    @Bean("Pineapple")
    public Topping getPineapple(){
        Topping t = new Topping();
        t.setNome("Pineapple");
        t.setCalorie(24);
        t.setPrezzo(0.79);
        return t;
    }
    @Bean("Salami")
    public Topping getSalami(){
        Topping t = new Topping();
        t.setNome("Salami");
        t.setCalorie(86);
        t.setPrezzo(0.99);
        return t;
    }

    //Menu

    @Bean("Menu")
    public Menu getMenu(){
        Menu m = new Menu();
        List<Pizza> pizzeList = List.of(getMargheritaPizza(),getHawaiianPizza(),getSalamiPizza());
        m.setPizzeList(pizzeList);
        List<Topping> toppingList = List.of(getCheese(),getHam(),getOnion(),getPineapple(),getSalami());
        m.setToppingList(toppingList);
        List<Bevanda> bevandaList = List.of(getLemonade(),getWater(),getWine());
        m.setBevandaList(bevandaList);

        return m;
    }
}
