public class FactoryTest {
    public static void main(String[] args) {
        DocumentFactory factory;

        factory = new WordFactory();
        Document doc1 = factory.createDocument();
        doc1.openDocument();

        factory = new PdfFactory();
        Document doc2 = factory.createDocument();
        doc2.openDocument();


        factory = new ExcelFactory();
        Document doc3 = factory.createDocument();
        doc3.openDocument();
    }
}
