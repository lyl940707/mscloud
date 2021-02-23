package structure.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        test(10);
        System.out.println(test2(6));
    }

    public static void test(int n){
        if(n>5){
            test(n-1);
        }
        System.out.println("n="+n);
    }

    public static int test2(int n){
        if(n==1){
            return 1;
        }else {
            return test2(n-1)+n*n;
        }
    }
}
