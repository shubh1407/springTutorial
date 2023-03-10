import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * xml based
 * annotation+xml based
 * java based
 */

/*
 * 
 * Singleton -> one object through out application (Default scope)
 * Prototype -> whenever request you will get new object 
 * Request -> for particular request , you will get same object 
 * Session -> bean is active for particular local session 
 * Global Session -> session for specific application , same object 
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("spring application");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		StudentClass studentClass = applicationContext.getBean("student1",StudentClass.class);
		System.out.println(studentClass.getName());
		studentClass.getContactNum().forEach(System.out::println);
		System.out.println("marks of student ");
		studentClass.getMarks().forEach(System.out::println);
		
		studentClass.getAddress().forEach(address -> System.out.println(address.getCity()));
		
		studentClass.getSubject().forEach(subject -> System.out.println(subject.getName()));
		
		System.out.println("marks of each subjects ");
		
		studentClass.getSubMarks().entrySet().forEach(entry -> 
								System.out.println(entry.getKey().getName() +" marks is "+entry.getValue()));
		
		System.out.println(studentClass.getPrimAddress().getCity());
		
	}
}
