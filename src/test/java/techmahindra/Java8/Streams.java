package techmahindra.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *                  I/O Stream
 * Stream means sequence of data. Data which we are reading from source is called Input stream and Data which we write to a source
 * is called out put stream.
 * 'So, we have:
 * Stream: sequence of data
 * Input Stream:  read from source
 * Output stream: data write to source.
 *
 * Character Stream:  allows us to read/write data character by character. e.g FileReader/FileWriter are character streams. 16 bit
 * Byte Stream: it process data byte by byte 8 bits. e.g FileInputStream and FileOutputStream.
 *
 *  BufferReader/BufferWriter are used for efficient reading and writing of character data.
 *  BufferInputStream/BufferOutputStream is used for efficient reading and writing byte data.
 *
 */


class CustomObject{
    String fFame;
    String lName;
    public String getfFame() {
        return fFame;
    }
    public void setfFame(String fFame) {
        this.fFame = fFame;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
}
public class Streams {
    public static void main(String[] args) {
        List<CustomObject> list = new ArrayList<>();
        CustomObject object1 = new CustomObject();
        object1.setfFame("Sachin");
        object1.setlName("Gupta");
        CustomObject object2 = new CustomObject();
        object2.setfFame("SACHIN");
        object2.setlName("Gupta");
        CustomObject object3 = new CustomObject();
        object3.setfFame("Akhilesh");
        object3.setlName("Singh");

        list.add(object1);list.add(object2);list.add(object3);

        List<CustomObject> filterList = list.stream().filter(element -> element.getfFame().equalsIgnoreCase("sachin")).collect(Collectors.toList());
        System.out.println("Filtered Records: "+filterList.size());
    }

}
