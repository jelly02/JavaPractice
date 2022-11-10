public class StringTest {

    public static void main(String[] args) {
        
        //String 과 StringBuffer의 속도 차이 확인

        StringBuffer sb = new StringBuffer();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            sb.append("char");
            sb.append(i);
        }

        System.out.println(System.currentTimeMillis() - startTime +"ms (1)");

        String str = new String();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            str = str + "char";
            str = str + i;
        }

        System.out.println(System.currentTimeMillis() - startTime +"ms (2)");

    }
}
