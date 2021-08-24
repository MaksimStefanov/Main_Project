
package serelization.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;


@JsonPropertyOrder({
        "age",
        "salary"
})
@JsonIgnoreProperties(ignoreUnknown =
        true)
public class Data1 implements Serializable
{

    @JsonProperty("age")
    private String age;
    @JsonProperty("salary")
    private String salary;
    @JsonIgnore

    private final static long serialVersionUID = 3772945007481930391L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data1() {
    }

    /**
     *
     * @param salary
     * @param age
     */
    public Data1(String age, String salary) {
        super();
        this.age =  age;
        this.salary =  salary;
    }

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age =  age;
    }

    @JsonProperty("salary")
    public String getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(String salary) {
        this.salary =  salary;
    }


    @Override
    public String toString() {
        return "Data{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}