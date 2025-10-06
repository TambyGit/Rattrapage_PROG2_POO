import java.time.LocalDateTime;

public class Message {
    private String texte;
    private LocalDateTime dateEtHeureDeCreation;
    private boolean confidentialite;

    public Message(String texte, LocalDateTime dateEtHeureDeCreation, boolean confidentialite) {
        this.texte = texte;
        this.dateEtHeureDeCreation = dateEtHeureDeCreation;
        this.confidentialite = confidentialite;
    }

    public String getTexte() {
        return texte;
    }

    public LocalDateTime getDateEtHeureDeCreation() {
        return dateEtHeureDeCreation;
    }

    public boolean isConfidentialite() {
        return confidentialite;
    }
}
