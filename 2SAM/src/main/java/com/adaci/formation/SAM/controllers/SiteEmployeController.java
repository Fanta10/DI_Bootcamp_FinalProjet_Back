package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.models.SiteEmploye;
import com.adaci.formation.SAM.services.siteEmploye.SiteEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("v1/siteEmploye")
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class SiteEmployeController {
    @Autowired
    SiteEmployeService siteEmployeService;
    @GetMapping
    public ResponseEntity<List<SiteEmploye>> getAll(){
        return  new ResponseEntity<>(siteEmployeService.getAll(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<SiteEmploye> create(@RequestBody SiteEmploye siteEmploye){
        return new ResponseEntity<>(siteEmployeService.create(siteEmploye), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        siteEmployeService.delete(id);

    }
    @GetMapping("/{siteEmployeLibelle}")
    public Optional<SiteEmploye> getByLibelle(@PathVariable("siteEmployeLibelle") String libelle){
        return siteEmployeService.getByLibelle(libelle);
    }
    @PutMapping("/siteEmploye/{id}")
    public ResponseEntity<SiteEmploye> update(@PathVariable("id") long id, @RequestBody SiteEmploye siteEmploye){
        return new ResponseEntity<SiteEmploye>(siteEmployeService.update(id, siteEmploye), HttpStatus.UPGRADE_REQUIRED);
    }
}
