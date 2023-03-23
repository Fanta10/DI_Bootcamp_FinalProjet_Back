package com.adaci.formation.SAM.controllers;


import com.adaci.formation.SAM.models.BonCommande;

import com.adaci.formation.SAM.services.bonCommande.BonCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("v1/bonCommande")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class BonCommandeController {
    @Autowired
    BonCommandeService bonCommadeService;

    @GetMapping
    public ResponseEntity<List<BonCommande>> getAll(){
        return  new ResponseEntity<>(bonCommadeService.getAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<BonCommande> create(@RequestBody BonCommande bonCommande){

        return new ResponseEntity<>(bonCommadeService.create(bonCommande), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        bonCommadeService.delete(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity<BonCommande> update(@PathVariable("id") long id , @RequestBody BonCommande bonCommande){
        return new ResponseEntity<>(bonCommadeService.update(id, bonCommande), HttpStatus.UPGRADE_REQUIRED);
    }





}
