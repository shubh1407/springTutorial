import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * xml based
 * 
 * annotation+xml based
 * 
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
		//spring container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-conf.xml");
		//singleton
		StudentClass studentClass = applicationContext.getBean("student1",StudentClass.class);
		//db operation to insert it
		System.out.println(studentClass.hashCode());
		
		StudentClass studentClass2 = applicationContext.getBean("student1",StudentClass.class);
		System.out.println(studentClass2.hashCode());
		
		//prototype
		StudentClass studentClass3 = applicationContext.getBean("student2",StudentClass.class);
		System.out.println(studentClass3.hashCode());
		
		StudentClass studentClass4 = applicationContext.getBean("student2",StudentClass.class);
		System.out.println(studentClass4.hashCode());
		
		applicationContext.destroy();
		
	}
}
