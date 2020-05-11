public class zhengzetest {
    public static void main(String[] args) {

    }

    private static boolean isMatch(String s,String p){
        int lens = s.length();
        int lenq = p.length();

        //两者都为空
        if (lens==0 && lenq==0){
            return true;
        }
        //s不空p为空
        if (lens != 0 && lenq==0){
            return false;
        }
        //s空p不为空
        if (lens==0){
            if (p.charAt(lenq-1) =='.' || p.charAt(lenq-1)=='*'){
                for (int i = lenq-2;i>=0;i--){
                    if (p.charAt(i)!='.'){
                        return false;
                    }
                }
                return true;
            }else{
                return  false;
            }
        }
        //s、p都不为空
        for (int j=lens-1;j>=0;j++){
            for (int k = lenq-1;k>=0;k++){
                char sc = s.charAt(j);
                char pc = p.charAt(k);
                if (sc != pc && sc!='.' && sc!='*'){
                    return false;
                }


            }
        }








        return true;

    }
}
