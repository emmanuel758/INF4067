public class Adaptateur implements Stack {
    private DList dlist;

    @Override
    public void push(Object o) {
        dlist.insertTail(o);
    }

    @Override
    public void pop() {
        dlist.removeTail();
    }

    @Override
    public void top() {
        dlist.removeHead();
    }
}
