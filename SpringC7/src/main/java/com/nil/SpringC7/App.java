package com.nil.SpringC7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
         ApplicationContext contests = new AnnotationConfigApplicationContext(AppConfig.class);
		
         PaymentProcess obj = (PaymentProcess) contests.getBean("paymentprocess");
		obj.Display();
	  }


    }

