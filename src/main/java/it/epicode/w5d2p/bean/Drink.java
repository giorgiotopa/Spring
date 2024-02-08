package it.epicode.w5d2p.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component("drink")
public class Drink extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
