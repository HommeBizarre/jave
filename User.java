public class User {

    private String prenom;
    private String nom;
    private int age;

    public User(String prenom, String nom, String login) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = (age != 0) ? age : 18;
        login = login;
        this.isAdmin = (age != 0) ? True : False;

        this.email = this.login+"@cesi.com"

    }

    public String fullName() {
        return nom.toUpperCase() + " " + prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public bool setAdmin(Boolean change) {
        this.admin = change
    }
}