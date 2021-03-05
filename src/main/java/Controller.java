import java.util.Map;

public class Controller {
    public static void main(String[] args)
    {
        Map<String, String> mapFile
                = ReadFile.HashmapFile();
        mapFile.forEach( (key, value) -> {
            System.out.println("Key: " + key + " Value:" + value);

        });


    }
}
