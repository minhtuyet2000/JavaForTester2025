package Toan_Tu;


import java.util.*;

public class Demotoantu {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("D");
        name.add("C");
        name.add("B");
        name.add("C");
        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("C"));
        System.out.println(name.isEmpty());
        name.remove("C");
        System.out.println(name);
        name.clear();
        System.out.println(name);

        List<Integer> name2 = new ArrayList<>();
        name2.add(52);
        name2.add(12);
        name2.add(42);
        name2.add(14);
        System.out.println(name2);
        name2.remove(1);
        name2.set(2, 24);
        System.out.println(name2);
        System.out.println(name2.get(1)); //vi tri [1] co gia tri gi?
        System.out.println(name2.indexOf(24)); //24 dau tien nam o vi tri nao?
        System.out.println(name2.lastIndexOf(24)); //24 cuoi cung nam o vi tri nao?

        List name4 = new ArrayList();
        name4.add(24);
        name2.removeAll(name4); //xoa phan tu thuoc name4 khoi name2
        System.out.println(name2);
        name4.add(52);
        name2.retainAll(name4); //xoa phan tu khong thuoc name4
        System.out.println(name2);

        Map<String, Integer> name3 = new HashMap<>();
        name3.put("Math", 75);
        name3.put("History", 80);
        name3.put("Math", 65);
        name3.replace("Math", 70);
        System.out.println(name3);
        System.out.println(name3.get("Math"));
        System.out.println(name3.containsKey("Math"));
        System.out.println(name3.containsValue(80));

        String a = "minh tuyet";
        String b = "minh";
        String c = "MINH";

        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(a.equals(b));
        System.out.println(a.contains(b));
        System.out.println(b.equalsIgnoreCase(c));

        System.out.println(c.charAt(2));
        System.out.println(a.indexOf("t"));
        System.out.println(a.lastIndexOf("t"));
        System.out.println(a.substring(5));
        System.out.println(a.substring(0, 4));
        System.out.println(a.replace("tuyet", "nguyet"));
        System.out.println(a);
        System.out.println(a.split(" ")[1]); //2 gia tri cach nhau boi khoang trang, lay gia tri thu 2
        String g = " ";
        System.out.println(g.isEmpty());
        System.out.println(g.isBlank());
    }}







