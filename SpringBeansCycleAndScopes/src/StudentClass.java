import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentClass implements InitializingBean, DisposableBean {

	int rollNo;
	String name;

	public StudentClass() {
		System.out.println("student default constructor");
	}

	public StudentClass(int rollNo, String name,Address primAddress) {
		super();
		System.out.println("student param constructor");
		this.rollNo = rollNo;
		this.name = name;
		
	}

	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		// any operation which is required to perform every time you will get new object.
		System.out.println("custom init method");
	}
	
	public void destroyMethod() {
		// any operation which is required to perform every time before destroy object.
		System.out.println("custom destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after property set");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy method");
		
	}
}
