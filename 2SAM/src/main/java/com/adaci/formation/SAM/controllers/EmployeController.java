package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.BonCommande;
import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.services.employe.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/employe")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class EmployeController {
    @Autowired
    EmployeService employeService;
    @GetMapping
    public ResponseEntity<List<Employe>> getAll(){
        return  new ResponseEntity<>(employeService.getAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Employe> create(@RequestBody Employe employe){

        return new ResponseEntity<>(employeService.create(employe), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        employeService.delete(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Employe> update(@PathVariable("id") long id , @RequestBody Employe employe){
        return new ResponseEntity<>(employeService.update(id, employe), HttpStatus.UPGRADE_REQUIRED);
    }
    @GetMapping("/{employeMatricule}")
    public Optional<Employe> getByMatricule(@PathVariable("employeMatricule") String matricule){
        return employeService.getByMatricule(matricule);
    }
    @GetMapping("/{employeEmail}")
    public Optional<Employe> getByEmail(@PathVariable("employeEmail") String email){
        return employeService.getByEmail(email);
    }


}
