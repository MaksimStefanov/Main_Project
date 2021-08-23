
        package serelization.json;

import java.io.Serializable;
import java.util.HashMap;
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
        "age",
        "salary"
})
@Generated("jsonschema2pojo")
public class Data implements Serializable
{

    @JsonProperty("age")
    private Object age;
    @JsonProperty("salary")
    private Object salary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3772945007481930391L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param salary
     * @param age
     */
    public Data(Object age, Object salary) {
        super();
        this.age = age;
        this.salary = salary;
    }

    @JsonProperty("age")
    public Object getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Object age) {
        this.age = age;
    }

    @JsonProperty("salary")
    public Object getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(Object salary) {
        this.salary = salary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "age=" + age +
                ", salary=" + salary +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}