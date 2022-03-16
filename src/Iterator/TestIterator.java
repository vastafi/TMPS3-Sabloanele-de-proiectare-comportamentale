package Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Name nameRepository = new Name();
        Operations operationsRepository = new Operations();

        for(Iterator iter = nameRepository.getIterator();
            iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
            for (Iterator i = operationsRepository.getIterator();
             i.hasNext(); ) {
           String operations = (String) i.next();
           System.out.println("Operations: " + operations);
        }
    }
 }
}

