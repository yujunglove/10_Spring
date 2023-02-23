package com.greedy.section03.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("com.greedy.section03.collection");
		
		
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		
		PokemonService pokemonService = context.getBean("pokemonService",PokemonService.class);
		
		pokemonService.pokemonAttack();
	}

}
