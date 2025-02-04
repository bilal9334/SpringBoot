package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.model.Employee;
import com.dailycodebuffer.dcb.model.Organization;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    public Employee employee(@Qualifier("organization2") Organization organization) {
        return new Employee("Bilal", 1, organization());
    }

    @Bean
    @Primary
    public Organization organization() {
        return new Organization(500, "Org1");
    }
    @Bean
    public Organization organization2() {
        return new Organization(502, "Org2");
    }
}
