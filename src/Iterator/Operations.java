package Iterator;

public class Operations implements Collections {
    public String operations[] = {"Add to card 500 $", "Cash withdrawal", "Transfer to another account 20$","Add to card 20$"};

    @Override
    public Iterator getIterator() {
        return new CollectionofOperationsIterate();
    }

    private class CollectionofOperationsIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < operations.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return operations[i++];
            }
            return null;
        }
    }
}