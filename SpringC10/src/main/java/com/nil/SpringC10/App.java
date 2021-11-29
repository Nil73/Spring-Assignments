package com.nil.SpringC10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/nil/SpringC10/config.xml");
		ContextAware appcontext= (ContextAware)context.getBean("context");
		ApplicationContext appCon =appcontext.getContext();
		Class a= (Class)appCon.getBean("pro");
		a.doTask();	
	}
    }

