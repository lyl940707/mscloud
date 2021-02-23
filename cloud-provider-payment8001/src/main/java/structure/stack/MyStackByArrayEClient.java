package structure.stack;


//用泛型实现
public class MyStackByArrayEClient {
    public static void main(String[] args) {
        MyStackByArrayE<Person> myStackByArray = new MyStackByArrayE<>(5);
        myStackByArray.push(new Person("1", "lyl"));
        myStackByArray.push(new Person("2", "cx"));
        myStackByArray.push(new Person("3", "zjl"));
        myStackByArray.push(new Person("4", "rpg"));
        myStackByArray.push(new Person("5", "qer"));
        System.out.println(myStackByArray.pop());
        System.out.println(myStackByArray.pop());
        System.out.println(myStackByArray.pop());
        System.out.println(myStackByArray.pop());
        System.out.println(myStackByArray.pop());
    }
}

class MyStackByArrayE<V> {
    private Object[] stack;
    private int length;
    private int count;//表示栈顶

    public MyStackByArrayE(int length) {
        this.length = length;
        stack = new Object[length];
    }

    public void push(V i) {
        if (count == length) {
            System.out.println("元素已满");
            return;
        }
        stack[count++] = i;
    }

    public V pop() {
        if (count == 0) {
            throw new RuntimeException("元素为空");
        }
        return (V) stack[--count];
    }
}

class Person {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Person(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}