public class Client {
    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        collection.add("Item 1");
        collection.add("Item 2");
        collection.add("Item 3");

        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
