package structure.stack;

import java.util.Stack;

// 实现逆波兰表达式的计算器
public class PolandClient {
    public static void main(String[] args) {
        String polan="1 4 + 5 * 6 -";
        System.out.println(PolandClient.caculate(PolandClient.toArray(polan)));
    }

    public static String[] toArray(String str){
        String[] polanStr=str.split(" ");
        return  polanStr;
    }

    public static int caculate(String[] strs){
        Stack<String> stack=new Stack<String>();
        for(String str : strs){
            // 使用正则表达式取数
            if(str.matches("\\d+")){
                stack.push(str);
            }else{
                int num1=Integer.parseInt(stack.pop());
                int num2=Integer.parseInt(stack.pop());
                if("+".equals(str)){
                    stack.push((num2+num1)+"");
                }else if ("-".equals(str)){
                    stack.push((num2-num1)+"");
                }else if ("*".equals(str)){
                    stack.push((num2*num1)+"");
                }else if ("/".equals(str)){
                    stack.push((num2/num1)+"");
                }else{
                    throw new RuntimeException("运算符有误！！！");
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
