import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import java.io.IOException;

public class XmlReader {

    private DocumentBuilder documentBuilder;

    public XmlReader(DocumentBuilder documentBuilder) {
        this.documentBuilder = documentBuilder;
    }

    public void parse(String pathToFile) throws IOException, SAXException {
        Document document = documentBuilder.parse(pathToFile);
        //Do something with the document and then return
    }
}