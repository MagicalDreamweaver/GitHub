package cn.itcase_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//�����ֽ������������Զ������ļ�
		FileOutputStream fos = new FileOutputStream("fos.txt");
//		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		
		//д������ݻḲ��֮ǰ����������
		fos.write("hello ".getBytes());
		
//		fos.write(97);//int����	д��һ���ֽ�
//		fos.write(57);
//		fos.write(55);
		
//		for(int i=0;i<10;i++) {
//			fos.write(("hello"+i).getBytes());
//			fos.write("\r\n".getBytes());
//		}
		
		fos.close();
	}

}
