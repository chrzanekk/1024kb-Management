package utils;

import java.io.File;
import java.io.IOException;

/**
 * Created by chrzanekk on 16.10.2019
 */
public class FileUtils {
    public static void createNewFile(String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
    }


}
