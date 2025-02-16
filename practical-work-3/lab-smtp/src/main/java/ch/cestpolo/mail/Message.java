package ch.cestpolo.mail;

/**
 * Represents a mail message with a subject and a body.
 */
public class Message {
    private String subject;
    private String body;

    /**
     * Constructor of the Message class
     * @param subject Subject of the message
     * @param body Body of the message
     */
    public Message(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    /**
     * Get the subject of the massage
     * @return the subject of the message
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Get the body of the message
     * @return the body of the message
     */
    public String getBody() {
        return body;
    }
}
