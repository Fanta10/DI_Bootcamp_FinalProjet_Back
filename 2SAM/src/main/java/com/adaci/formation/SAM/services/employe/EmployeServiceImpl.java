package com.adaci.formation.SAM.services.employe;

import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService{
    @Autowired
    EmployeRepository employeRepository;
    @Override
    public List<Employe> getAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe create(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void delete(long id) {
        employeRepository.deleteById(id);

    }

    @Override
    public Employe update(long id, Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Optional<Employe> getByMatricule(String matricule) {
        return employeRepository.findByMatricule(matricule);
    }

    @Override
    public Optional<Employe> getByEmail(String email) {
        return employeRepository.findByEmail(email);
    }
}
