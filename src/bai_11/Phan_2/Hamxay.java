package bai_11.Phan_2;

public class Hamxay extends Phamvi{
    String phone;
    public Hamxay(int ID, String address, String name, String phone) {
        super(ID, address, name);
        this.phone = phone;
    }

    public void getinfo() {
        super.getinfo();
        System.out.println("ID: " + ID + "\nDia chi: " + address + "\nTen: " + name + "\nPhone: " + phone);
    }
}
