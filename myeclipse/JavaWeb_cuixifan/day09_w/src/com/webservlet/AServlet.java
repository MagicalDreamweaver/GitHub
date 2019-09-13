package com.webservlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AServlet implements Servlet {

	@Override  //����֮��
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");

		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");

		return null;
	}

	@Override   //����֮ǰ
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init");
		System.out.println(servletConfig.getServletName());   //�ܻ�ȡ<servlet-name>�е���������
		
		System.out.println(servletConfig.getInitParameter("paramName1"));
		System.out.println(servletConfig.getInitParameter("paramName2"));//ͨ���������Ƶõ�����ֵ
		
		int i=0;
		Enumeration<Enumeration> e=servletConfig.getInitParameterNames();
		                      
		while(e.hasMoreElements()){          
			System.out.println(e.nextElement());
			System.out.println(i);
			i++;
		}
		
	}

	@Override   //ÿ������
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException {
		System.out.println("service");

	}

}
