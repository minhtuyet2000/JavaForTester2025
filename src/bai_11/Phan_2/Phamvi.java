package bai_11.Phan_2;

public class Phamvi {
    int ID;
    String address;
    String name;
    private String birthday;
    public Phamvi(int ID, String address, String name) {
        this.ID = ID;
        this.address = address;
        this.name = name;
    }

    public String Birthday(String birthday) {
        this.birthday = birthday;
        return birthday;
    }

    public void getinfo() {
        System.out.println("ID: " + ID + "\nDia chi: " + address + "\nTen: " + name);
    }
}
