import java.util.*;

public class cipan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[] strs = new String[n];

        for (int i =0; i<n;i++){
            strs[i] = scan.next();
        }

        String arrto = Arrays.toString(strs);
        System.out.println(arrto);





    }

    private static int format(String str){
        int len  = str.length();
        System.out.println(len);
        char danwei = str.charAt(len-1);
//        System.out.println(str.charAt(str.length()-1));
//        return "1";

        if(danwei =='T'){
            return (Integer.valueOf(str.substring(0,len-1)))*1000*1000;
        }
        if(danwei =='G'){
            return (Integer.valueOf(str.substring(0,len-1)))*1000;
        }
        if(danwei == 'M'){
            return Integer.valueOf(str.substring(0,len-1));
        }

        return 0;

    }
}
