package com.pioneer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Cricket {

	public static void main(String[] args) 
	{
	  BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
	 Wicket wicket= (Wicket) factory.getBean("wicket");
	 wicket.type();
	  

	}

}
