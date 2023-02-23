package com.greedy.section01.javaconfig;

public interface Account {
	
	/* 잔액 조회 */
	String getBalance();
	
	/* 입금 */
	String deposit(int money);
	
	/* 출금 */
	String withDraw(int money);
	
}
