package DAO;

import java.time.Instant;

public class FraisDeScolarite {
    private int id;
    long label;
    long montantAPayer;
    Instant deadline;

    public FraisDeScolarite(int id, long label, long montantAPayer, Instant deadline) {
        this.id = id;
        this.label = label;
        this.montantAPayer = montantAPayer;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getLabel() {
        return label;
    }

    public void setLabel(long label) {
        this.label = label;
    }

    public long getMontantAPayer() {
        return montantAPayer;
    }

    public void setMontantAPayer(long montantAPayer) {
        this.montantAPayer = montantAPayer;
    }

    public Instant getDeadline() {
        return deadline;
    }

    public void setDeadline(Instant deadline) {
        this.deadline = deadline;
    }


}


