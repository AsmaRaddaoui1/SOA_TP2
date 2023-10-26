package Service;

public class Main {
    public static void main(String[] args) {
        // Créez une instance de BanqueService
        BanqueService banqueService = new BanqueService();

        // Exemple de conversion de devises
        double montantEnEuros = 100.0;
        double montantEnDollars = banqueService.conversion(montantEnEuros);
        System.out.println(montantEnEuros + " euros équivaut à " + montantEnDollars + " dollars.");

        // Exemple de récupération d'un compte
        Compte compte = banqueService.getCompte();
        if (compte != null) {
            System.out.println("Code du compte : " + compte.getCode());
            System.out.println("Solde du compte : " + compte.getSolde());
            System.out.println("Date de création du compte : " + compte.getDateCreation());
        } else {
            System.out.println("Le compte n'a pas été trouvé.");
        }

        // Exemple de récupération de la liste des comptes
        List<Compte> comptes = banqueService.getComptes();
        if (comptes != null && !comptes.isEmpty()) {
            System.out.println("Liste des comptes :");
            for (Compte c : comptes) {
                System.out.println("Code du compte : " + c.getCode());
                System.out.println("Solde du compte : " + c.getSolde());
                System.out.println("Date de création du compte : " + c.getDateCreation());
            }
        } else {
            System.out.println("Aucun compte trouvé.");
        }
    }
}
