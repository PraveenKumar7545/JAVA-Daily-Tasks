interface Printable {

    void print();
}

class Document implements Printable {

    @Override
    public void print() {
        System.out.println("Printing document");
    }
}

public class Q08_Interface {

    public static void main(String[] args) {

        Document document = new Document();

        document.print();
    }
}