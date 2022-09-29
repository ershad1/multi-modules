package com.sbicloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class UserService {

    public static void main(String[] args) {
        SpringApplication.run(UserService.class, args);
    }
}
