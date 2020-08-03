import java.util.ArrayList;

/**
 * Created by Qin on 2020/4/8.
 */
public class MyQueue {
    public static void main(String[] args){
        MyQueue queue=new MyQueue();
       queue.push(1);
       queue.push(2);
        System.out.println( queue.peek());
        System.out.println( queue.pop());
        System.out.println(queue.empty());
    }
    private ArrayList<Integer> stack;

    //构造函数
    public MyQueue() {

        stack = new ArrayList<Integer>();
    }

    //将一个元素放在队列尾部
    void push(int x) {
        stack.add(stack.size(), x);
    }

    //从队列移除首元素
    int pop() {
        int a=stack.get(0);
        stack.remove(0);
        return a;
    }

    //返回队列首元素
    int peek() {
        return stack.get(0);
    }

    //判断队列是否为空
    boolean empty() {
        Boolean flag = stack.isEmpty();
        return flag;
    }

}
