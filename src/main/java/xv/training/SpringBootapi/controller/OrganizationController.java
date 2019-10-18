package xv.training.SpringBootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.SpringBootapi.entities.Organization;
import xv.training.SpringBootapi.repositories.OrganizationRepository;



@RestController
public class OrganizationController {

@Autowired
private OrganizationRepository organizationRepository;

@RequestMapping("/organizations")
public Iterable<Organization> getOrganizations(){
return organizationRepository.findAll();

}
}


