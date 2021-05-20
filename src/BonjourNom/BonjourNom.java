package BonjourNom;

import aleatoire.*;

public class BonjourNom {
    public static void main(String[] args) {
        Person john = new Person ("John", "Doe", 35);
        System.out.println("Prenom : " + args[0]);
        System.out.println("Nom : " + args[1]);
    }
}
