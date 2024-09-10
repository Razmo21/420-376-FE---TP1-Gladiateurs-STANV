package personnages;

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

    public int getIniative() {
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

    public void setIniative(int iniative) {
        this.initiative = iniative;
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
