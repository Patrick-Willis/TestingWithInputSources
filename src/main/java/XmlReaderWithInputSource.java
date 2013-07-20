import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import java.io.IOException;

public class XmlReaderWithInputSource {

    private DocumentBuilder documentBuilder;

    public XmlReaderWithInputSource(DocumentBuilder documentBuilder) {
        this.documentBuilder = documentBuilder;
    }

    public void parse(InputSource inputSource) throws IOException, SAXException {
        Document document = documentBuilder.parse(inputSource);
        //Do something with the document and then return
    }
}