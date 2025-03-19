import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
//        String demo = "My name is Rashid";
//        char[] charr = demo.toCharArray();
//        String result = "";
//
//        for (int i =0 ; i< demo.length();i++){
//            if (charr[i] != ' '){
//                result= result+charr[i];
//            }
//        }
//        System.out.println(result);

        // sum of numbers
//        int number = 2345;
//        int newNumber = 0;
//
//        while (number>0) {
//
//            int last =  number % 10;  //5
//            newNumber = newNumber + last;       //5
//            number =   number / 10;
//        }
//        System.out.println(newNumber);

        String[] a = {"demo","dede","dedmo"};
        String[] b = {"dem","dede","dedmo"};

        Integer[] ss = {3,4,5,6};
        Integer[] s3 = {3,4,5,6};

        boolean responce= isEqaual(ss,s3);

        if (responce){
            System.out.println("all are equal");
        }else {
            System.out.println("not equal");
        }



    }
    public static boolean isEqaual(Object[] a, Object[] b){
        boolean res = true;
        if (a.length != b.length){
            res=false;
        } else if (a.length == b.length) {
            for (int i = 0;i<a.length;i++){
                if (a[i] != b[i]){
                    res = false;
            }
        }

        }
        return res;
    }
}
