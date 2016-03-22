package org.gestion.bp.test;

import org.gestion.bp.entities.Caisse;
import org.gestion.bp.metier.IBanqueMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
   IBanqueMetier metier= (IBanqueMetier) context.getBean("metier");
   metier.addCaisse(new Caisse("C1"));
   metier.addCaisse(new Caisse("C2"));
	}

}
