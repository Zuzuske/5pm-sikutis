package lt.sikutis.pm5be.controller;

import lt.sikutis.pm5be.model.Organizations;
import lt.sikutis.pm5be.repository.OrganizationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganisationsController {

    private final OrganizationsRepository repository;

    @Autowired
    public OrganisationsController(OrganizationsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/organizations")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<List<Organizations>> getOrganizations() {
        try {
            return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
