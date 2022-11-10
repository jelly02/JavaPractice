public class Variable {

    public static void main(String[] args) {
        code3();
    }

//    public static void code1(){
//
//        int a = 10;
//        a = 11;
//
//        System.out.println("a value = "+ a);
//
//        fnPassByValue(a);
//
//        System.out.println("a value = "+ a);
//    }
//
//    public static void code2(){
//
//        String a = "ABC";
//        a = "DEF";
//
//        System.out.println("a value = "+ a);
//
//        fnPassByRef(a);
//    }
//
//    public static void fnPassByValue(int b){
//
//        System.out.println("b value = "+ b);
//
//        b = 20;
//
//        System.out.println("b value = "+ b);
//
//    }
//
//    public static void fnPassByRef(String b){
//        System.out.println("b value = "+ b);
//
//        b = "123";
//
//        System.out.println("b value = "+ b);
//    }

    public static void code3(){
        var main_array = new int[] {1,2,3};
        System.out.println( "array_value ="+ main_array);
        fnPassByRef2(main_array);
    }

    public static void fnPassByRef2(int[] ref_array){
        System.out.println("b value "+ ref_array[0] + ref_array[1] +  ref_array[2]);
        ref_array[0] = 19;
        System.out.println("b value "+ ref_array[0] + ref_array[1] +  ref_array[2]);
    }


}
