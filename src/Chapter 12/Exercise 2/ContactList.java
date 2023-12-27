
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private List<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void saveToFile(String fileName) throws IOException {
        if (fileName.endsWith(".obj")) {
            saveToFileObject(fileName);
        } else {
            saveToFileText(fileName);
        }
    }

    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        if (fileName.endsWith(".obj")) {
            loadFromFileObject(fileName);
        } else {
            loadFromFileText(fileName);
        }
    }

    private void saveToFileObject(String fileName) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(contacts);
        }
    }

    private void loadFromFileObject(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            contacts = (List<Contact>) in.readObject();
        }
    }

    private void saveToFileText(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Contact contact : contacts) {
                writer.write(contact.toString());
                writer.newLine();
            }
        }
    }

    private void loadFromFileText(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                Contact contact = new Contact();
                contact.setName(line);
                line = reader.readLine();
                contact.setAddress(line);
                line = reader.readLine();
                contact.setPhone(line);

                contacts.add(contact);
            }
        }
    }
}