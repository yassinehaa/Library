import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

        static Scanner input = new Scanner(System.in);
        static ArrayList<Book> books = new ArrayList<>();

        public static void ajouterBook(){
            Book newBook = new Book();
            System.out.println("Entrer l'ISBN: ");
            newBook.isbn = input.nextInt();
            System.out.println("Entrer le titre: ");
            newBook.titre = input.next();
            System.out.println("Entrer l'auteur: ");
            newBook.auteur = input.next();
            System.out.println("Entrer la disponibilité (oui/non): ");
            newBook.dispo = input.next();
            books.add(newBook);
        }
        public static void afficherBook() {
            int i;
            for (i = 0; i < books.size();i++);{
                System.out.println(books);
            }
        }
        public static void modifierBook(){
            Book editBook = new Book();
            System.out.println("entrer l'id du livre a modifier: ");
            int id = input.nextInt();
            for (int i=0; i<books.size();i++){
                if (id == books.get(i).isbn) {
                    System.out.println("entrer nouveau isbn: ");
                    editBook.isbn = input.nextInt();
                    System.out.println("entrer nouveau titre: ");
                    editBook.titre = input.next();
                    System.out.println("entrer nouvel auteur");
                    editBook.auteur = input.next();
                    System.out.println("entrer nouvelle disponibilité");
                    editBook.dispo = input.next();
                }
            }
        }
        public static void rechercherBook(){
            System.out.println("entrer le titre: ");
            String title = input.next();
            for (int i=0; i<books.size();i++){
                if (title.equals(books.get(i).titre)){
                    System.out.println(i);
                }
            }
        }
    public static void main(String[] args) {

        int ch;
        while (true) {
            System.out.println("MENU");
            System.out.println("1: AJOUTER");
            System.out.println("2: AFFICHER");
            System.out.println("3: MODIFIER");
            System.out.println("4: SUPPRIMER");

            System.out.println("entrer votre choix");
            ch =input.nextInt();
            switch (ch) {
                case 1:
                    ajouterBook();
                    break;
                case 2:
                    afficherBook();
                    break;
                case 3:
                    modifierBook();
                case 4:
                   rechercherBook();
                   break;
            }
        }
    }
