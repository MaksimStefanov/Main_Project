
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

public class Properties implements Serializable
{

    @JsonProperty("age")
    private String age;
    @JsonProperty("salary")
    private String salary;

    private final static long serialVersionUID = 3866986611916377377L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Properties() {
    }

    /**
     * 
     * @param salary
     * @param age
     */
    public Properties(String age, String salary) {
        super();
        this.age = age;
        this.salary = salary;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("salary")
    public String getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(String salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Properties{" +
                "age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
