package com.test;

import java.util.Arrays;

import javax.sound.sampled.ReverbType;



public class Generic {
	public static void main(String[] args) {
		Integer[] a={1,2,3,4,5};                        //����ֻ������Ķ���
		
		
		System.out.println(Arrays.toString(a));
		swap1(a,1,3);
		System.out.println(Arrays.toString(a));
		
		System.out.println("___________________________");
		
		String[] b={"a","b","c","d","e"};
		System.out.println(Arrays.toString(b));
		swap1(b,1,3);
		System.out.println(Arrays.toString(b));
	}

	private static <T>void swap1(T[] arr ,int i,int j) {//�������߼���ͬ�����������Ͳ�ͬ��
		T temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	

}
