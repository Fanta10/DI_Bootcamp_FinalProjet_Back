package com.adaci.formation.SAM.services.employe;


import com.adaci.formation.SAM.models.Employe;

import java.util.List;
import java.util.Optional;

public interface EmployeService {
    List<Employe> getAll();
    Employe create(Employe employe);

    void delete(long id);

    Employe update(long id, Employe employe);

    Optional<Employe> getByMatricule(String matricule);
    Optional<Employe> getByEmail(String email);
}
