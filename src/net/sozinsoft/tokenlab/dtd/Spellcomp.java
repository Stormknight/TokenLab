
package net.sozinsoft.tokenlab.dtd;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "spellcomp")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2011-11-15T04:01:32-06:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class Spellcomp {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2011-11-15T04:01:32-06:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2011-11-15T04:01:32-06:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getvalue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2011-11-15T04:01:32-06:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setvalue(String value) {
        this.value = value;
    }

}