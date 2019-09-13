package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class Reflection {
public static void main(String[] args) throws Exception {  //�õ�Classʵ��
	Class c1=Person.class;                                          
	Class c2=new Person().getClass();
	Class c3=Class.forName("com.reflection.Person"); //����
}
@Test
public void test4() throws Exception{               //ʹ�÷��������ͨ����
	Class c4=Class.forName("com.reflection.Person");
	Person p4=(Person) c4.newInstance();
	Method m4=c4.getDeclaredMethod("setName", String.class);
	
	m4.invoke(p4, "wangwu");
	
	System.out.println(p4.getName());
	
	
}

@Test
public void test3() throws Exception{             //ʹ�÷����������
	Class c3=Class.forName("com.reflection.Person");
	Person p3=(Person) c3.newInstance();
	
	Field f3=c3.getDeclaredField("name");
	
	f3.setAccessible(true);     //��ȡprivateȨ��
	
	f3.set(p3,"zhangsan");    //��������ֵ    �൱�� p3.name="zhangsan";
	
	System.out.println(f3.get(p3));  //�൱��  p3.name
	
}

@Test
public void test2() throws Exception{            //ʹ�÷�������вι��췽��
	Class c2=Class.forName("com.reflection.Person");
	
	Constructor cs=c2.getConstructor(String.class,String.class); //��Ҫ�õ��вι��췽��
	
	Person p2=(Person) cs.newInstance("lisi","2");     //�ڽ���ʵ����
	
	System.out.println(p2.getName()+"   "+p2.getId());
}
 
@Test
public void test() throws Exception{            // ʹ�÷�������޲ι��췽��
	Class c1=Class.forName("com.reflection.Person");
	Person p1=(Person) c1.newInstance();
	
	p1.setName("zhangsan");
	System.out.println(p1.getName());
}

}
