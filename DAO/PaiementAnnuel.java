package DAO;

import java.time.Instant;

public class PaiementAnnuel extends Paiement{


    public PaiementAnnuel(int id, float montantPayé, Instant dateEtHeureDuPaiement) {
        super(id, montantPayé, dateEtHeureDuPaiement);
    }
}
