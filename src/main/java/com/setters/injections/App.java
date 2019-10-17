package com.setters.injections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext appContext = new FileSystemXmlApplicationContext("applicationContext.xml");
		
		EastAfrica eastAfricaCountries = appContext.getBean("eastAfrica", EastAfrica.class);
		
		System.out.println(eastAfricaCountries.EastAfricaCountriesMotto());
		
		EastAfrica enableAutowireCountries = appContext.getBean("enableAutowire", EastAfrica.class);
		
		System.out.println("When autowired/"+System.getProperty("line.separator") + enableAutowireCountries.EastAfricaCountriesMotto());
	}

}
