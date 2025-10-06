public class PersonneReelle extends Utilisateur{
    private String nom;
    private String prenom;
    private String email;

    public PersonneReelle(String id, Message message, String nom, String prenom, String email) {
        super(id, message);
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }
}
