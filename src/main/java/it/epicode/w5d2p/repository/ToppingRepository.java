package it.epicode.w5d2p.repository;

import it.epicode.w5d2p.bean.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Integer> {
}
