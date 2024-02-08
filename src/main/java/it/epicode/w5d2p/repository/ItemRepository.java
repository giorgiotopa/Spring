package it.epicode.w5d2p.repository;

import it.epicode.w5d2p.bean.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    public List<Item> findByNome(String nome);

//    @Query("select i from Item i where i.prezzo= :prezoo")
//    public List<Item> findPrezzo(String prezzo);

}
