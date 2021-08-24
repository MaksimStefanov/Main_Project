package serialization.xml;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        Person data2 = xmlMapper.readValue(path2.toFile(), Person.class);
        System.out.println(data2.toString());

        data2.setFirstName("NoName");
        data2.setLastName("NoNameovich");
        System.out.println(data2);
        /** serialize to file **/

        String newFile = "example2.xml";
        xmlMapper.writeValue(new File(fileFolder + newFile), data2);



    }

}
