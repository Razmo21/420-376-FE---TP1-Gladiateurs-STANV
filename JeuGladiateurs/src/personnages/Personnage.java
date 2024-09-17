
package personnages;

import java.util.Random;

public class Personnage {

    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nom;
    int pointDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // </editor-fold>

    
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
        
    }

    public Personnage() {
        this.nom = "";
        this.pointDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
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

    public int getInitiative() {
        return initiative;
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

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println("\n");
        System.out.println(nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Défense : " + valeurDefense);
        System.out.println("Point de vie : " + pointDeVie);
        System.out.println("Initiative : " + initiative);
        if (pointDeVie >= 1) {
            System.out.println("Statut : Vivant");
        }else {
            System.out.println("Statut : Mort");
        }
    }
    
    
    private int attaqueCalcul() { 
        Random rand = new Random();
    
        int maxValue = valeurMaxAttaque;
        int attaque = rand.nextInt(maxValue + 1);

        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int attaque = attaqueCalcul();
        int dommages = attaque - personnageCible.valeurDefense;

        if (dommages < 0) {
            dommages = 0;
        }

        personnageCible.pointDeVie -= dommages;
    
        if (personnageCible.pointDeVie < 0) {
            personnageCible.pointDeVie = 0;
        }

        System.out.println("\n");
        System.out.println(this.nom + " attaque avec une puissance de : " + attaque);
        System.out.println(personnageCible.getNom() + " a une défense de : " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont de : " + dommages);
        System.out.println(personnageCible.getNom() + " a maintenant " + personnageCible.pointDeVie + " points de vie.");
    }


    public void setNewInitiativeAleatoire() {
        Random rand = new Random();
        
        initiative = rand.nextInt(100);
    }
    // </editor-fold>
}
