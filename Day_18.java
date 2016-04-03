public class Solution {

    private LinkedList<Character> stack;
    private LinkedList<Character> queue;

    public Solution() {
        stack = new LinkedList<>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(char ch) {
        stack.add(Character.valueOf(ch));
    }

    public void enqueueCharacter(char ch) {
        queue.add(Character.valueOf(ch));
    }

    public char popCharacter() {
        return stack.removeLast().charValue();
    }

    public char dequeueCharacter() {
        return queue.remove(0).charValue();
    }
