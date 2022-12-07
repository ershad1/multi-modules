package com.sbicloudbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.sbicloudbd")
@ComponentScan("com.sbicloudbd")
@EnableJpaRepositories(basePackages = "com.sbicloudbd")
@EntityScan("com.sbicloudbd.*")
public class EpmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrmsCoreApplication.class, args);
    }

}
