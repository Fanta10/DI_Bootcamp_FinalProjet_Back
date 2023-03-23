package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.services.materiel.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/materiel")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class MaterielController {
    @Autowired
    MaterielService materielService;
    @GetMapping
    public ResponseEntity<List<Materiel>> getAll(){
        return  new ResponseEntity<>(materielService.getAll(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<Materiel> create(@RequestBody Materiel materiel){
        return new ResponseEntity<>(materielService.create(materiel), HttpStatus.CREATED);
    }
@DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        materielService.delete(id);

    }
    @GetMapping("/{materielCode}")
    public Optional<Materiel> getByCode(@PathVariable("materielCode") String code){
        return materielService.getByCode(code);
    }
    @PutMapping("/materiel/{id}")
    public ResponseEntity<Materiel> update(@PathVariable("id") long id, @RequestBody Materiel materiel){
        return new ResponseEntity<Materiel>(materielService.update(id, materiel), HttpStatus.UPGRADE_REQUIRED);
    }
}
