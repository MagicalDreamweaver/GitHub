package cn.itcase_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException   {
		FileInputStream fis = new FileInputStream("a.txt");
		//���ǲ����ڿ���ֱ̨�Ӵ�ӡ����
		byte[] by=new byte[1024];
		int len=0;
		while((len=fis.read(by))!=-1) {
			System.out.print(new String(by,0,len));
		}
		
		fis.close();
	}
}
