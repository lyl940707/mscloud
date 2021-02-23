package structure.queue;

import java.util.Scanner;

// 循环队列
public class MyCircleArrayqueueClient {
    public static void main(String[] args) {
        CircleArrayqueueClient circleArrayqueueClient = new CircleArrayqueueClient(4);
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    System.out.println("请添加一个元素：");
                    circleArrayqueueClient.addElement(scan.nextInt());
                    break;
                case 2:
                    try {
                        System.out.println("获取到的元素为"+circleArrayqueueClient.getElement());
                    }catch (Exception e){
                        System.out.println("队列为空");
                    }
                    break;
                case 3:
                    System.out.println(circleArrayqueueClient.isEmpty()?"队列为空":"队列不为空");
                    break;
                case 4:
                    System.out.println(circleArrayqueueClient.isFull()?"队列满了":"队列未满");
                    break;
                case 5:
                    System.out.println("现在的队列数据为：");
                    circleArrayqueueClient.showQueue();
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

class CircleArrayqueueClient {
    private int front;
    private int rear;
    private int maxSize;
    private int count;
    private int[] arr;

    public CircleArrayqueueClient(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        arr = new int[maxSize];
    }

    public void addElement(int element) {
        if (count == maxSize) {
            System.out.println("队列已满，不能添加");
            return;
        }
        arr[rear%maxSize] = element;
        rear++;
        count++;
    }

    public int getElement() {
        if (count < 1) {
            throw new RuntimeException("队列为空");
        }
        int element = arr[front%maxSize];
        front++;
        count--;
        return element;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.printf("%d\t",arr[(front + i) % maxSize]);
        }
    }
}
