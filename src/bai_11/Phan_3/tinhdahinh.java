package bai_11.Phan_3;

public class tinhdahinh {
    public static void main(String[] args) {
        Bank b;
        b = new Vietcombank();
        System.out.println(b.get());
        System.out.println(b.add(1));
        Vietcombank c = new Vietcombank();
        System.out.println(c.add(1));
        System.out.println(c.add(1,2));
        System.out.println(c.get());

    }
}
