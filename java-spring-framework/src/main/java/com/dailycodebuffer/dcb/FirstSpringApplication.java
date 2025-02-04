package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.model.Employee;
import com.dailycodebuffer.dcb.model.Organization;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstSpringApplication {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);

        System.out.println(applicationContext.getBean("firstName"));
        System.out.println(applicationContext.getBean("employeeNumber"));

        System.out.println(applicationContext.getBean("employeeObj"));
        System.out.println(applicationContext.getBean("organization2"));
    }
}
