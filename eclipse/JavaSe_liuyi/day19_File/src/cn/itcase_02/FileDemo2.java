package cn.itcase_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) {
		//�ļ����ǳ���ģ�·�����ļ����Բ�����
		File file = new File("z:\\a.txt");
		System.out.println(file);
		try {
			//�ֽ���������Ǿ���ģ�Ҫ����ʵ�ʴ��ڵ�·�����ļ�û��Ĭ�ϴ���
			FileOutputStream fos=new FileOutputStream(file);
			System.out.println(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
