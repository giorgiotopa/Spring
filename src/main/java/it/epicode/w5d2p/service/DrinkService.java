package it.epicode.w5d2p.service;

import it.epicode.w5d2p.bean.Drink;
import it.epicode.w5d2p.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepository drinkRepository;

    public void salvaDrink(Drink drink){
        drinkRepository.save((drink));
    }

    public void aggiornaDrink(Drink drink){
        Drink d = drinkRepository.findById(drink.getId()).get();
        d.setNome(drink.getNome());
        d.setPrezzo(drink.getPrezzo());
        d.setCalorie(drink.getCalorie());

        drinkRepository.save(d);

    }

    public Drink cercaDrinkPerId(int id){
        return drinkRepository.findById(id).get();
    }

    public void cancellaDrink(int id){
        drinkRepository.deleteById(id);
    }
}
