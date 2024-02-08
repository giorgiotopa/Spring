package it.epicode.w5d2p.repository;

import it.epicode.w5d2p.bean.Drink;
import it.epicode.w5d2p.bean.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
}
