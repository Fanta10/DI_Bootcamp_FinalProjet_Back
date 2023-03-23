package com.adaci.formation.SAM.services.historique_materiel;

import com.adaci.formation.SAM.models.Employe;
import com.adaci.formation.SAM.models.HistoriqueMateriel;
import com.adaci.formation.SAM.models.Materiel;
import com.adaci.formation.SAM.repository.HistoriqueMaterielRepository;
import com.adaci.formation.SAM.repository.MaterielRepository;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;



@Service
public class HistoryqueMaterielServiceImpl implements HistoriqueMaterielService{
    @Autowired
    MaterielRepository materielRepository;
    @Autowired
    HistoriqueMaterielRepository historiqueMaterielRepository;
    @Override
    public String getAll() {
        JSONObject jsonObject;
        JSONArray jsonArray = new JSONArray();
        for(HistoriqueMateriel historiqueMateriel: historiqueMaterielRepository.findAll()) {
            jsonObject = new JSONObject();
            jsonObject.put("code", historiqueMateriel.getMateriel().getCode());
            jsonObject.put("libelle", historiqueMateriel.getMateriel().getLibelle());
            jsonObject.put("duree", historiqueMateriel.getMateriel().getDate_utilisation());
            jsonObject.put("duree_restante", this.duree(historiqueMateriel.getMateriel().getCode()));
            jsonObject.put("nom_emp", historiqueMateriel.getEmploye().getNom());
            jsonObject.put("email_empl", historiqueMateriel.getEmploye().getEmail());
            jsonObject.put("localmac_address", historiqueMateriel.getMateriel().getLocalmac_address());
            jsonObject.put("marque", historiqueMateriel.getMateriel().getMarque());
            jsonObject.put("montant", historiqueMateriel.getMateriel().getMontant());
            jsonObject.put("statut_mat", historiqueMateriel.getStatut());
            jsonObject.put("disposition", historiqueMateriel.getMateriel().getDate_utilisation());
            jsonObject.put("longitude", historiqueMateriel.getLongitude());
            jsonObject.put("latitude", historiqueMateriel.getLatitude());
            jsonObject.put("finperiode_utilisation", historiqueMateriel.getFinperiode_utilisation());
            jsonArray.put(jsonObject);
            //if (this.duree(historiqueMateriel.getMateriel() <= 1))
        }
        return jsonArray.toString();
    }

    @Override
    public HistoriqueMateriel create(HistoriqueMateriel historiqueMateriel) {
        return historiqueMaterielRepository.save(historiqueMateriel);
    }


    @Override
    public void delete(long id) {
        historiqueMaterielRepository.deleteById(id);

    }

    @Override
    public HistoriqueMateriel update(long id, HistoriqueMateriel historiqueMateriel) {
        return historiqueMaterielRepository.save(historiqueMateriel);
    }

    @Override
    public Optional<HistoriqueMateriel> getByEmploye(Employe employe) {
        return null;
    }

    @Override
    public Optional<HistoriqueMateriel> getByMateriel(Materiel materiel) {
        return historiqueMaterielRepository.findByMateriel(materiel);
    }


    @Override
    public int duree(String code) {
       Optional<Materiel> materiel = materielRepository.findByCode(code);
        Optional<HistoriqueMateriel> historiqueMateriel = this.historiqueMaterielRepository.findByMateriel(materiel.get());
        HistoriqueMateriel historiqueMateriel1 = historiqueMateriel.get();

        int duree = (new Date().getYear()) - historiqueMateriel1.getMateriel().getDate_utilisation().getYear();

        return  duree;
    }


}
