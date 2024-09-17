package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("\n");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println("\n");
        System.out.println("**************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("\n");
        System.out.println("-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage Bob, Personnage Igor) {
        System.out.println("\n");
        
        if (Bob.getPointDeVie() > 0) {
            System.out.println(Bob.getNom() + " gagne le combat !!!");
            System.out.println("\n");
        } 
        else if (Igor.getPointDeVie() > 0) {
            System.out.println(Igor.getNom() + " gagne le combat !!!");
            System.out.println("\n");
        } 
        else {
            System.out.println("Aucun des deux personnages n'a gagné. C'est un match nul !");
            System.out.println("\n");
    }
}
    // </editor-fold>
}
