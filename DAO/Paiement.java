package DAO;

import java.time.Instant;

public class Paiement {
    private int id;
    private float montantPayé;
    private Instant dateEtHeureDuPaiement;

    public Paiement(int id, float montantPayé, Instant dateEtHeureDuPaiement) {
        this.id = id;
        this.montantPayé = montantPayé;
        this.dateEtHeureDuPaiement = dateEtHeureDuPaiement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontantPayé() {
        return montantPayé;
    }

    public void setMontantPayé(float montantPayé) {
        this.montantPayé = montantPayé;
    }

    public Instant getDateEtHeureDuPaiement() {
        return dateEtHeureDuPaiement;
    }

    public void setDateEtHeureDuPaiement(Instant dateEtHeureDuPaiement) {
        this.dateEtHeureDuPaiement = dateEtHeureDuPaiement;
    }
}

