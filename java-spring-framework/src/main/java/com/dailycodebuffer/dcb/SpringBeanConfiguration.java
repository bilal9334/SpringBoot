package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.model.Employee;
import com.dailycodebuffer.dcb.model.Organization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    @Bean
    public String firstName() {
        return "dcb";
    }

    @Bean
    public int employeeNumber() {
        return 1;
    }

    @Bean(name = "employeeObj")
    public Employee employee() {
        return new Employee("Bilal", 1);
    }

    @Bean
    public Organization organization() {
        return new Organization(500, "Org1");
    }
}
