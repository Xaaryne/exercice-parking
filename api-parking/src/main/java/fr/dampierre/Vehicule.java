package fr.dampierre;

public class Vehicule {
    private String immatriculation;

    public Vehicule(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void changerImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getImmatriculation() {
        return this.immatriculation;
    }
}
