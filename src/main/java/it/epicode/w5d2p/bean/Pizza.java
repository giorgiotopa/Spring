package it.epicode.w5d2p.bean;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Entity
@Component("pizza")
public class Pizza extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany
    @JoinTable(name = "topping_pizze", joinColumns = @JoinColumn (name = "pizza_id"), inverseJoinColumns = @JoinColumn (name = "topping_id"))
    private List<Topping> toppings;
}
