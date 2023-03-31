package w3;// import org.w3c.dom.*;

// import javax.xml.parsers.*;
// import java.io.*;
// import java.text.Normalizer;

// class Helper {
//     public static String unicodeToASCII(String s) {
//     String s1 = Normalizer.normalize(s, Normalizer.Form.NFKD);
//     String regex =
//     "[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+";
//     String s2 = null;
//     try {
//     s2 = new String(s1.replaceAll(regex, "").getBytes("ascii"),
//     "ascii");
//     } catch (UnsupportedEncodingException e) {
//     return "";
//     }
//     return s2;
//     }
// }

// public class XML {
//     public static void main(String[] args){

//         try{
//         //file input
//         //File inputFile = new File("Viet_Anh.xml");
        
//         //create DocumentBuilder
//         // DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//         // DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//         // Document doc = dBuilder.parse(input);

//         // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

//         // NodeList nRecords = doc.getElementsByTagName("record");
        
//         // Node record = nRecords.item(1);
//         // Element element = (Element) record;
//         // String arr = element.getElementsByTagName("meaning").item(0).getTextContent();
//         // System.out.println(arr);
//         }
//         catch (Exception e){
//             e.printStackTrace();
//         }
//     }
// }
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
 
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
 
public class XML {
 
    private static final String xmlFilePath = "Anh_Viet.xml";
 
    public static void main(String argv[]) {
 
        try {
 
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
 
            File xmlFile = new File(xmlFilePath);
 
            InputStream inputStream= new FileInputStream(xmlFile);
 
            InputStreamReader inputReader = new InputStreamReader(inputStream,"UTF-8");
 
            InputSource inputSource = new InputSource(inputReader);
            inputSource.setEncoding("UTF-8");
 
            saxParser.parse(inputSource, new MyHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}