package whileLoop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class doWhile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream  = new FileInputStream("data/text.xml");

        int data;
        do {
            data = inputStream.read();

        } while(data != -1);

    }
}
