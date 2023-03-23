package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.BonLivraison;

import com.adaci.formation.SAM.services.BonLivraison.BonLivraisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/bonLivraidon")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class BonLivraisonController {
    @Autowired
    BonLivraisonService bonLivraisonService;

    @GetMapping
    public ResponseEntity<List<BonLivraison>> getll(){
        return  new ResponseEntity<>(bonLivraisonService.getAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<BonLivraison> create(@RequestBody BonLivraison bonLivraison){
        return new ResponseEntity<>(bonLivraisonService.create(bonLivraison), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable("id") long id){
        bonLivraisonService.delete(id);


    }
    @GetMapping("/{bonLivraisonId}")
    public Optional<BonLivraison> getById(@PathVariable("bonLivraisonId") long id){
        return bonLivraisonService.getById(id);
    }

    @PutMapping("/bonLivraison/{id}")
    public ResponseEntity<BonLivraison> update(@PathVariable("id") long id, @RequestBody BonLivraison bonLivraison){
        return new ResponseEntity<>(bonLivraisonService.update(id, bonLivraison), HttpStatus.UPGRADE_REQUIRED);
    }


}


