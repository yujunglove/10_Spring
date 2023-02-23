package com.greedy.section01.filedinjection.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* @Autowired 필드 의존성 주입 테스트
		 * 
		 * AnnotationConfigApplicationContext 생성자에 basePackages 문자열을 전달하며 생성*/
		ApplicationContext context
		= new AnnotationConfigApplicationContext("com.greedy.section01.filedinjection.javaconfig");
		
		//이름"bookService",타입 BookService.class인 빈객체가 있다면 가져와 질것임
		BookService bookService = context.getBean("bookService",BookService.class);
		
		//전체 목록 조회
		for(BookDTO book : bookService.selectAllBooks()) {
			System.out.println(book);
		}
		
		//시퀀스로 검색
		System.out.println(bookService.searchBookBySequence(1));
		System.out.println(bookService.searchBookBySequence(2));
	}

}
