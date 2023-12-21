import java.text.SimpleDateFormat;
import java.util.Date;
public class Employe extends Personne {
    double salaire;
    String poste;
    static int nbrEmployes = 0;
    private static final double SALAIRE_MINIMUM = 1500.0;
    private static final int MAX_LENGTH_NOM = 50;

    public Employe(String nom, double salaire) {
        super(nom, new Date(), 0);
        this.salaire = salaire;
        nbrEmployes++;
        if (this.nom.length() > MAX_LENGTH_NOM) {
            this.nom = this.nom.substring(0, MAX_LENGTH_NOM);
        }
    }

    public Employe(String nom, Date dateNaissance, String poste) {
        super(nom, dateNaissance, 0);
        this.poste = poste;
        nbrEmployes++;
        if (this.nom.length() > MAX_LENGTH_NOM) {
            this.nom = this.nom.substring(0, MAX_LENGTH_NOM);
        }
    }

    public void afficher() {
        super.afficher();
        System.out.println("Salaire: " + salaire);
        System.out.println("Poste: " + poste);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + new SimpleDateFormat("yyyy-MM-dd").format(dateNaiss) +
                ", taille=" + taille +
                ", salaire=" + salaire +
                ", poste='" + poste + '\'' +
                '}';
    }

    public static int getNombreEmployes() {
        return nbrEmployes;
    }

    public static double getSalaireMinimum() {
        return SALAIRE_MINIMUM;
    }
}
