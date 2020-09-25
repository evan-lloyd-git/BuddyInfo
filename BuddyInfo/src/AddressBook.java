import java.util.*;
public class AddressBook {
    LinkedList<BuddyInfo> book;

    public AddressBook() {
        book = new LinkedList<BuddyInfo>();
        System.out.println("Address Book");
        System.out.println("Contains linked list of BuddyInfo");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");

    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
    public void addBuddy(BuddyInfo buddy){
        book.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        book.remove(buddy);
    }
}
