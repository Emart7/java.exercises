package OtrosTipoDeDatos6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputOutputStreamUse {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\keyrus\\Documents\\ejemplo.txt");
        Path outPath = Paths.get("C:\\Users\\keyrus\\Documents\\ejemplo2.txt");
        InputStream input;

        try {
            InputStream inputStream= Files.newInputStream(inputPath, StandardOpenOption.READ);
            Files.newOutputStream(outPath,StandardOpenOption.CREATE);
            OutputStream outputStream = Files.newOutputStream(outPath,StandardOpenOption.WRITE);
            int i;
            byte[] data = new byte[1024];
            while ((i = inputStream.read(data)) != -1){
                outputStream.write(data);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
