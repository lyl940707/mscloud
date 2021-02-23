package structure.link;


// 单向环形链表（约瑟夫问题:依次出列的编号序列）
public class MyCircleOneLinkedListClient {
    public static void main(String[] args) {
        MyCircleOneLinkedList myCircleOneLinkedList = new MyCircleOneLinkedList();
        myCircleOneLinkedList.add(new Node3(1));
        myCircleOneLinkedList.add(new Node3(2));
        myCircleOneLinkedList.add(new Node3(3));
        myCircleOneLinkedList.add(new Node3(4));
        myCircleOneLinkedList.add(new Node3(5));
//        myCircleOneLinkedList.add(new Node3(6));
//        myCircleOneLinkedList.add(new Node3(7));
        System.out.println("第一次");
        myCircleOneLinkedList.showList();
//        myCircleOneLinkedList.remove(1);
//        myCircleOneLinkedList.remove(2);
//        myCircleOneLinkedList.remove(3);
//        myCircleOneLinkedList.remove(4);
        System.out.println("第二次");
        myCircleOneLinkedList.showList();
        System.out.println("链表长度为:"+myCircleOneLinkedList.length());
        System.out.println("出圈顺序");
        myCircleOneLinkedList.yuesefu(1, 2, myCircleOneLinkedList.length());
    }
}

class MyCircleOneLinkedList {
    private Node3 first;

    public void add(Node3 node3) {
        if (first == null) {
            first = node3;
            first.setNext(first);
        } else {
            Node3 temp = first;
            while (temp.getNext() != first) {
                temp = temp.getNext();

            }
            temp.setNext(node3);
            node3.setNext(first);
        }
    }

    public void remove(int no) {
        if (first == null) {
            System.out.println("链表为空");
            return;
        }
        Node3 helper = first;
        // 使helper指向最后一个节点
        while (helper.getNext() != first) {
            helper = helper.getNext();
        }
        if (helper == first) {
            if (first.getNo() == no) {
                first = null;
                return;
            } else {
                System.out.println("没有" + no + "节点");
                return;
            }
        } else {
            while (first.getNext() != first) {
                if (first.getNo() != no) {
                    first = first.getNext();
                    helper = helper.getNext();
                } else {
                    first = first.getNext();
                    helper.setNext(first);
                    break;
                }
            }
        }
    }

    public void yuesefu(int start, int step, int length) {
        if (first == null || start > length || start < 1) {
            System.out.println("输入有误");
            return;
        }
        Node3 helper = first;
        while (helper.getNext() != first) {
            helper = helper.getNext();
        }
        // 先将first和helper后移start个位置
        for (int i = 1; i < start; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }

        while (true) {
            if (helper == first) {
                System.out.println(first.getNo());
                break;
            }
            // 自己也要报数，所以循环step-1
            for (int i = 0; i < step - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println(first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }

    }

    public void showList() {
        Node3 temp = first;
        if (temp == null) {
            System.out.println("链表为空");
            return;
        }
        do {
            System.out.println(temp);
            temp = temp.getNext();
        } while (temp != first);
    }

    public int length() {
        int i = 1;
        if (first == null) {
            return 0;
        }
        Node3 temp = first;
        while (temp.getNext() != first) {
            i++;
            temp = temp.getNext();
        }
        return i;
    }
}

class Node3 {
    private int no;
    private Node3 next;

    public Node3(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node3{" +
                "no=" + no +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node3 getNext() {
        return next;
    }

    public void setNext(Node3 next) {
        this.next = next;
    }
}
