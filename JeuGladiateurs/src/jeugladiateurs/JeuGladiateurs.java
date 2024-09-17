package jeugladiateurs;

import personnages.Personnage;
import personnages.Personnage.Mirmillon;
import personnages.Personnage.Retiaire;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs 
{

    public static void main(String[] args) 
    {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage mirmillon = new Mirmillon("Bob le bricoleur", 15, 15, 70);
        Personnage retaire = new Retiaire("Igor l'empaleur", 25, 5, 100);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        mirmillon.afficherInfosPersonnage();
        retaire.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>
        
        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        while (mirmillon.getPointDeVie() > 0 && retaire.getPointDeVie() > 0) 
        {
            tour.afficheTour();

            if (mirmillon.getInitiative() >= retaire.getInitiative()) 
            {
                mirmillon.frapperPersonnage(retaire);
                
                if (retaire.getPointDeVie() <= 0) {
                    break;
                } 
                
                retaire.frapperPersonnage(mirmillon);
            } 
            else 
            {
                retaire.frapperPersonnage(mirmillon);
                
                if (mirmillon.getPointDeVie() <= 0) {
                    break;
                } 
                
                mirmillon.frapperPersonnage(retaire);
            }

            affichage.afficherSeparateurInfosPerso();
            mirmillon.afficherInfosPersonnage();
            retaire.afficherInfosPersonnage();

            mirmillon.setNewInitiativeAleatoire();
            retaire.setNewInitiativeAleatoire();

            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
        }
        
        affichage.afficheVictoire(mirmillon, retaire);
    // </editor-fold>
    }
}