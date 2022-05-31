package com.iocdi.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class IocDiDemoApplication implements CommandLineRunner {

    private static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = SpringApplication.run(IocDiDemoApplication.class, args);
        String [] allBeans = applicationContext.getBeanDefinitionNames();
        log.info("There are a total of {} beans. And they are listed here:\n{}", applicationContext.getBeanDefinitionCount(), allBeans);
    }

    @Override
    public void run(String... args) throws Exception {
        Student s = new Student();

    }
}
