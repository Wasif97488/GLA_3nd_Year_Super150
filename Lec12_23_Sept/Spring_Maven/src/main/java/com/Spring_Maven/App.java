package com.Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app = new ClassPathXmlApplicationContext("Spring-config.xml");
       
       Student s = (Student)app.getBean("st");
       s.student();
       
       User u =(User)app.getBean("user");
       u.user();
       
       Wish w = (Wish)app.getBean("wish");
       w.wish();
       
       Employee emp = (Employee) app.getBean("emp1");
       System.out.println(emp.getEmpId());
       System.out.println(emp.getEmpName());
       System.out.println(emp.getAdd().getCity());
       System.out.println(emp.getAdd().getState());
       
       Address a = (Address)app.getBean("add");
       System.out.println(a.getCity());
       System.out.println(a.getState());
       
       Employee em = (Employee) app.getBean("emp");
       System.out.println(em.getEmpId());
       System.out.println(em.getEmpName());
       
       
            Address a1=(Address) app.getBean("add");
            System.out.println(a1.getCity());
            System.out.println(a1.getState());

       
       
    }
}
