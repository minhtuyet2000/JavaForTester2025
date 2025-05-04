import Toan_Tu.Demotoantu;

import java.util.ArrayList;
import java.util.List;

public class Student {
    static int a = 4;
    public static void main(String[] args) {
        sayHello();
        Student name = new Student();
        name.sayHi();
        Student name2 = new Student();
        name2.sayHi();
        System.out.println(A(2, 3));
        System.out.println(B());
        for (int temp : C(10)) {
            System.out.print(temp + ", "); //C(10) la khai bao, print la khong xuong dong
        }
    }
    static void sayHello() {
        System.out.println("hello world"); //co static - khong tra ve
    }
    void sayHi() {
        System.out.println("hi world"); //khong co static - khong tra ve
    }
    static int A(int so1, int so2) {
        return so1 + so2; //tra ve integer
    }
    static int B() {
        return A(2, 3)*2; //tra ve integer
    }
    static List<Integer> C(int number) {
        List<Integer> bosuutap = new ArrayList<>();
        for (int i=0; i <= number; i++) {
            if (i % 2 == 0) {
                bosuutap.add(i);
            }
        }
        return bosuutap;
    }
}

