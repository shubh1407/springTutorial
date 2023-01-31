import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * xml based
 * annotation based
 * java based
 */
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("spring application");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		StudentClass studentClass = applicationContext.getBean("student1",StudentClass.class);
		
		studentClass.getContactNum().forEach(System.out::println);
		System.out.println("marks of student ");
		studentClass.getMarks().forEach(System.out::println);
		
		studentClass.getAddress().forEach(address -> System.out.println(address.getCity()));
		
		studentClass.getSubject().forEach(subject -> System.out.println(subject.getName()));
		
		System.out.println("marks of each subjects ");
		
		studentClass.getSubMarks().entrySet().forEach(entry -> 
								System.out.println(entry.getKey().getName() +" marks is "+entry.getValue()));
		
		System.out.println(studentClass.getPrimAddress().getCity());
		
		StudentClass studentClass2 = applicationContext.getBean("student2",StudentClass.class);
		System.out.println(studentClass2.getPrimAddress().getCity());
	}
}
