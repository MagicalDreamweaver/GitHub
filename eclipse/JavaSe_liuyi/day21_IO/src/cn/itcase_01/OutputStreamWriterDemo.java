package cn.itcase_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//ֱ��д���ַ���
		osw.write("�й�");
		
		osw.close();
	}
}
