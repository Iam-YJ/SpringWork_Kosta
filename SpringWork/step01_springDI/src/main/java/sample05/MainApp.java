package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample04.StudentController;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("sample05/springDISetter.xml");

		OrderMessage messgae = context.getBean("dao", OrderMessage.class);

		messgae.getOrder_Message();

	}

}
