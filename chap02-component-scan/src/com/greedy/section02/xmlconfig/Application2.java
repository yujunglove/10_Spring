package com.greedy.section02.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application2 {
	
	public static void main(String[] args) {
		
		//ComponentScan 기능을 이용한 bean 등록 설정
		
		//ComponentScan이란?
		//base-package로 설정 된 하위 경로에 특정 어노테이을 가지고 있는 클래스를 bean으로 등록하는 기능
		//@Component 어노테이션이 작성 된 크래스를 인식하여 bean으로 등록하게 되며
		// 특수 목적에 따라 세부 기능을 제공하는  @Controller, @Servixe, @Repository,@Configuration 등을 인식한다.
		
		ApplicationContext context 
		= new GenericXmlApplicationContext("com/greedy/section02/xmlconfig/config/spring-context1.xml");
		//빈에 정의된 이름을 배열로 받아 온 것
		//어떤 빈을 이 컨텍스트가 가지고 있는가?
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("beanName: "+ beanName);
		}
		
		//상위타입인 인터페이스만 사용해도 빈 사용이 가능하다/
		MemberDAO memberDAO = context.getBean("memberDAO",MemberDAO.class);
		//1번 멤버를 조회한다.MemberDTO [sequence=1, id=user01, pwd=pass01, name=홍길동]
		System.out.println(memberDAO.selectMember(1));
		//true
		System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03","pass03","뉴멤버")));
		//3번 멤버를 추가 한다.MemberDTO [sequence=3, id=user03, pwd=pass03, name=뉴멤버]
		System.out.println(memberDAO.selectMember(3));
		
		
	}

}
