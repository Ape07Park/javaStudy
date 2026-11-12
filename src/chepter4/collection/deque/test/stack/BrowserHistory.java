package chepter4.collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> stack = new ArrayDeque<>();

    public void visitPage (String webPage) {
        System.out.println("방문: " + webPage);
        stack.push(webPage);
    }

    public String goBack () {

        stack.pop();

        System.out.println("뒤로가기: " + stack.getFirst());

        return stack.getFirst();
    }

}
