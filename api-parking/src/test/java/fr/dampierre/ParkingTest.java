package fr.dampierre;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ParkingTest {

    @Test
    // contexte_methodeSousTest_resultat()
    public void vehiculeAutoriseDansLaListe_ajouterVehiculeAutorise_devraitEtreAjoute() {

        // AAA : Arrange (préparer), Act (Agir), Assert (Vérifier)

        // Arrange : je met en place mon test, notamment en instanciant
        // et initialisant le ou les objets concernés

        Parking Parking = new Parking(0);
        Parking.ajouterVehiculeAutorise("ABC-123");

        // Act : j'appelle la méthode qui est sous test

        Parking.ajouterVehiculeAutorise("DEF-456");

        // Assert : je vérifie que tout s'est passé comme prévu

        assertEquals(2, Parking.getTailleVehiculesAutorises());
    }

    @Test
    // contexte_methodeSousTest_resultat()
    public void vehiculesAutorisesVide_ajouterVehiculeAutorise_devraitAjouterLeVehicule() {

        // AAA : Arrange (préparer), Act (Agir), Assert (Vérifier)

        // Arrange : je met en place mon test, notamment en instanciant
        // et initialisant le ou les objets concernés

        Parking Parking = new Parking(0);
        Parking.ajouterVehiculeAutorise("ABC-123");

        // Act : j'appelle la méthode qui est sous test

        Parking.ajouterVehiculeAutorise("ABC-123");

        // Assert : je vérifie que tout s'est passé comme prévu

        assertEquals(1, Parking.getTailleVehiculesAutorises());
    }

    @Test
    // contexte_methode_SousTest_resultat()
    public void vehiculeAutorise_enregistrerEntreeVehicule_devraitRentrer() {
        // Arrange
        Parking Parking = new Parking(1);
        Parking.ajouterVehiculeAutorise("ABC-123");
        // Act
        Parking.enregistrerEntreeVehicule("ABC-123");
        // Assert
        assertEquals(1, Parking.getTailleVehiculesStationnes(), "Le véhicule devrait pouvoir rentrer");

    }

    @Test
    // contexte_methode_SousTest_resultat()
    public void vehiculeAutorise_enregistrerEntreeVehicule_devraitPasRentrer() {
        // Arrange
        Parking Parking = new Parking(1);
        Parking.ajouterVehiculeAutorise("ABC-123");
        Parking.enregistrerEntreeVehicule("ABC-123");
        Parking.ajouterVehiculeAutorise("DEF-456");
        // Act
        Parking.enregistrerEntreeVehicule("DEF-456");
        // Assert
        assertEquals(1, Parking.getTailleVehiculesStationnes(), "Le second véhicule ne devrait pas pouvoir rentrer");

    }
}
