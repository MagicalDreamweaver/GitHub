package com.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import java.util.Iterator;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


public class CollectionMap {      //ÿ�����󻹿��Ե���toString��������
	@Test
	public void testMap(){                        //key���Բ������ظ�  value�����ظ�
		Map<String,String> map=new HashMap<String, String>();
		map.put("zzz", "111");
		map.put("xxx", "222");
		map.put("ccc", "333");
		map.put("zzz", "444");                    //��ȡ��ֵ�滻��ǰ���ֵ
		map.put("iii", "222");      
		//���ֱ���
		//��һ�� �õ�keyֵ����vaule
		Set<String> set=map.keySet();                     //ͨ��keySet()�����õ�Set����
		for (String key : set) {
			System.out.println(key+" : "+map.get(key));   //ͨ��get(key)�õ�value��ֵ
		}
		System.out.println("----------------------");
		
		//�ڶ��� ͨ��key��value�Ĺ�ϵ���ֱ�õ�keyֵ��valueֵ
		Set<Entry<String, String>> set1=map.entrySet();   //ͨ��entrySet()�����õ�Entry����
		for (Entry<String, String> entry : set1) {
			
			String key=entry.getKey();                    //ͨ��getKey�����õ�keyֵ
			String value=entry.getValue();                //ͨ��getValue�����õ�value
			
			System.out.println(key+" : "+value);
		}
		System.out.println("----------------------");
		
		System.out.println(map);
		
		System.out.println("----------------------");
	}
	@Test
	public void testSet(){                  //������ �����ظ���
		Set<String> set=new HashSet<String>();
		set.add("qqq");
		set.add("eee");
		set.add("www");
		set.add("qqq");
		//���ֱ���
		//��һ����ǿfor
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("----------------------");

		//�ڶ��ֵ�����
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("----------------------");
		
		System.out.println(set);								//ֱ�Ӵ�ӡset.toString()
		
		System.out.println("----------------------");
	}

	@Test
	public void testList(){                 //������ ���ظ���
		List<String> list=new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		//���ֱ���
		//��һ��forѭ��
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		
		//�ڶ�����ǿfor
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		
		//�����ֵ�����
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
	}
		System.out.println("----------------------");		
		System.out.println(list);
	}
}
