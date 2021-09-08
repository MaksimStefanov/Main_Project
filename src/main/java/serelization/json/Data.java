
package serelization.json;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "permanent",
    "phoneNumbers",
    "address",
    "role",
    "cities",
    "properties"
})

public class Data implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("permanent")
    private Boolean permanent;
    @JsonProperty("phoneNumbers")
    private List<Integer> phoneNumbers = null;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("role")
    private String role;
    @JsonProperty("cities")
    private List<String> cities = null;
    @JsonProperty("properties")
    private Properties properties;
    @JsonIgnore

    private final static long serialVersionUID = 1878110881962096305L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     *
     * @param address
     * @param role
     * @param cities
     * @param permanent
     * @param name
     * @param id
     * @param phoneNumbers
     * @param properties
     */
    public Data(Integer id, String name, Boolean permanent, List<Integer> phoneNumbers, Address address, String role, List<String> cities, Properties properties) {
        super();
        this.id = id;
        this.name = name;
        this.permanent = permanent;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
        this.role = role;
        this.cities = cities;
        this.properties = properties;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("permanent")
    public Boolean getPermanent() {
        return permanent;
    }

    @JsonProperty("permanent")
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    @JsonProperty("phoneNumbers")
    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("cities")
    public List<String> getCities() {
        return cities;
    }

    @JsonProperty("cities")
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }





    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", phoneNumbers=" + phoneNumbers +
                ", address=" + address +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                ", properties=" + properties +
                '}';
    }
}
