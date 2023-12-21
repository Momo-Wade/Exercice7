import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        ArrayList<Employe> employes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String nomAleatoire = generateRandomName(10);
            double salaireAleatoire = Math.random() * (5000 - 1000) + 1000;
            Employe nouvelEmploye = new Employe(nomAleatoire, salaireAleatoire);
            employes.add(nouvelEmploye);
        }

        Collections.sort(employes, (e1, e2) -> e1.nom.compareToIgnoreCase(e2.nom));


        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    private static String generateRandomName(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            stringBuilder.append(chars.charAt(index));
        }
        return stringBuilder.toString();


    }
}