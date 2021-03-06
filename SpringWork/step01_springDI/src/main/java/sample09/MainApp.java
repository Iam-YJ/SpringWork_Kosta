package sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("sample09/springDIAnnotation.xml");

		EmpController controller = context.getBean("controller", EmpController.class);

		controller.test();

		System.out.println("========================");
		
		
		ResourceBean bean = context.getBean("resourceBean", ResourceBean.class);
		bean.test();

	}

}
