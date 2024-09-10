package personnages;

import java.util.logging.Logger;

public class Personnage {

    String nom;
    int pointDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int iniative;
    
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    // </editor-fold>

    
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
    }

    public Personnage() {
        this.nom = "";
        this.pointDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.iniative = 0;
    }
    // </editor-fold>

    public String getNom() {
        return nom;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getIniative() {
        return iniative;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setIniative(int iniative) {
        this.iniative = iniative;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    // TODO : Les setters
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        return 0;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
