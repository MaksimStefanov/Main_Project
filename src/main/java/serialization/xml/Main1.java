package serialization.xml;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import serelization.json.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String file = "HometaskXML1.xml";
        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String fileFolder = workingFolder + separator + "src" + separator +
                "main" + separator + "java" + separator + "serialization/xml" + separator;
        Path path2 = Paths.get(fileFolder + file);
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        Data2 data2 = xmlMapper.readValue(path2.toFile(), Data2.class);
        System.out.println(data2.toString());

        //data2.setSemester(10);
        System.out.println(data2);
        /** serialize to file **/

        String newFile = "example2.xml";
        xmlMapper.writeValue(new File(fileFolder + newFile), data2);



    }

}
