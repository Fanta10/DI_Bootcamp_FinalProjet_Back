package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.StatutMateriel;
import com.adaci.formation.SAM.models.TypeMateriel;
import com.adaci.formation.SAM.services.typeMateriel.TypeMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/typeMateriel")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class TypeMaterielController {
    @Autowired
    TypeMaterielService typeMaterielService;
    @GetMapping
    public ResponseEntity<List<TypeMateriel>> getAll(){
        return  new ResponseEntity<>(typeMaterielService.getAll(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<TypeMateriel> create(@RequestBody TypeMateriel typeMateriel){
        return new ResponseEntity<>(typeMaterielService.create(typeMateriel), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        typeMaterielService.delete(id);

    }
    @GetMapping("/{typeMaterielLibelle}")
    public Optional<TypeMateriel> getByLibelle(@PathVariable("typeMaterielLibelle") String libelle){
        return typeMaterielService.getByLibelle(libelle);
    }

    @PutMapping("/typeMateriel/{id}")
    public ResponseEntity<TypeMateriel> update(@PathVariable("id") long id, @RequestBody TypeMateriel typeMateriel){
        return new ResponseEntity<TypeMateriel>(typeMaterielService.update(id, typeMateriel), HttpStatus.UPGRADE_REQUIRED);
    }
}
