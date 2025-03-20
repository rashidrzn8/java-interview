import java.util.*;

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

//        String[] a = {"demo","dede","dedmo"};
//        String[] b = {"dem","dede","dedmo"};
//
//        Integer[] ss = {3,4,5,6};
//        Integer[] s3 = {3,4,5,6};
//
//        boolean responce= isEqaual(ss,s3);
//
//        if (responce){
//            System.out.println("all are equal");
//        }else {
//            System.out.println("not equal");
//        }




        //swap with temp variable
//        int a= 12;
//        int b= 22;
//
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("after swapping value of a is "+a);
//        System.out.println("after swapping value of b is "+b);
//
//        int d= 12;
//        int e= 22;
//
//        d = d+e;
//        e=d-e;
//        d= d-e;
//        System.out.println("after swapping value of d is "+d);
//        System.out.println("after swapping value of e is "+e);


//check for the prime number
//        for (int i =2; i<=100;i++){
//            boolean isPrime =true;
//            for (int j=2;j<i;j++){
//                if (i%j ==0){
//                    isPrime=false;
//                    break;
//                }
//            }
//               if (isPrime){
//                   System.out.print(i+" ");
//               }
//        }


//        int number = 2345;
//        int res =0;
//
//        while (number!=0){
//            int num= number%10;
//            res = (res * 10) + num;
//            number = number/10;
//        }
//        System.out.println(res+" csds");

//        String demo = "my name is rasssshid";
//        char[] demo2 = demo.toCharArray();
//        Map<Character,Integer> mapp = new HashMap<>();
//
//        for (int i =0 ;i<demo2.length;i++){
//            if (demo2[i] != ' '){
//            if (mapp.containsKey(demo2[i])){
//                mapp.put(demo2[i], mapp.get(demo2[i])+1);
//
//            }
//            else{
//            mapp.put(demo2[i],1);
//        }}}
//
//        Set<Character> keys = mapp.keySet();
//        for(char kk:keys){
//            System.out.println(kk+ " "+ mapp.get(kk));
//        }

        int[] arr = {2,4,5,6,2,4,5,6,664,645};
        Arrays.sort(arr);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        int temp[] = new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++] = arr[arr.length-1];

        for(int jj=0; jj< j ;jj++){
            System.out.println(temp[jj]);
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
