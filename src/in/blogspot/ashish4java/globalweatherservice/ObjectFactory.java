
package in.blogspot.ashish4java.globalweatherservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.blogspot.ashish4java.globalweatherservice package. 
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

    private final static QName _GetTemperatureOfCityResponse_QNAME = new QName("http://GlobalWeatherService.ashish4java.blogspot.in/", "getTemperatureOfCityResponse");
    private final static QName _GetTemperatureOfCity_QNAME = new QName("http://GlobalWeatherService.ashish4java.blogspot.in/", "getTemperatureOfCity");
    private final static QName _CityNotFoundException_QNAME = new QName("http://GlobalWeatherService.ashish4java.blogspot.in/", "CityNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.blogspot.ashish4java.globalweatherservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTemperatureOfCityResponse }
     * 
     */
    public GetTemperatureOfCityResponse createGetTemperatureOfCityResponse() {
        return new GetTemperatureOfCityResponse();
    }

    /**
     * Create an instance of {@link GetTemperatureOfCity }
     * 
     */
    public GetTemperatureOfCity createGetTemperatureOfCity() {
        return new GetTemperatureOfCity();
    }

    /**
     * Create an instance of {@link CityNotFoundException }
     * 
     */
    public CityNotFoundException createCityNotFoundException() {
        return new CityNotFoundException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemperatureOfCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GlobalWeatherService.ashish4java.blogspot.in/", name = "getTemperatureOfCityResponse")
    public JAXBElement<GetTemperatureOfCityResponse> createGetTemperatureOfCityResponse(GetTemperatureOfCityResponse value) {
        return new JAXBElement<GetTemperatureOfCityResponse>(_GetTemperatureOfCityResponse_QNAME, GetTemperatureOfCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemperatureOfCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GlobalWeatherService.ashish4java.blogspot.in/", name = "getTemperatureOfCity")
    public JAXBElement<GetTemperatureOfCity> createGetTemperatureOfCity(GetTemperatureOfCity value) {
        return new JAXBElement<GetTemperatureOfCity>(_GetTemperatureOfCity_QNAME, GetTemperatureOfCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GlobalWeatherService.ashish4java.blogspot.in/", name = "CityNotFoundException")
    public JAXBElement<CityNotFoundException> createCityNotFoundException(CityNotFoundException value) {
        return new JAXBElement<CityNotFoundException>(_CityNotFoundException_QNAME, CityNotFoundException.class, null, value);
    }

}
