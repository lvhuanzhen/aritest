public class CompareTest {
    public static void main (String[] args){

    //比较运算符
    // ==  ！=  >  <  >=  <=  instanceof

    //结论：1.比较运算符的结果是blliean类型
         //2.区分 == 和 =

        int i = 10;
        int j = 20;

        System.out.println(i == j);//false
        System.out.println(i = j);//20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);//false
        System.out.println(b2 == b1);//true

    }

}
