public class EqualsTest {

    public static void main(String[] args) {

        //String은 할당 된 게 아님
        String a = "abc";
        String b = "abc";

//        a = new String("abc");
//        b = new String("abc");

        a = a +"a"; //연산이 들어가는 순간 객체로 생성
        b = b + "a";

        System.out.println(a==b); //false
        System.out.println(a.equals(b)); //true

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        
        //값이 둘이 같으니까 같다
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }
}
