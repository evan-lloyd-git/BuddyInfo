import java.util.*;
public class AddressBook {
    LinkedList<BuddyInfo> book;

    public AddressBook() {
        book = new LinkedList<BuddyInfo>();
        System.out.println("Address Book");
        System.out.println("Contains linked list of BuddyInfo");
        System.out.println("BuddyInfo objects can be added or removed");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");

    }
    public void addBuddy(BuddyInfo buddy){
        book.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        book.remove(buddy);
    }
}
