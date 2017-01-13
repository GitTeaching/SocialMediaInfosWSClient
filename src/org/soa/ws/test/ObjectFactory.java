
package org.soa.ws.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllSocialMediaInfos_QNAME = new QName("http://test.ws.soa.org/", "getAllSocialMediaInfos");
    private final static QName _GetAllSocialMediaInfosResponse_QNAME = new QName("http://test.ws.soa.org/", "getAllSocialMediaInfosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllSocialMediaInfosResponse }
     * 
     */
    public GetAllSocialMediaInfosResponse createGetAllSocialMediaInfosResponse() {
        return new GetAllSocialMediaInfosResponse();
    }

    /**
     * Create an instance of {@link GetAllSocialMediaInfos }
     * 
     */
    public GetAllSocialMediaInfos createGetAllSocialMediaInfos() {
        return new GetAllSocialMediaInfos();
    }

    /**
     * Create an instance of {@link SocialMedia }
     * 
     */
    public SocialMedia createSocialMedia() {
        return new SocialMedia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSocialMediaInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.ws.soa.org/", name = "getAllSocialMediaInfos")
    public JAXBElement<GetAllSocialMediaInfos> createGetAllSocialMediaInfos(GetAllSocialMediaInfos value) {
        return new JAXBElement<GetAllSocialMediaInfos>(_GetAllSocialMediaInfos_QNAME, GetAllSocialMediaInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSocialMediaInfosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.ws.soa.org/", name = "getAllSocialMediaInfosResponse")
    public JAXBElement<GetAllSocialMediaInfosResponse> createGetAllSocialMediaInfosResponse(GetAllSocialMediaInfosResponse value) {
        return new JAXBElement<GetAllSocialMediaInfosResponse>(_GetAllSocialMediaInfosResponse_QNAME, GetAllSocialMediaInfosResponse.class, null, value);
    }

}
