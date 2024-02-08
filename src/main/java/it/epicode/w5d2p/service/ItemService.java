package it.epicode.w5d2p.service;

import it.epicode.w5d2p.bean.Item;
import it.epicode.w5d2p.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public void salvaItem(Item item) {
        itemRepository.save(item);
    }

    public void aggiornaItem(Item item){
        Item i = itemRepository.findById(item.getId()).get();
        i.setNome(item.getNome());
        i.setCalorie(item.getCalorie());
        i.setPrezzo(item.getPrezzo());
        itemRepository.save(i);
    }

    public Item cercaItemPerId(int id){
        return itemRepository.findById(id).get();
    }

    public void cancellaItem(int id){
        itemRepository.deleteById(id);
    }

    public List<Item> cercaItemPerNome(String nome){
        return itemRepository.findByNome(nome);
    }

//    public List<Item> cercaItemPerPrezzo(String prezzo){
//        return itemRepository.findPrezzo(prezzo);
//    }

}

