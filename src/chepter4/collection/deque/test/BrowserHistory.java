package chepter4.collection.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> stack = new ArrayDeque<>();

    public void visitPage (String webPage) {

        stack.push(webPage);
    }

    public String goBack () {

        stack.pop();
        System.out.println(stack);

        return stack.getFirst();
    }

}
