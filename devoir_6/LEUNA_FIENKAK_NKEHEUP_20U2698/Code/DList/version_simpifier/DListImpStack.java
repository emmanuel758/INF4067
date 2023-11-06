public class DListImpStack extends DList implements Stack {

    public void push(Object o) {
        insertTail(o);
    }

    public void pop() {
        removeTail();
    }

    public void top() {
        removeHead();
    }
}
