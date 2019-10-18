package xv.training.SpringBootapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import xv.training.SpringBootapi.entities.Organization;
import xv.training.SpringBootapi.entities.Student;
import xv.training.SpringBootapi.repositories.OrganizationRepository;
import xv.training.SpringBootapi.repositories.StudentRepository;

@SpringBootApplication
public class SpringBootapiApplication extends SpringBootServletInitializer {

@Autowired
private OrganizationRepository organizationRepository;

@Autowired
private StudentRepository studentRepository;

private static final Logger logger = LoggerFactory.getLogger(SpringBootapiApplication.class);

public static void main(String[] args) {

SpringApplication.run(SpringBootapiApplication.class, args);
logger.info("Hello Spring Boot");
}

@Bean
CommandLineRunner runner() {
return args -> {
Organization organization1 = new Organization("Delhi University" , "Delhi University");
Organization organization2 = new Organization("Karnatak University" , "Karnatak University");

organizationRepository.save(organization1);
organizationRepository.save(organization2);

studentRepository.save(new Student("Ramu", "Male", "BE", 25,organization2));
studentRepository.save(new Student("pavan", "Male", "BE", 20,organization2));
studentRepository.save(new Student("Seema", "Female", "BTech", 30,organization2));
studentRepository.save(new Student("Vinay", "Male", "Electrical Engineer", 35,organization1));
};
}

}

