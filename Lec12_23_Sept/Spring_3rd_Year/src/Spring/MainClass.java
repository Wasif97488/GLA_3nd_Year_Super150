package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
//		Student s = new Student();
//		s.name();
		
		ApplicationContext app = new ClassPathXmlApplicationContext("Spring/Spring-config.xml");
		Student st=  (Student)app.getBean("stud");
		st.name();
		
		User u = (User)app.getBean("user");
		u.user();
		
		Wish w = (Wish) app.getBean("wish");
		w.wish();
	}

}
