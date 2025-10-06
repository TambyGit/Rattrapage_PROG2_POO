import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publication {
    private int id;
    private Utilisateur utilisateur;
    private List<Message> messages;

    public Publication(int id, Utilisateur utilisateur, List<Message> messages) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.messages = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void ajouterMessage(Message message) {
        messages.add(message);
    }

    public void afficherUtilisateurs(){
        messages.forEach(Utilisateur -> {});
    }

}
