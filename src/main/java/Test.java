import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory b = new XmlBeanFactory(resource);
		Student student = (Student) b.getBean("studentbean");
		System.out.println(" my data is " + student);
		student.display();
	}

}
