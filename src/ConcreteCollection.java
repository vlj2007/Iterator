import java.util.ArrayList;
import java.util.List;

// Конкретная коллекция
public class ConcreteCollection implements  IterableCollection<String>{
    private List<String> items = new ArrayList<>();

    public void add(String item) {
        items.add(item);
    }

    public int count() {
        return items.size();
    }

    @Override
    public Iterator<String> createIterator() {
        return new ConcreteIterator(this);
    }

    public String getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}
