package it.epicode.w5d2p;

import it.epicode.w5d2p.bean.*;
import it.epicode.w5d2p.service.DrinkService;
import it.epicode.w5d2p.service.ItemService;
import it.epicode.w5d2p.service.PizzaService;
import it.epicode.w5d2p.service.ToppingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;

import java.util.List;

@Component
@Order(1)
public class Runner1 implements CommandLineRunner {

    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private ToppingService toppingService;
    @Autowired
    private ItemService itemService;
    private Logger logger = LoggerFactory.getLogger("w5d2p");

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        logger.info("Primo Runner");

//        Table t1 = ctx.getBean("tavolo1", Table.class);
//
//        logger.info("Il tavolo 1 è: " + t1);
//
//        Menu menu = ctx.getBean("menu", Menu.class);
//
//        menu.stampaMenu();
//
//        Ordine order = new Ordine(t1,4);
//
//        List<Pizza> pizze = menu.getPizze();
//
//        List<Drink> drinks = menu.getDrinks();
//
//        order.setPizze(pizze);
//        order.setDrinks(drinks);
//
//        logger.info("L'ordine è: " + order);
//
//        logger.info("Il totale dell'ordine è: " +order.totaleOrdine());



        Topping mozzarella = ctx.getBean("mozzarella" ,Topping.class);
        Topping pomodoro = ctx.getBean("pomodoro", Topping.class);
        Topping salame = ctx.getBean("salame", Topping.class);



        toppingService.salvaTopping(mozzarella);
        toppingService.salvaTopping(pomodoro);
        toppingService.salvaTopping(salame);

        logger.info(mozzarella.toString());

        Drink water = ctx.getBean("water",Drink.class);
        Drink cocaCola = ctx.getBean("cocaCola",Drink.class);


        drinkService.salvaDrink(water);
        drinkService.salvaDrink(cocaCola);

        logger.info(water.toString());

        Pizza margherita = ctx.getBean("margherita",Pizza.class);

        pizzaService.salvaPizza(margherita);


    }
}
