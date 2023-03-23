package com.adaci.formation.SAM.controllers;

import com.adaci.formation.SAM.models.Fournisseur;
import com.adaci.formation.SAM.models.SiteEmploye;
import com.adaci.formation.SAM.services.fournisseur.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("v1/fournisseur")
@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class FournisseurController {
    @Autowired
    FournisseurService fournisseurService;

    @GetMapping
    public ResponseEntity<List<Fournisseur>> getAll(){
        return  new ResponseEntity<>(fournisseurService.getAll(), HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<Fournisseur> create(@RequestBody Fournisseur fournisseur){
        return new ResponseEntity<>(fournisseurService.create(fournisseur), HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        fournisseurService.delete(id);

    }
    @GetMapping("/{fournisseurNom}")
    public Optional<Fournisseur> getByNom(@PathVariable("fournisseurNom") String nom){
        return fournisseurService.getByNom(nom);
    }
    @PutMapping("/fournisseur/{id}")
    public ResponseEntity<Fournisseur> update(@PathVariable("id") long id, @RequestBody Fournisseur fournisseur){
        return new ResponseEntity<Fournisseur>(fournisseurService.update(id, fournisseur), HttpStatus.UPGRADE_REQUIRED);
    }
}
