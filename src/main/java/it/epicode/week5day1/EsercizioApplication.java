package it.epicode.week5day1;

import it.epicode.week5day1.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);
		Menu menu = context.getBean(Menu.class);

		System.out.println("Menu");
		System.out.println("Pizze ");
		for (Pizza item : menu.getPizzeList()) {
			System.out.println("\n" + item.getNome() + item.getToppingList() + "Calorie: " + item.getCalorie() + " - Prezzo: " + item.getPrezzo());
		}

		System.out.println("\nToppings ");
		for (Topping item : menu.getToppingList()) {
			System.out.println("\n" + item.getNome() + ": Calorie: " + item.getCalorie() + " - Prezzo: " + item.getPrezzo());
		}
		System.out.println("\nBevande ");
		for (Bevanda item : menu.getBevandaList()) {
			System.out.println("\n" + item.getNome() + ": Calorie: " + item.getCalorie() + " - Prezzo: " + item.getPrezzo());
		}
	}

}
