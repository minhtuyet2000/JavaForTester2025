import java.util.Arrays;
public class mang {
    public static void main(String[] args) {
        String sv[] = new String[] {"c", "b", "a"}; //String sv[] = {"c", "b", "a"};
        System.out.println(Arrays.toString(sv));
        int star = 1;
        int end = 3;
        Arrays.sort(sv, star, end);
        System.out.println(Arrays.toString(sv));
        Arrays.fill(sv, star, end, "x");
        System.out.println(Arrays.toString(sv));
        String sv2[] = Arrays.copyOfRange(sv, star, end);
        System.out.println(Arrays.toString(sv2));

        String a = "Hello, World, How, Are, You?";
        String b[] = a.split(",");
        System.out.println(Arrays.toString(b));
        System.out.println(b[1]);
    }
}
