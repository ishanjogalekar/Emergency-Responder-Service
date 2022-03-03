/*
Developed by Ishan Jogalekar
 */
package com.eme_res.emergency_responder_user;
//Admin Panel
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

// Main Application Running window
@SpringBootApplication
@Controller
public class EmergencyResponderUserApplication {


    public static void main(String[] args) {
        System.out.println("Admin Panel - Emergency Responder Service");
        SpringApplication.run(EmergencyResponderUserApplication.class, args);
    }

}
