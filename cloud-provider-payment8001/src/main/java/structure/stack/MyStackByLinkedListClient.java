package structure.stack;

// 用链表实现栈
// 使用头插法
public class MyStackByLinkedListClient {
    public static void main(String[] args) {
        MyStackByLinkedList myStackByLinkedList = new MyStackByLinkedList();
        myStackByLinkedList.push(1);
        myStackByLinkedList.push(2);
        myStackByLinkedList.push(3);
        myStackByLinkedList.push(4);
        myStackByLinkedList.push(5);
        System.out.println("第一次打印");
        myStackByLinkedList.showList();
        System.out.println("出栈");
        System.out.println(myStackByLinkedList.pop());
        System.out.println(myStackByLinkedList.pop());
        System.out.println(myStackByLinkedList.pop());
        System.out.println(myStackByLinkedList.pop());
//        System.out.println(myStackByLinkedList.pop());
        System.out.println("第二次打印");
        myStackByLinkedList.showList();
        System.out.println("a".hashCode());
        System.out.println("A".hashCode());
    }
}

class MyStackByLinkedList {
    private MyStackByLinkedListNode first;
    private int count;

    public void push(int data) {
        if (count == 0) {
            first = new MyStackByLinkedListNode(data);
        } else {
            MyStackByLinkedListNode addNode = new MyStackByLinkedListNode(data);
            addNode.setNext(first);
            first=addNode;
        }
        count++;
    }

    public int pop() {
        if (count == 0) {
            throw new RuntimeException("元素为空");
        } else {
            count--;
            MyStackByLinkedListNode temp=first;
            first = first.getNext();
            return temp.getData();
        }
    }

    public void showList(){
        MyStackByLinkedListNode temp=first;
        if (count == 0) {
            throw new RuntimeException("元素为空");
        } else {
            while (temp!=null){
                System.out.println(temp.getData());
                temp=temp.getNext();
            }
        }
    }
}

class MyStackByLinkedListNode {
    private int data;
    private MyStackByLinkedListNode next;

    public MyStackByLinkedListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyStackByLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyStackByLinkedListNode next) {
        this.next = next;
    }
}