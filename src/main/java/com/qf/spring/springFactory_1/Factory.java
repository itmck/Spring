package com.qf.spring.springFactory_1;

public class Factory {
	
	/**
	 * 
	 *	非静态方法
	 */
	public User getUser(){
		System.out.println("------非静态工厂创建User------");
		return new User();
	}
}
