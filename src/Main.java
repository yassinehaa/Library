import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> livres = new ArrayList<>();
        Library library=new Library();

        int ch;

        while (true) {
            System.out.println("MENU");
            System.out.println("1: AJOUTER");
            System.out.println("2: AFFICHER");
            System.out.println("3: MODIFIER");
            System.out.println("4: SUPPRIMER");

            System.out.println("Entrer votre choix:");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Entrer l'ISBN: ");
                    int isbn = input.nextInt();
                    System.out.println("Entrer le titre: ");
                    String titre = input.next();
                    System.out.println("Entrer l'auteur: ");
                    String auteur = input.next();
                    System.out.println("Entrer la disponibilité (oui/non): ");
                    String dispo = input.next();


                    Book book = new Book(titre, auteur, dispo, isbn);
                    library.ajouterLivre(book);
                    System.out.println("Livre ajouté: " + book);

                    break;
                case 2:
                    System.out.println("liste des livres: ");
                       for (Book book1:library.afficherBook()){
                        System.out.println( book1);}

                    break;
                case 3:
                    System.out.println("entrer le livre a modifier: ");
                    //library.modifierBook();
                default:
                    System.out.println("Choix invalide!");
            }
        }
    }
}


