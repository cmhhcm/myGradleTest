package domain.myXML.MarshalAndUnMarshal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Author:meice Huang
 * Time: 2019-09-02 17:18
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Root {
    @XmlElement(name = "girl")
    private List<Girl> girls;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Girl girl: girls){
            sb.append(girl.toString());
        }
        return sb.toString();
    }

    public List<Girl> getGirls() {
        return girls;
    }

    public void setGirls(List<Girl> girls) {
        this.girls = girls;
    }
}
