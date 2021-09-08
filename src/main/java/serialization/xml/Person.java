package serialization.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Person")



// Person.java


class Person {
    @JacksonXmlProperty(localName = "firstName")
    @XmlElement(name="firstName")
    public String firstName;
    @JacksonXmlProperty(localName = "lastName")
    public String lastName;
    @JacksonXmlProperty(localName = "phoneNumbers")
    public PhoneNumbers phoneNumbers;
    @JacksonXmlProperty(localName = "addresses")
    public Addresses addresses;

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                '}';
    }

    public Person() {
    }

    public Person(Addresses addresses) {
        this.addresses = addresses;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumbers value) {
        this.phoneNumbers = value;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses value) {
        this.addresses = value;
    }
}

// Addresses.java


class Addresses {
    @JacksonXmlProperty(localName = "address")
    @JacksonXmlElementWrapper(useWrapping=false)
    public Address[] address;

    public Address[] getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "address=" + Arrays.toString(address) +
                '}';
    }

    public Addresses() {
    }

    public void setAddress(Address[] value) {
        this.address = value;
    }
}

// Address.java


class Address {
    @JacksonXmlProperty(localName = "streetName")
    public String streetName;
    @JacksonXmlProperty(localName = "city")
    public String city;

    public String getStreetName() {
        return streetName;
    }

    public Address() {
    }

    public void setStreetName(String value) {
        this.streetName = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }
}

// PhoneNumbers.java


class PhoneNumbers {
    @JacksonXmlProperty(localName = "phoneNumbers")
    @JacksonXmlElementWrapper(useWrapping=false)
    public String[] phoneNumbers;

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public PhoneNumbers() {
    }

    @Override
    public String toString() {
        return "PhoneNumbers{" +
                "phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }

    public void setPhoneNumbers(String[] value) {
        this.phoneNumbers = value;
    }
}


