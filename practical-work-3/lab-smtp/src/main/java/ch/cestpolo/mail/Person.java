package ch.cestpolo.mail;

/**
 * Person class
 */
public class Person {
    private String mail;

    /**
     * Constructor
     * @param mail
     */
    public Person(String mail) {
        this.mail = mail;
    }

    /**
     * Get the person's mail
     * @return mail
     */
    public String getMail() {
        return mail;
    }
}
