package com.reflection;

public class Person {
//����
	private String name;
	private String id;
	private int age;
//���췽��
	public Person(){
	System.out.println("�����޲ι��췽��");
	}
	public Person(String name, String id) {
		System.out.println("�����вι��췽��");
		this.name = name;
		this.id = id;
	}
//��ͨ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("����setName����");
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
