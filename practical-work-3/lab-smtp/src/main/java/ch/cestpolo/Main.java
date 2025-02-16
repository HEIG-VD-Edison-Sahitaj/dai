package ch.cestpolo;

import ch.cestpolo.config.Config;
import ch.cestpolo.mail.Group;
import ch.cestpolo.mail.Person;
import ch.cestpolo.smtp.Client;

import java.util.List;

/**
 * This class represents the main class of the application.
 */
public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        List<Person> persons = config.getPersons();
        Client client = new Client();
        int groupSize = persons.size() / config.getNumberGroups();
        for (int i = 0; i < config.getNumberGroups(); i++) {
            Group group = new Group(persons, groupSize);
            client.connect(config.getServerAddress(), config.getServerPort());
            client.send(group.create(config.getMessages()));
            client.close();
        }
    }
}