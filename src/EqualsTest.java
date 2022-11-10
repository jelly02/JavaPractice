public class EqualsTest {

    public static void main(String[] args) {

        //String은 할당 된 게 아님
        String a;
        String b;

        a = new String("abc");
        b = new String("abc");

        System.out.println(a==b); //false

    }
}
