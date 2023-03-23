package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.SiteEmploye;
import com.adaci.formation.SAM.models.StatutMateriel;
import com.adaci.formation.SAM.services.StatutMateriel.StatutMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/statutMateriel")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class StatutMaterielController {
    @Autowired
    StatutMaterielService statutMaterielService;

    @GetMapping
    public ResponseEntity<List<StatutMateriel>> getAll(){
        return  new ResponseEntity<>(statutMaterielService.getAll(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<StatutMateriel> create(@RequestBody StatutMateriel statutMateriel){
        return new ResponseEntity<>(statutMaterielService.create(statutMateriel), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        statutMaterielService.delete(id);

    }
    @GetMapping("/{statutMaterielLibelle}")
    public Optional<StatutMateriel> getByLibelle(@PathVariable("statutMaterielLibelle") String libelle){
        return statutMaterielService.getByLibelle(libelle);
    }

    @PutMapping("/siteEmploye/{id}")
    public ResponseEntity<StatutMateriel> update(@PathVariable("id") long id, @RequestBody StatutMateriel statutMateriel){
        return new ResponseEntity<StatutMateriel>(statutMaterielService.update(id, statutMateriel), HttpStatus.UPGRADE_REQUIRED);
    }
}
