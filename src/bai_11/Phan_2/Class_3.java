package bai_11.Phan_2;

public class Class_3 extends Hamxay {
    public Class_3(int ID, String address, String name, String phone) {
        super(ID, address, name, phone); //Khong the bỏ phone
    }
    
    public static void main(String[] args) {
        Class_3 name = new Class_3(183, "23 duong so 9", "minh tuyet", "0842496471");
        name.getinfo();
        System.out.println(name.Birthday("20/01/2000"));
    }
}
