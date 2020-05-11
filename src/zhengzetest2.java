public class zhengzetest2 {
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

        //判断第一个元素是否相等

        boolean headmatch = !s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.');
//
//        if(lenq==1&&lens==1 && headmatch){
//            return true;
//        }
//
//        if (lenq==2 && p.charAt(1)=='*' && lens==0){
//            return true;
//        }

        //s、p都不为空
        //如果p的第一个元素下一个元素是*
        if(lenq>=2 && p.charAt(1)=='*'){
//            return isMatch(s,p.substring(2)) || (headmatch&&isMatch(s.substring(1),p));

//            if (headmatch){
//                return isMatch(s.substring(1),p);
//            }else {
//                return isMatch(s,p.substring(2));
//            }

            return isMatch(s,p.substring(2))||
                    (headmatch&&isMatch(s.substring(1),p));
        }else if (headmatch){
            isMatch(s.substring(1),p.substring(1));
        }else {
            return false;
        }
        return false;

    }
}
