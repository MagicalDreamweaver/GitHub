package com.test2;

public class TestDome2 {
public static void main(String[] args) {
/*	add(10,20,30);
	add(10,20);
	add(10);
*/
	any("10","20");
}
public static void add(int...arr){      //�ɱ����  �������߼���ͬ ������ͬ ֻ�ǲ���������ͬ
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	System.out.println("sum:"+sum);	
}

public static <T>void any(T...arr){     //���ͷ�����ɱ������ϣ�
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
