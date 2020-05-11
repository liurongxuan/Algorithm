import java.util.Scanner;

public class nmcount {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int k = jisuan(n,m);

        System.out.println("总数"+k);

    }

    private static int jisuan(int n,int m){
        if (n<0){
            return 0;
        }

        int count_tatol = 0;
        for (int i=1;i<=n;i++){
            System.out.println("数字"+i+"包含*****"+cout(i,m)+"*****个"+m);
            count_tatol+=cout(i,m);

        }

        return count_tatol;

    }

    private static int cout(int i,int m){
        int couts = 0;
        for (;i>0;i=i/10){
            if((i%10)==m){
                ++couts;
            }
//            System.out.println(couts);
//            ++couts;
        }

        return couts;

    }





}

