import java.io.*;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class javaZap {

    public void methodTest() {
        //logger.info( "Hello" );
        int num = 4;
        if (num % 2 != 0) {
            throw new RuntimeException("num is not even");


        } else {
            //Logger logger = LoggerFactory.getLogger(javaZap.class);
            log.error("last bu");
            log.error("last buADD");
            log.error("last budddfffdd");
            String line;
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("file.txt").getFile());
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);) {

                while (( line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(
                        "Unable to open file ");
            } catch (IOException ex) {
                System.out.println(
                        "Error reading file ");

            }
        }
    }
}

