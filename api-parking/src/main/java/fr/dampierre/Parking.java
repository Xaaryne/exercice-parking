package fr.dampierre;

import java.util.ArrayList;

public class Parking {
    private int capacite;
    private ArrayList<String> vehiculesAutorises = new ArrayList<String>();;
    private ArrayList<String> vehiculesStationnes = new ArrayList<String>();;

    public Parking(int capacite) {
        this.capacite = capacite;
    }

    public Parking(int capacite, int nbPlacesDisponibles, ArrayList<String> vehiculesAutorises,
            ArrayList<String> vehiculesStationnes) {
        this.capacite = capacite;
        this.vehiculesAutorises = vehiculesAutorises;
        this.vehiculesStationnes = vehiculesStationnes;
    }

    public int getTailleVehiculesAutorises() {
        return vehiculesAutorises.size();
    }

    public boolean ajouterVehiculeAutorise(String immatriculation) {
        if (vehiculesAutorises.contains(immatriculation)) {
            return false;
        }
        vehiculesAutorises.add(immatriculation);
        return true;
    }

    public boolean enregistrerEntreeVehicule(String immatriculation) {
        // Si le véhicule est autorisé, j'ouvre, sinon j'ouvre pas
        for (String imm : vehiculesAutorises) {

            if (imm.equals(immatriculation)) {
                vehiculesStationnes.add(immatriculation);
                return true;
            }
        }
        return false;
    }

    // Getters
    public int getCapacite() {
        return this.capacite;
    }

    public ArrayList<String> getVehiculesAutorises() {
        return this.vehiculesAutorises;
    }

    public ArrayList<String> getVehiculesStationnes() {
        return this.vehiculesStationnes;
    }

    // Whitelist
    public void ajouterVehiculeAutorises(String immatriculation) {
        if (!this.vehiculesAutorises.contains(immatriculation)) {
            this.vehiculesAutorises.add(immatriculation);
        }
    }

    public void retirerVehiculeAutorise(String immatriculation) {
        if (this.vehiculesAutorises.contains(immatriculation)) {
            this.vehiculesAutorises.remove(immatriculation);
        }
    }

    // Vehicules
    public void entreeVehicule(String immatriculation) {
        if (!this.vehiculesStationnes.contains(immatriculation)) {
            this.vehiculesStationnes.add(immatriculation);
        }
    }

    public void sortieVehicule(String immatriculation) {
        if (this.vehiculesStationnes.contains(immatriculation)) {
            this.vehiculesStationnes.remove(immatriculation);
        }
    }

    // Places occupées
    public int placesOccupees() {
        return this.vehiculesStationnes.size();
    }

    public Integer getTailleVehiculesStationnes() {
        return null;
    }

}
