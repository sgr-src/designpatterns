package soreco.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlTransformer {

    public String getValueFromXml (String filePath, String xPathExpression) 
            throws 
            TransformerConfigurationException, 
            TransformerException, 
            XPathExpressionException {
        try {            
            /**
             * DocBuilder
             */            
            DocumentBuilderFactory documentBuilderFactory = 
                    DocumentBuilderFactory
                            .newInstance();            
            
            InputStream inputStream = 
                    new FileInputStream(
                            new File(filePath));
            /**
             * Parse input stream to a doc
             */
            Document doc = 
                    documentBuilderFactory
                            .newDocumentBuilder()
                            .parse(inputStream);            
            /**
             * Traverse xml file using XPath
             */
            XPathFactory xpfactory = XPathFactory.newInstance();            
            XPath xpath = xpfactory
                    .newXPath();                    
            String variableValue = xpath
                    .evaluate(xPathExpression, doc.getDocumentElement());            
            
            return variableValue;
        }         
        catch (ParserConfigurationException | SAXException | IOException e) {
        }
                       
        return null;
    }

}