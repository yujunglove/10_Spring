package com.greedy.section01.javaconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.greedy.section01.javaconfig.MemberDAO;

/* excludeFilter로 스캐닝에서 제외할 타입을 기술하면 해당 타입은 스캐닝에서 제외한다. */
//@Configuration
//컴포넌트 스캔 안에 어떤것이 들어갈 수 있느냐,
//자바컴피그 경로로 잡았다. 여기서 여기까지 스캔한다.
//특정한 친구들만 제외하고 싶을 때 쓰는 것 타입별
//@ComponentScan(basePackages="com.greedy.section01.javaconfig",
//			excludeFilters= {
//					@ComponentScan.Filter(
							/* 1. 타입으로 설정 
							 * 제외할 타입 설정*/
//							type=FilterType.ASSIGNABLE_TYPE,
//							classes= {MemberDAO.class}
							/* 2. 어노테이션 종류로 설정 
							 * Compotent타입의 어노테이션 제외 하겠다.*/
//							type=FilterType.ANNOTATION,
//							classes= {org.springframework.stereotype.Component.class}
							/* 3. 표현식으로 설정 */
//							type=FilterType.REGEX,
//							pattern= {"com.greedy.section01.*"}
//					)
//			})
//public class ContextConfiguration2 {
//
//}
