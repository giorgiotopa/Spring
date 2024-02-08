package it.epicode.w5d2p.bean;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component("topping")
public class Topping extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany (mappedBy = "toppings")
    List<Pizza> pizze;
}
