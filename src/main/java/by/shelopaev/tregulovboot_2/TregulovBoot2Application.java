package by.shelopaev.tregulovboot_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"by.shelopaev.tregulovboot_2.controller"})
public class TregulovBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(TregulovBoot2Application.class, args);
    }

}
