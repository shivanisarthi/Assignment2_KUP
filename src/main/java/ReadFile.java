import java.io.*;
import java.util.*;

class ReadFile implements ReadFile_Interface{

    final static String path = "src/file.txt";

    public static Map<String, String> HashmapFile()
    {

        Map<String, String> map = new HashMap<String, String>();
        BufferedReader bufferedReaderObject = null;

        try {

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
        }
        catch (Exception e) {

            e.printStackTrace();
        }
        finally {

            if (bufferedReaderObject != null) {

                try {

                    bufferedReaderObject.close();
                }
                catch (Exception e) {
                };
            }
        }
        return map;
    }
}