package com.nil.SpringC3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
				ClassPathXmlApplicationContext("config.xml");
		BankAccount account = (BankAccount) context.getBean("account");
		BankAccountrepositoryImpl accountImpl = (BankAccountrepositoryImpl) context.getBean("emp1");
		BankAccountServiceImpl services = (BankAccountServiceImpl) context.getBean("emp2");
		System.out.println(account);
		System.out.println(accountImpl);
		System.out.println(services);
		
	}
    }

