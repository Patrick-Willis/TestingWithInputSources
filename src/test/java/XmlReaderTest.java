import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.parsers.DocumentBuilder;

@RunWith(MockitoJUnitRunner.class)
public class XmlReaderTest {

    private static final String PATH_TO_FILE = "path/to/file";
    @Mock private DocumentBuilder documentBuilder;

    @Test
    public void xmlReaderParsesPassingString() throws Exception {
        XmlReader xmlReader = new XmlReader(documentBuilder);
        xmlReader.parse(PATH_TO_FILE);
        //Assert something on the result
    }
}
