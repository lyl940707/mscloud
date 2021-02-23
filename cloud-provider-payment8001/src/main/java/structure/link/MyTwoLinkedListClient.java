package structure.link;

// 双向链表
public class MyTwoLinkedListClient {
    public static void main(String[] args) {
        MyTwoLinkedList myTwoLinkedList = new MyTwoLinkedList();
        myTwoLinkedList.add(new Node2(1));
        myTwoLinkedList.add(new Node2(5));
        myTwoLinkedList.add(new Node2(7));
        myTwoLinkedList.add(new Node2(2));
        myTwoLinkedList.add(new Node2(4));
        System.out.println(myTwoLinkedList.length());
        System.out.println("第一次");
        myTwoLinkedList.showList();
        myTwoLinkedList.remove(10);
        System.out.println("第二次");
        myTwoLinkedList.showList();
        myTwoLinkedList.remove(1);
        myTwoLinkedList.remove(2);
        myTwoLinkedList.remove(7);
        myTwoLinkedList.remove(5);
        myTwoLinkedList.remove(4);
        System.out.println("第三次");
        myTwoLinkedList.showList();
    }
}

class MyTwoLinkedList {
    private Node2 header = new Node2(-1);

    public void add(Node2 node2) {
        if (node2.getNo() < 0) {
            System.out.println("编号不正确,添加失败");
            return;
        }
        Node2 temp = header;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node2);
        node2.setPre(temp);
    }

    public void remove(int no) {
        if (no < 0) {
            System.out.println("编号不正确,删除失败");
            return;
        }
        Node2 temp = header;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            if (temp.getNo() == no) {
                temp.getPre().setNext(temp.getNext());
                if (temp.getNext() != null) {
                    temp.getNext().setPre(temp.getPre());
                }
                return;
            }
        }
    }

    public void showList() {
        if (header.getNext() == null) {
            System.out.println("空链表");
        }
        Node2 temp = header;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            System.out.println(temp);
        }
    }

    public int length() {
        int length = 0;
        Node2 temp = header;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            length++;
        }
        return length;
    }
}

class Node2 {
    private int no;
    private Node2 pre;
    private Node2 next;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node2 getPre() {
        return pre;
    }

    public void setPre(Node2 pre) {
        this.pre = pre;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public Node2(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "no=" + no +
                '}';
    }
}