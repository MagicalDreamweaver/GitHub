package cn.itcase_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 	�������ļ�	--		�ֽ�									�ַ�
 * 						����									����
 * 							FileInputStream						FileReader=InputStreamReader(��=��)
 * 							BufferedInputStream					BufferedReader
 * 						���									���
 * 							FileOutputStream					FileWriter=OutputStreamWriter(��=��)
 * 							BufferedOutputStream				BufferedWriter
 * 
 * 	���ɣ�
 * 		1��FielInputStream��FileOutputStream��FileReader��FileWriter�����βο���ֱ��д�ļ�����
 * 		2��InputStreamReader��OutputStream�����β���Ҫ����FileInputStream��FileOutputStream�Ķ���
 * 		3��Buffered*�๹�췽������Ҫ������Ӧ�ֽ���/�ַ����Ķ���
 * 		4�������У��ֽ�����һ���ֽڻ���һ���ֽ����鵥λ���ַ�����һ���ַ������ַ�����Ϊ��λ
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
}
