package cn.itcase_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"utf-8");
		
		//һ�ζ�ȡһ���ַ�
//		int ch=0;
//		while((ch=isr.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		//һ�ζ�ȡһ���ַ�����
		char[]  chs= new char[1024];
		int len=0;
		while((len=isr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		isr.close();
	}
}
