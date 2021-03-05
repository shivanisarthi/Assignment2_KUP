import org.junit.Assert;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {
    Map<String, String> map = new HashMap<String, String>();
    BufferedReader bufferedReaderObject = null;
    final static String path = "src/file.txt";
    @org.junit.jupiter.api.Test
    void hashmapFile() throws IOException {
        File file = new File(path);
        bufferedReaderObject = new BufferedReader(new FileReader(file));
        String line = null;




        while ((line = bufferedReaderObject.readLine()) != null) {

            String[] splitVariable = line.split(" ");
            for(String word : splitVariable)
            {

                map.put(word,(map.containsKey(word))?Integer.toString((Integer.parseInt(map.get(word))+1)):"1");

            }
        }
        assert (!map.isEmpty());
        assert (map.containsKey("shivani"));
        assert (map.containsValue("3"));

    }
}