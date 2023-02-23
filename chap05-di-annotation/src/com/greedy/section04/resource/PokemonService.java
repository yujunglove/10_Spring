package com.greedy.section04.resource;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	
	/*스프링 전용 @Autowired 어노테이션 대신 자바 표준 어노테이션 @Resource로 POJO 연결 테스트를 해 본다.
	 * 
	 * */
	//1. 같은 타입의 bean이 여러 개 있는 상황
	//기본적으로 bean name으로 주입 받는다. 하지만 bean의 이름이 일치하지 않으면 타입으로 주입 받는다.
	//동일한 타입의 빈이 있는 경우에는 주입 받지 못한다.
//	@Resource(name = "charmander")
//	private Pokemon pokemon;
//
//	public void pokemonAttack() {
//		pokemon.attack();
//	}
	
	@Resource
	private List<Pokemon> pokemonList;
	
	public void pokemonAttack() {
		for(Pokemon pokemon : pokemonList) {
			pokemon.attack();
		}
	}

}
