package fileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by rajan on 14/2/18.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=new FileOutputStream(
                "/home/rajan/FileHandling/file"
        );
        BufferedOutputStream b=new BufferedOutputStream(f);
        String s="welcome to codekul";
        byte[] bytes=s.getBytes();
        b.write(bytes);
        b.flush();
        b.close();
        f.close();
        System.out.println("successfully save");
    }

}
