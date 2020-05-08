import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int n = scan.nextInt();
//        System.out.println(n);
//        int m = scan.nextInt();
//        System.out.println(m);
//        int k = scan.nextInt();
//        System.out.println(k);
//        if (scan.hasNext()) {
//            String str1 = scan.next();
//            System.out.println("输入的数据为：" + str1);
//        }
//        scan.close();
//
        int n = scan.nextInt();
        String[] strs = new String[n];

        for (int i =0; i<n;i++){
            strs[i] = scan.next();
            format(strs[i]);
        }

        String arrto = Arrays.toString(strs);
        System.out.println(arrto);


    }

    private static String format(String str){
        char danwei = str.charAt(str.length()-1);
//        System.out.println(str.charAt(str.length()-1));
        return "1";

        if(danwei =='M'){
            
        }

    }
}
