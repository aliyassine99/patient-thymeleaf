package org.me.hospitalthymeleaf;

import jakarta.annotation.PostConstruct;
import org.me.hospitalthymeleaf.entities.Patient;
import org.me.hospitalthymeleaf.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class HospitalThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalThymeleafApplication.class, args);
    }


}
