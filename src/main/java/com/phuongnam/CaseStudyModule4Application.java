package com.phuongnam;

import com.phuongnam.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CaseStudyModule4Application {

    public static void main(String[] args) {
        SpringApplication.run(CaseStudyModule4Application.class, args);
    }

}
