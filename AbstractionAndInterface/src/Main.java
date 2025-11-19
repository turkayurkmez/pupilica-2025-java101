public class Main {
    public static void main(String[] args) {

        WordDocument wordDocument = new WordDocument();
        ExcelDocument excelDocument = new ExcelDocument();
        PDFDocument pdfDocument = new PDFDocument();

        DocumentPrinter documentPrinter = new DocumentPrinter();
       // documentPrinter.Print(pdfDocument);
        documentPrinter.Print(excelDocument);
        documentPrinter.Print(wordDocument);

    }
}