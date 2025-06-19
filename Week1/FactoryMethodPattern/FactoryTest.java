public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory factory;

        // Create and open Word document
        factory = new WordFactory();
        Document doc1 = factory.createDocument();
        doc1.openDocument();

        // Create and open PDF document
        factory = new PdfFactory();
        Document doc2 = factory.createDocument();
        doc2.openDocument();

        // Create and open Excel document
        factory = new ExcelFactory();
        Document doc3 = factory.createDocument();
        doc3.openDocument();
    }
}
