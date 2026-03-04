package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        System.out.println(queue.first());

        System.out.println(queue);

        System.out.println(queue.dequeue());

        System.out.println(queue);

        System.out.println(queue.first());

    }
}
