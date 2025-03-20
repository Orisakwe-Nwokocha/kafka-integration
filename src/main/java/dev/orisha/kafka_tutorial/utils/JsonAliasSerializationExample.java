package dev.orisha.kafka_tutorial.utils;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Person {
//    @JsonProperty("full_name")
    @JsonAlias("fullName")
    private String full_name;

}

public class JsonAliasSerializationExample {
    @SneakyThrows
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String json1 = "{ \"full_name\": \"John Doe\" }";
        String json2 = "{ \"name\": \"Jane Doe\" }";
        String json3 = "{ \"fullName\": \"Alice Doe\" }"; // This works now



        Person person1 = objectMapper.readValue(json1, Person.class);
        Person person2 = objectMapper.readValue(json2, Person.class);
        Person person3 = objectMapper.readValue(json3, Person.class);

        System.out.println(person1.getFull_name()); // Output: John Doe
        System.out.println(person2.getFull_name()); // Output: Jane Doe
        System.out.println(person3.getFull_name()); // Output: Alice Doe


        Person person = new Person("John Doe");

        String jsonOutput = objectMapper.writeValueAsString(person);
        System.out.println(jsonOutput);
    }
}