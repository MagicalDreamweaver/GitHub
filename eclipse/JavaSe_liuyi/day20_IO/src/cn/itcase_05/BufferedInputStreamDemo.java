package cn.itcase_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//�޷���������̨��ӡ����
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		//һ�ζ�ȡһ���ֽ�
//		int by=0;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		
		//һ�ζ�ȡһ���ֽ�����
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
		bis.close();
	}

}
