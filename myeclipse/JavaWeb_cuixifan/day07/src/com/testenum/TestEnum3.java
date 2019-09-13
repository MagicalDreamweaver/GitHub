package com.testenum;

import org.junit.Test;

public class TestEnum3 {
	@Test
	public void test2(){
		//֪��ö�ٵ��±꣬��ȡ���������
		int idx=2;
		
		Color100[] carr=Color100.values();
		String name=carr[idx].name();
		System.out.println("name:"+name);
	}
	@Test
	public void test1(){
		//֪��ö�ٵ����ƣ���ȡ������±�
		String name="GREEN";
		
		Color100 c=Color100.valueOf(name);
		int idx=c.ordinal();
		System.out.println("idx:"+idx);
	}
	
	@Test
	public void test(){
		//֪��ö�ٵĶ��󣬻�ȡ���ƺ��±�
		Color100 c=Color100.RED;
		
		String name=c.name();
		int idx=c.ordinal();
		System.out.println("name:"+name+"   "+"idx:"+idx);
	}
}

enum Color100{
	RED,GREEN,YELLOW;
}