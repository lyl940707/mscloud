package structure.stack;


// 用数组实现栈
public class MyStackByArrayClient {
    public static void main(String[] args) {
        MyStackByArray myStackByArray = new MyStackByArray(5);
        myStackByArray.push(1);
        myStackByArray.push(2);
        myStackByArray.push(3);
        myStackByArray.push(4);
        myStackByArray.push(5);
//        myStackByArray.push(6);
        System.out.println("第一次");
        myStackByArray.showList();
        System.out.println("pop");
        System.out.println(myStackByArray.pop());
        System.out.println(myStackByArray.pop());
        System.out.println(myStackByArray.pop());
//        System.out.println(myStackByArray.pop());
//        System.out.println(myStackByArray.pop());
        System.out.println("第二次");
        myStackByArray.showList();
//        System.out.println(myStackByArray.pop());
    }
}

class MyStackByArray {
    private int[] stack;
    // 栈的深度
    private int length;
    private static int count;

    public MyStackByArray(int length) {
        this.length = length;
        stack = new int[length];
    }

    public void push(int i) {
        if (count == length) {
            System.out.println("元素已满");
            return;
        }
        stack[count++] = i;
    }

    public int pop() {
        if (count == 0) {
            throw new RuntimeException("元素为空");
        }
        return stack[--count];
    }

    public void showList(){
        for(int i=count-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}