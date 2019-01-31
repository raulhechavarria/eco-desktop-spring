package eco.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eco.classes.visualtest.FormPrincipal;


public class Main {

	/**
	 * @param args
	 */
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("eco/classes/config/visual.xml");
		FormPrincipal formPrincipal = (FormPrincipal)context.getBean("formPrincipal");
		formPrincipal.show();

	}

}
