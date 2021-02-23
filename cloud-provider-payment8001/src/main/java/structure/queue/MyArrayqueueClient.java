package structure.queue;

import java.util.Scanner;

//用数组实现队列（非环形队列）
public class MyArrayqueueClient {
    public static void main(String[] args) {
        MyArrayqueue myArrayqueue = new MyArrayqueue(5);
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    myArrayqueue.addElement(scan.nextInt());
                    break;
                case 2:
                    System.out.println(myArrayqueue.getElement());
                    break;
                case 3:
                    System.out.println(myArrayqueue.isEmpty());
                    break;
                case 4:
                    System.out.println(myArrayqueue.isFull());
                    break;
                case 5:
                    myArrayqueue.showNowQueue();
                    break;
                case 6:
                    loop = false;
                    scan.close();
                    break;
                default:
                    break;
            }
        }
    }
}

class MyArrayqueue {
    //最大容量
    private int maxSize;
    //指向队列头的前一个位置
    private int front;
    //指向队列尾
    private int rear;
    //数组
    private int[] arr;

    public MyArrayqueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1;
        this.rear = -1;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addElement(int element) {
        if (isFull()) {
            throw new RuntimeException("队列满，不能存数据");
        }
        rear++;
        arr[rear] = element;
    }

    public int getElement() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }

    //只显示未出队的数据
    public void showNowQueue() {
        if (front == rear) {
            System.out.println("现在队列为空");
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}