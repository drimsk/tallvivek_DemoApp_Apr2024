package com.example.tallvivek_demoapp_apr2024;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallvivekDemoAppApr2024Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TallvivekDemoAppApr2024Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Login ls = new Login();
        ls.saySomething();
    }
}
