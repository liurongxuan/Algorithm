import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zhishu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> l = new ArrayList();
        while (scanner.hasNext()){
            int num = scanner.nextInt();

            while(num!=0){
                l.add(num);
                num = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(l.toArray());


    }

    private static boolean iszs(int n){
        if (n<=3 ){
            return n>1;
        }
        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
