package bai_11.Phan_1;

public class Hamxaydung {
    private float VAT = 0.1f;
    public int tongtien = 100;
    public float laisuat() {
        return (tongtien * (1 - VAT));
    }
    int id;
    String name;
    public int house;

    public void so(int a, String b) {
        id = a;
        name = b;
        System.out.println("id la " + id + " ten la " + name);

    }
    void chu() {
        System.out.println("id la " + id + " ten la " + name);
    }
    public static void main(String[] args) {
        Phamvitruycap number2 = new Phamvitruycap();
        Hamxaydung hamxaydung = new Hamxaydung();
        System.out.println(hamxaydung.laisuat());
        hamxaydung.so(12, "nga");
        hamxaydung.chu();
    }
}
