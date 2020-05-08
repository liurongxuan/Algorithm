import java.util.*;

public class cipantest {
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
        }

        String arrto = Arrays.toString(strs);
        System.out.println(arrto);

        Map<Integer,String> map = new HashMap<>();

        for (int j=0; j<n;j++){
            map.put(format(strs[j]),strs[j]);
        }

        int arr[] = new int[n];

        Iterator it = map.keySet().iterator();
        int m =0;
        while (it.hasNext()){
            int key = Integer.valueOf(it.next().toString());
            arr[m] =key;
            m++;

        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        String [] strsfinal = new String[n];

        for (int k = 0;k<n;k++){
            strsfinal[k] = map.get(arr[k]);
        }

        System.out.println(Arrays.toString(strsfinal));

        System.out.println(map);






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
