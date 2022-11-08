import java.util.*;
public class problem4{
    public static void remAllStack(Stack<Object> stack, Object item) {
        Stack<Object> temp = new Stack<Object>();
        while (!stack.isEmpty()) {
                    Object obj = stack.pop();
                    if (!obj.equals(item))
                        temp.push(obj);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }
    public static void remAllQueue(Queue<Object> que, Object item) {
        int size = que.size();
        for (int i = 0; i < size; i++) {
            Object obj = que.remove();
            if (!obj.equals(item))
                que.add(obj);
        }
    }
}