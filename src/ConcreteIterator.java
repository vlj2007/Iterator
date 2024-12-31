public class ConcreteIterator implements Iterator<String>{
    private ConcreteCollection collection;
    private int currentIndex = 0;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    @Override
    public String next() {
        return collection.getItem(currentIndex++);
    }
}
