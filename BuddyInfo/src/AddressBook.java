//A small change to the system added on GitHub
import java.util.*;
public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Evan", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }
}
