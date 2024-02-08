package it.epicode.w5d2p.service;

import it.epicode.w5d2p.bean.Pizza;
import it.epicode.w5d2p.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public void salvaPizza(Pizza pizza){
        pizzaRepository.save((pizza));
    }

    public void aggiornaPizza(Pizza pizza){
        Pizza p = pizzaRepository.findById(pizza.getId()).get();
        p.setNome(pizza.getNome());
        p.setPrezzo(pizza.getPrezzo());
        p.setCalorie(pizza.getCalorie());
//        p.setToppings(pizza.getToppings());

        pizzaRepository.save(p);

    }

    public Pizza cercaPizzaPerId(int id){
        return pizzaRepository.findById(id).get();
    }

    public void cancellaPersona(int id){
        pizzaRepository.deleteById(id);
    }
}
