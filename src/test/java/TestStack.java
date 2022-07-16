import java.util.Stack;

/**
 * @Description TODO
 * @Author linjie
 * @Date 2022/7/13 16:27
 * @Version 1.0
 */
public class TestStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
//        System.out.println(stack.empty());
        stack.add("jack");
        stack.add("Tom");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

}
