package it.epicode.w5d2p.service;

import it.epicode.w5d2p.bean.Topping;
import it.epicode.w5d2p.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {

    @Autowired
    private ToppingRepository toppingRepository;

    public void salvaTopping(Topping topping){
        toppingRepository.save((topping));
    }

    public void aggiornaTopping(Topping topping){
        Topping t = toppingRepository.findById(topping.getId()).get();
        t.setNome(topping.getNome());
        t.setPrezzo(topping.getPrezzo());
        t.setCalorie(topping.getCalorie());

        toppingRepository.save(t);

    }

    public Topping cercaToppingPerId(int id){
        return toppingRepository.findById(id).get();
    }

    public void cancellaTopping(int id){
        toppingRepository.deleteById(id);
    }

}
