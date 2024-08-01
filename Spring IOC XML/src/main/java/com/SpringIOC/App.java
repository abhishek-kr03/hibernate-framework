package com.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringIOC.impl.IndianAirforce;
import com.SpringIOC.impl.IndianArmy;
import com.SpringIOC.impl.IndianNavy;

public class App {
  public static void main(String[] args) {
    
	  ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	  
	  IndianAirforce indianAirforce = new IndianAirforce(ac);
	  IndianArmy indianArmy = new IndianArmy(ac);
	  IndianNavy indianNavy = new IndianNavy(ac);
	  
	  indianAirforce.addressPm();
	  indianArmy.addressPm();
	  indianNavy.addressPm();
	  
  }
}
