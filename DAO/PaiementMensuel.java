package DAO;

import java.time.Instant;

public class PaiementMensuel extends Paiement{

    public PaiementMensuel(int id, float montantPayé, Instant dateEtHeureDuPaiement) {
        super(id, montantPayé, dateEtHeureDuPaiement);
    }
}
