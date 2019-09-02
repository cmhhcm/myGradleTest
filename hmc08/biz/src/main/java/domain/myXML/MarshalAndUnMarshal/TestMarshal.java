package domain.myXML.MarshalAndUnMarshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Author:meice Huang
 * Time: 2019-09-02 17:24
 */
public class TestMarshal {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/dzj/IdeaTest001/mypp01/hmc08/biz/src/main/java/domain/myXML/MarshalAndUnMarshal/marshal.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Root root = (Root) unmarshaller.unmarshal(file);
            System.out.println(root);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
