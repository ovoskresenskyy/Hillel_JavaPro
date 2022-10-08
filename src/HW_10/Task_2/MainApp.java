package HW_10.Task_2;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Phonebook.add(new Contact("Mario", "11-11"));
        Phonebook.add(new Contact("Timon", "22-22"));
        Phonebook.add(new Contact("Pumba", "33-33"));
        Phonebook.add(new Contact("Hulk", "44-44"));
        Phonebook.add(new Contact("Mario", "55-55"));
        Phonebook.add(new Contact("Pumba", "66-66"));
        Phonebook.add(new Contact("Hulk", "77-77"));
        Phonebook.add(new Contact("Pumba", "88-88"));
        Phonebook.add(new Contact("Hulk", "99-99"));
        Phonebook.add(new Contact("Pumba", "88-88"));
        System.out.println();

        System.out.println(Phonebook.find("Timon"));
        System.out.println();

        List<Contact> contactsSearching = Phonebook.findAll("Hulk");
        if (contactsSearching != null ){
            for (Contact contact : contactsSearching) {
                System.out.println(contact);
            }
        }
    }

}
