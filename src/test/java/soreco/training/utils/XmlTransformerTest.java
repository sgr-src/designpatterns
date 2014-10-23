package soreco.training.utils;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

public class XmlTransformerTest {
    
    @Test    
    public void getValueFromXml () 
            throws 
            TransformerException, 
            TransformerConfigurationException, 
            XPathExpressionException {        
        //File path to xml
        String filePathToXmlFile = "C:\\Users\\sgr\\Desktop\\ws_config_yellownet.xml";        
        //xpath expresion created by a text editor
        String xpathExpression = "/webserviceconfig/mandant/id/text()";        
        String varValue = "";        
        XmlTransformer transformer = new XmlTransformer( );        
        varValue = transformer.getValueFromXml(filePathToXmlFile, xpathExpression);
        
        assertTrue((varValue).equalsIgnoreCase("Otto Ramseier AG")); 
    }    
}
