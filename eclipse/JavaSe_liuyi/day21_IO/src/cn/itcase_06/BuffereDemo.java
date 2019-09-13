package cn.itcase_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*	�ַ�������������
 * 		ÿ�ζ�ȡһ�У����������з��ţ�����Ҫ�ֶ�����
 *	�ַ������������
 *		д���ַ����Զ������ı�����
 */
public class BuffereDemo {
	public static void main(String[] args) throws IOException {
		write();
//		read();
	}
	
	private static void read() throws IOException {
		//�����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
	}

	public static void write() throws IOException {
		//�����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.sh"));
		for(int i=0;i<10;i++) {
			bw.write("hello"+i);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
