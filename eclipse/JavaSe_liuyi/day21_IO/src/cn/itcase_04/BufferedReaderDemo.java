package cn.itcase_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		//һ�ζ�ȡһ���ַ�
//		int ch=0;
//		while((ch=br.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		br.close();
	}
}
