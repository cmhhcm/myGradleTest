package domain.myXML.MarshalAndUnMarshal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Author:meice Huang
 * Time: 2019-09-02 17:13
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Girl {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "age")
    private String age;

    @XmlElement(name = "cup")
    private String cup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cup='" + cup + '\'' +
                '}';
    }
}
