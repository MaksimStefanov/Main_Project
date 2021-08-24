package serelization.json;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {

/** deserialize from file **/

        String file = "example1.json";
        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String fileFolder = workingFolder + separator + "src" + separator +
                "main" + separator + "java" + separator + "serelization/json" + separator;
        Path path = Paths.get(fileFolder + file);
        ObjectMapper objectMapper = new ObjectMapper();
        Data data = objectMapper.readValue(path.toFile(), Data.class);
        System.out.println(data);
        data.setAddress(new Address("No Adres", "No name", 456856));
        data.setId(456);
        data.setPermanent(false);
        System.out.println(data);

//        List<Data> dataList = objectMapper.readValue(path.toFile(), new TypeReference<List<Data>>() {});
//        System.out.println(Arrays.toString(dataList.toArray()));
//        Data data = objectMapper.readValue(path.toFile(), Data.class);
//        System.out.println(data);

        /** serialize to file **/

        String file1 = "example2.json";
        objectMapper.writeValue(new File(fileFolder + file1), data);

    }
}
