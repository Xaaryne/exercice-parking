package fr.dampierre;

public class App {

    public static void main(String[] args) {
        Vehicule voiture1 = new Vehicule("FR-177013");
        voiture1.changerImmatriculation("FR-800845");
        System.out.println(voiture1.getImmatriculation());
    }

}

