package unlp.oo1.bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<>();
    }

    @Override
    public boolean add(T element) {
    	boolean added=false;
    	if(this.elements.containsKey(element)) {
    		this.elements.replace(element, this.elements.get(element)+1);
    	}else {
    		this.elements.put(element, 1);
    		added = true;
    	}
        return added;
    }

    @Override
    public int occurrencesOf(T element) {
        return this.elements.containsKey(element)?this.elements.get(element):0;
    }

    @Override
    public void removeOccurrence(T element) {
    	int cant = this.occurrencesOf(element);
    	if (cant >0) {
    		if(cant == 1) {
    			this.elements.remove(element);
    		}else {
    			this.elements.replace(element,cant -1);
    		}
    	}
    }

    @Override
    public void removeAll(T element) {
   		this.elements.remove(element);
    }

    @Override
    public int size() {
    	return this.elements.values().stream().mapToInt(e->e).sum();
    }
    
    public int uniqueSize() {
        return this.elements.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
}
}