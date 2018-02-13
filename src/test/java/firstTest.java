import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class firstTest {

    public static void Main(String args[])
    {

    }

    @Test
    public void runFirstTest()
    {
        javaZap check = new javaZap();

        check.methodTest();
        // Running the above command

        try
        {

            ProcessBuilder pb = new ProcessBuilder("calc");
            File codegenOutputFile = new File("codegen.out");
            pb.redirectOutput(codegenOutputFile);
            pb.start();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    }


