public class Utilisateur {
    private String id;
    private Message message;

    public Utilisateur(String id, Message message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id='" + id + '\'' +
                ", message=" + message +
                '}';
    }
}
