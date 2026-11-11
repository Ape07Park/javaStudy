package chepter4.collection.deque.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    private Queue<Task> tasks = new ArrayDeque<>();
    // 코드 작성

    public void addTask(Task task) {
        tasks.add(task);
    }

    public int getRemainingTasks() {

        return tasks.size();
    }

    public void processNextTask() {

        Task task = tasks.element();

        // System.out.println(task.execute());

        tasks.remove();
    }


}
