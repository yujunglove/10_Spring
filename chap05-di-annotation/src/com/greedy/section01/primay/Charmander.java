package com.greedy.section01.primay;

import org.springframework.stereotype.Component;

@Component
public class Charmander implements Pokemon{

	@Override
	public void attack() {
		System.out.println("파이리 불꽃 공격~~");
		
	}
}
	