package DAO;

import java.time.Instant;

public class Etudiants {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateDEnteeHEI;
    Groupes groupes;

    public Etudiants(int id, String nom, String prenom, Instant dateDEnteeHEI, Groupes groupes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDEnteeHEI = dateDEnteeHEI;
        this.groupes = groupes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Instant getDateDEnteeHEI() {
        return dateDEnteeHEI;
    }

    public void setDateDEnteeHEI(Instant dateDEnteeHEI) {
        this.dateDEnteeHEI = dateDEnteeHEI;
    }

    public Groupes getGroupes() {
        return groupes;
    }

    public void setGroupes(Groupes groupes) {
        this.groupes = groupes;
    }
}
