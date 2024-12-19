public class Book {
    String titre, auteur, dispo;
    int isbn;

    public Book(String titre, String auteur, String dispo, int isbn) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.dispo = dispo;

    }

    public Book() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDispo() {
        return dispo;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livre :isbn=" + isbn + "titre=" + titre + ", auteur=" + auteur + ", dispo=" + dispo;
    }
}
