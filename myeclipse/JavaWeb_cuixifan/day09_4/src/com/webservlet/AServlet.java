package com.webservlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class AServlet extends HttpServlet {

	/**
	 * ����java�������������ڰ�src�ļ��и���classes������WEB-INFĿ¼�£����ұ������.class�ļ���
	 * 
	 * ����web�������У��൱�ڰ�myeclipse��WebRoot�ļ��и���Ϊ��Ŀ���������档
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {      //src�൱��classes
		
/*		ClassLoader cl=getClass().getClassLoader();	
		InputStream input=cl.getResourceAsStream("com/webservlet/b.txt");*/   //����classesĿ¼��
		
		Class c=getClass();                                  //Clases��������ʽ
		//InputStream input=c.getResourceAsStream("b.txt");  	        		  //����.class�ļ����
		
	/*	InputStream input=c.getResourceAsStream("/a.txt");	*/				 //����classesĿ¼��
		InputStream input=c.getResourceAsStream("/../../index.jsp");
		String s =IOUtils.toString(input);
		System.out.println(s);
	}

}
