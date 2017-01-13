
package org.soa.ws.test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllSocialMediaInfosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllSocialMediaInfosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialMedia" type="{http://test.ws.soa.org/}socialMedia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllSocialMediaInfosResponse", propOrder = {
    "socialMedia"
})
public class GetAllSocialMediaInfosResponse {

    @XmlElement(name = "SocialMedia")
    protected List<SocialMedia> socialMedia;

    /**
     * Gets the value of the socialMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMedia }
     * 
     * 
     */
    public List<SocialMedia> getSocialMedia() {
        if (socialMedia == null) {
            socialMedia = new ArrayList<SocialMedia>();
        }
        return this.socialMedia;
    }

}
