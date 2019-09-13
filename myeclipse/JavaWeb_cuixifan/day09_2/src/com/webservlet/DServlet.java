package com.webservlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DServlet extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {        //��Servlet�õ��ļ���ʵ·��
		String path=getServletContext().getRealPath("/index.jsp");
		System.out.println(path);
		
		//��ȡ��Դ·�����ٴ����������Ķ���
		InputStream input=getServletContext().getResourceAsStream("/index.jsp");
		
		
		//��ȡ��ǰĿ¼�µ�������Դ·��
		Set<String > paths=getServletContext().getResourcePaths("/WEB-INF");
		System.out.println(paths);
	}

}
