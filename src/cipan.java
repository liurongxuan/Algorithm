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

        for (int m = 0;m<n-1;m++){
            for(int k=m+1;k<n-1;k++){
                String temp = "";

                if (format(strs[m])>=format(strs[k])){
                    temp =strs[m];
                    strs[m] = strs[k];
                    strs[k] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(strs));





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
