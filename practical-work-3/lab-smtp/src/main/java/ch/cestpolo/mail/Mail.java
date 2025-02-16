package ch.cestpolo.mail;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a mail with a message, a sender and a list of recipients.
 */
public class Mail {
    private final Message message;
    private final Person sender;
    private final List<Person> recipients;

    /**
     * Constructor of the Mail class
     * @param message Message of the mail
     * @param sender Sender of the mail
     * @param recipients List of recipients of the mail
     */
    public Mail(Message message, Person sender, List<Person> recipients) {
        this.message = message;
        this.sender = sender;
        this.recipients = recipients;
    }

    /**
     * Get the body of the mail
     * @return the body of the mail
     */
    public String getBody() {
        return message.getBody();
    }

    /**
     * Get the subject of the mail
     * @return the subject of the mail
     */
    public String getSubject() {
        return message.getSubject();
    }

    /**
     * Get the sender of the mail
     * @return the sender of the mail
     */
    public String getSender() {
        return sender.getMail();
    }

    /**
     * Get the recipients of the mail
     * @return the recipients of the mail
     */
    public List<String> getRecipients() {
        return recipients.stream()
                .map(Person::getMail)
                .collect(Collectors.toList());
    }

    /**
     * Get the content type of the mail
     * @return the content type of the mail
     */
    public String getContentType() {
        return message.getBody().contains("<html>") ? "text/html" : "text/plain";
    }
}
