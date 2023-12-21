import java.text.SimpleDateFormat;
import java.util.Date;
public class Personne {
    String nom;
    Date dateNaiss;
    double taille;

    public Personne(String nom, Date dateNaiss, double taille) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.taille = taille;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Date de naissance: " + new SimpleDateFormat("yyyy-MM-dd").format(dateNaiss));
        System.out.println("Taille: " + taille);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + new SimpleDateFormat("yyyy-MM-dd").format(dateNaiss) +
                ", taille=" + taille +
                '}';
    }
}
