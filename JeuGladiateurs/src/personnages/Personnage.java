package personnages;

import java.util.Random;

public class Personnage {

    // Attributs protégés pour l'héritage
    protected String nom;
    protected int pointDeVie;
    protected int valeurMaxAttaque;
    protected int valeurDefense;
    protected int initiative;

    // Constructeur principal
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }

    // Constructeur par défaut
    public Personnage() {
        this.nom = "";
        this.pointDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }

    // Getters et setters
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

    // Méthodes de jeu
    public void afficherInfosPersonnage() {
        System.out.println("\n");
        System.out.println(nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Défense : " + valeurDefense);
        System.out.println("Point de vie : " + pointDeVie);
        System.out.println("Initiative : " + initiative);
        if (pointDeVie >= 1) {
            System.out.println("Statut : Vivant");
        } else {
            System.out.println("Statut : Mort");
        }
    }

    // Calcul des dommages
    protected int attaqueCalcul() { 
        Random rand = new Random();
        int maxValue = valeurMaxAttaque;
        int attaque = rand.nextInt(maxValue + 1);
        return attaque;
    }

    // Attaque un autre personnage
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

    // Génère une nouvelle initiative aléatoire
    public void setNewInitiativeAleatoire() {
        Random rand = new Random();
        initiative = rand.nextInt(100);
    }

    // Classe Mirmillon
    public static class Mirmillon extends Personnage {

        public Mirmillon(String nom, int attaqueMax, int defense, int pvs) {
            super(nom, attaqueMax, defense, pvs, new Random().nextInt(31)); // Initiative entre 0 et 30
        }

        @Override
        public void frapperPersonnage(Personnage personnageCible) {
            int dommages;

            for (int i = 0; i < 2; i++) { // Deux frappes
                if (personnageCible.getPointDeVie() > 0) {
                    int attaque = attaqueCalcul();
                    dommages = attaque - personnageCible.valeurDefense;
                    if (dommages < 0) {
                        dommages = 0;
                    }
                    personnageCible.pointDeVie -= dommages;
                    if (personnageCible.pointDeVie < 0) {
                        personnageCible.pointDeVie = 0;
                    }
                    System.out.println("\n" + this.nom + " attaque avec une puissance de : " + attaque);
                    System.out.println(personnageCible.getNom() + " a une défense de : " + personnageCible.valeurDefense);
                    System.out.println("Les dommages sont de : " + dommages);
                    System.out.println(personnageCible.getNom() + " a maintenant " + personnageCible.pointDeVie + " points de vie.");

                    if (personnageCible.getPointDeVie() <= 0) {
                        System.out.println(this.nom + " décapite " + personnageCible.getNom() + " !");
                        break;
                    } else if (i == 0) {
                        System.out.println(this.nom + " attaque de nouveau !");
                    }
                }
            }
        }
    }

    // Classe Retiaire
    public static class Retiaire extends Personnage {

        private boolean aFilet;

        public Retiaire(String nom, int attaqueMax, int defense, int pvs) {
            super(nom, attaqueMax, defense, pvs, new Random().nextInt(100)); // Initiative entre 0 et 99
            this.aFilet = true; // Commence avec le filet
        }

        @Override
        public void frapperPersonnage(Personnage personnageCible) {
            if (aFilet) {
                System.out.println(this.nom + " lance son filet !");
                Random rand = new Random();
                if (rand.nextInt(100) < 10) { // 10% de chance de toucher
                    System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l’empale sauvagement avec sa lance !");
                    personnageCible.setPointDeVie(0); // Tuer l’adversaire
                } else {
                    System.out.println("Le filet n'atteint pas sa cible !");
                    aFilet = false;
                    System.out.println(this.nom + " ramasse son filet et en profite pour attaquer !");
                    super.frapperPersonnage(personnageCible); // Attaque normale
                }
            } else {
                System.out.println(this.nom + " ramasse son filet et en profite pour attaquer !");
                super.frapperPersonnage(personnageCible); // Attaque normale
                aFilet = true; // Prépare le filet pour le prochain tour
            }
        }
    }
}
