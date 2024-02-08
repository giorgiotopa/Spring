package it.epicode.w5d2p.repository;

import it.epicode.w5d2p.bean.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Integer> {
}
