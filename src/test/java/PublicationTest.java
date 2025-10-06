import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublicationTest {

    private Publication publication;
    private Utilisateur utilisateur;
    private Message message1;
    private Message message2;
    private PersonneReelle utilisateur1;
    private PersonneAnonyme utilisateur2;

    @BeforeEach
    void setUp(){
        message2 = new Message("J'aime bien ton contenue", LocalDateTime.of(2025,6,24,23,54,23), true);
        message1 = new Message("Je suis fan de toi!", LocalDateTime.of(2025,8,12,12,23,36), false);
        utilisateur1 = new PersonneReelle("1", message1, "Nandrianina", "Tamby", "tamby@gmail.com");
        utilisateur2 = new PersonneAnonyme("2", message2);
        publication = new Publication(1, utilisateur, List.of(message1, message2));
    }

    @Test
    void ajoutersMessages() {
        publication.ajouterMessage(message1);
        publication.ajouterMessage(message2);
        assertEquals(2, publication.getMessages().size());
    }

    @Test
    void afficherUtilisateurs() {
        publication.afficherUtilisateurs();
        assertNotNull(utilisateur1);
        assertNotNull(utilisateur2);
    }
}