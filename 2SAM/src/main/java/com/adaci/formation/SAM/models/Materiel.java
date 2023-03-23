package com.adaci.formation.SAM.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="material")
public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="code", length = 10)
    private String code;
    @Column(name="libelle", length = 35)
    private String libelle;
    @Column(name="marque", length = 35)
    private String marque;
    @Column(name="modele", length = 35)
    private String modele;
    @Column(name="montant", length = 35)
    private int montant;
    @Column(name="deb_garantie")
    private Date debut_garantie;
    @Column(name="fin_garantie")
    private Date fin_garantie;
    @Column(name="num_serie", length = 35)
    private String num_serie;
    @Column(name="date_enregistrement")
    private Date date_enregistrement;
    @Column(name="date_mise_dispos")
    private Date date_utilisation;
    @Column(name="duree_utisation")
    private int duree_utilisation;
    @Column(name="mac_address", length = 50)
    private String localmac_address;
    @CreationTimestamp
    @Column(name="created_at", columnDefinition = "timestamp")
    private Date createdAt;
    @CreationTimestamp
    @Column(name="updated_at", columnDefinition = "timestamp")
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "StatutMateriel_id")
    private StatutMateriel statut_materiel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TypeMateriel_id")
    private TypeMateriel typeMateriel;
/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BonCommanfr_id",  nullable = false)
    private BonCommande bonCommande;

 */

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BonLivraison_id")
    private BonLivraison bonLivraison;
/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Employe_id")
    private Employe employe;

 */
/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Fournisseur_id", nullable = false)
    private Fournisseur fournisseur;

 */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Date getDebut_garantie() {
        return debut_garantie;
    }

    public void setDebut_garantie(Date debut_garantie) {
        this.debut_garantie = debut_garantie;
    }

    public Date getFin_garantie() {
        return fin_garantie;
    }

    public void setFin_garantie(Date fin_garantie) {
        this.fin_garantie = fin_garantie;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public Date getDate_enregistrement() {
        return date_enregistrement;
    }

    public void setDate_enregistrement(Date date_enregistrement) {
        this.date_enregistrement = date_enregistrement;
    }

    public Date getDate_utilisation() {
        return date_utilisation;
    }

    public void setDate_utilisation(Date date_utilisation) {
        this.date_utilisation = date_utilisation;
    }

    public int getDuree_utilisation() {
        return duree_utilisation;
    }

    public void setDuree_utilisation(int duree_utilisation) {
        this.duree_utilisation = duree_utilisation;
    }

    public String getLocalmac_address() {
        return localmac_address;
    }

    public void setLocalmac_address(String localmac_address) {
        this.localmac_address = localmac_address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public StatutMateriel getStatut_materiel() {
        return statut_materiel;
    }

    public void setStatut_materiel(StatutMateriel statut_materiel) {
        this.statut_materiel = statut_materiel;
    }

    public TypeMateriel getTypeMateriel() {
        return typeMateriel;
    }

    public void setTypeMateriel(TypeMateriel typeMateriel) {
        this.typeMateriel = typeMateriel;
    }
/*
    public BonCommande getBonCommande() {
        return bonCommande;
    }

    public void setBonCommande(BonCommande bonCommande) {
        this.bonCommande = bonCommande;
    }

 */

    public BonLivraison getBonLivraison() {
        return bonLivraison;
    }

    public void setBonLivraison(BonLivraison bonLivraison) {
        this.bonLivraison = bonLivraison;
    }
/*
    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

 */
/*
    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

 */
}
