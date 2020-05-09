import java.util.Scanner;

public class nmcount {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int k = jisuan(n,m);

        System.out.println(k);

    }

    private static int jisuan(int n,int m){
        if (n<0){
            return 0;
        }

        int count_tatol = 0;
        for (int i=1;i<=n;i++){
            count_tatol+=cout(i,m);

        }

        return count_tatol;

    }

    private static int cout(int i,int m){
        int cout1 = 0;
        if ((i/10) != 0){
            if (i%10 ==m){
                cout1++;
            }
        }else{
            i = i/10;
            cout(i,m);
        }

        return cout1;

    }





}

