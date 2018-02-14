package fileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by rajan on 14/2/18.
 */
public class FileInputStramDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("/home/rajan/FileHandling/file");
        BufferedInputStream b=new BufferedInputStream(f);
        int i=0;

        while ((i=b.read())!=-1)
        {
            System.out.print((char)i);
        }
//        int j=b.read();
//        System.out.println((char)j);
//        f.close();
    }

}
