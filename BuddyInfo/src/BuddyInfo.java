public class BuddyInfo {




    private String name;
    public String address;
    public int phoneNumber;

    public static void main(String[] args) {
        //BuddyInfo buddy = new BuddyInfo("void", "void", "void");
        //buddy.setName("Homer");
        //System.out.println("Hello " + buddy.getName());
    }
    public BuddyInfo(String name, String address, String phoneNumber){}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
