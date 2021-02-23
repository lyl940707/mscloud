package structure.link;


import java.util.Stack;

// 单向链表
public class MyOneLinkedListClient {
    public static void main(String[] args) {
//        MyOneLinkedList myOneLinkedList = new MyOneLinkedList();
//        myOneLinkedList.add(new Node(1, "lyl", 1));
//        myOneLinkedList.add(new Node(2, "lyl2", 2));
//        myOneLinkedList.add(new Node(3, "lyl3", 3));
//        System.out.println("删除前");
//        myOneLinkedList.list();
//        myOneLinkedList.remove(2);
//        myOneLinkedList.remove(3);
//        System.out.println("删除后");
//        myOneLinkedList.list();
        MyOneLinkedList myOneLinkedList2 = new MyOneLinkedList();
        myOneLinkedList2.addBySort(new Node(3, "lyl", 1));
        myOneLinkedList2.addBySort(new Node(1, "lyl2", 2));
        myOneLinkedList2.addBySort(new Node(2, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(8, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(8, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(6, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(98, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(32, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(15, "lyl3", 3));
        myOneLinkedList2.addBySort(new Node(76, "lyl3", 3));
        myOneLinkedList2.change(new Node(76, "lyl00000", 222));
        myOneLinkedList2.change(new Node(72, "lyl00000", 222));
        myOneLinkedList2.remove(1);
        myOneLinkedList2.list();
        System.out.println(myOneLinkedList2.length());
        System.out.println("反转");
        myOneLinkedList2.reverse();
        myOneLinkedList2.list();
        System.out.println("逆序打印");
        myOneLinkedList2.printLinkedList();
        System.out.println("逆序打印后的链表结构");
        myOneLinkedList2.list();

    }
}

class MyOneLinkedList {
    // 初始化头结点，不存放具体数据
    private Node header = new Node(0, null, 0);

    // 需要一个辅助变量temp
    public void add(Node node) {
        Node temp = header;
        // 当退出循环时，temp指向链表最后
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void change(Node node) {
        Node temp = header;
        boolean flag = false;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.no == node.no) {
                flag = true;
                break;
            }
        }
        if (flag) {
            temp.age = node.age;
            temp.name = node.name;
        } else {
            System.out.println("未找到该节点，不能修改");
        }
    }

    // 链表反转
    public void reverse() {
        if (header.next==null) {
            return;
        }
        // 创建一个新的头结点
        Node reverseNode = new Node(0, null, 0);
        // 遍历原链表
        Node cur = header.next;
        Node next = null;
        // 头插法
         while (cur != null) {
            next= cur.next;
            cur.next=reverseNode.next;
            reverseNode.next=cur;
            cur=next;

        }
        header.next = reverseNode.next;
    }

    // 根据编号升序插入
    public void addBySort(Node node) {
        Node temp = header;
        while (temp.next != null) {
            Node pre = temp;
            temp = temp.next;
            if (node.no == temp.no) {
                System.out.println("已存在相同编号的数据");
                return;
            } else if (node.no < temp.no) {
                pre.next = node;
                node.next = temp;
                return;
            }
        }
        temp.next = node;
    }

    // 显示链表
    public void list() {
        Node temp = header;
        while (temp.next != null) {
            temp = temp.next;
            System.out.println(temp.toString());
        }
    }

    public Node get(int no) {
        Node temp = header;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.no == no) {
                return temp;
            }
        }
        return null;
    }

    public void remove(int no) {
//        Node temp=header;
//        while(temp.next!=null){
//            Node pre=temp;
//            temp=temp.next;
//            if(temp.no == no){
//                pre.next=temp.next;
//                break;
//            }
//        }
        // 两种都可以，第二种是直接找到删除节点的前一个节点
        Node temp = header;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                if (temp.next.no == no) {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }

        }
    }

    public int length() {
        int count = 0;
        Node temp = header;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //从尾到头打印链表
    // 方式一，先反转再打印，这个会破坏链表的结构
    // 方式二，利用栈的先进后出的特性打印
    public void printLinkedList(){
        Stack<Node> stack=new Stack<>();
        Node temp=header;
        while (temp.next!=null){
            stack.push(temp.next);
            temp=temp.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

class Node {
    public int no;
    public String name;
    public int age;
    public Node next;

    public Node(int no, String name, int age) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    public boolean hasNext() {
        return this.next != null;
    }


    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}