/**
 * Why 2 diff streams:
 *
 * Whenever you are reading a data from a data source or writing data to the destination,
 * the data can either be simple char strings like english chars/unicode chars/it can be tabular data sitting
 * in a table in a DB/it can be XML file/It can be HTML file/it can be mathematical expression file/it can be
 * image or it can be anything. So that java creates 2 diff types of classes.
 */

package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Why do we need Byte stream:
 * Reason: If you don't know what kind of data that the file is going to contain then use Byte stream.
 *
 * Worth Noting: When using ByteStream, it reads the file byte by byte, one byte at a time
 */
public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            //Reading stream
            fileInputStream = new FileInputStream("C:\\Users\\Priya D\\Documents\\InputOutputStreams\\source.txt");
            //Writing stream - Remember don't need to create the file it gets created
            fileOutputStream = new FileOutputStream("C:\\Users\\Priya D\\Documents\\InputOutputStreams\\destination.txt");

            //It reads one byte at a time, if it reached the end of the file returns -1;
            //Means the read operation returns -1 after reading the file
            int content;
            while((content = fileInputStream.read()) != -1 ){ //NOTE: != & = [not ==]
                fileOutputStream.write((byte)content); //Remeber we have to typecast explicitly here into byte, because this is byte stream
                //because fileInputStream.read() isn't a integer output, so need to convert int o/p content to byte
            }
        }
        finally { //Finally block, it's imp to close the resources.
            //Otherwise, these resources will be present till the time java runs a garbage collection.
            //It’s very important to close all the resources you opened in terms of file handling
            // because these are costly connections & they take up lot of memory.
            if(fileInputStream!=null)
                fileInputStream.close();
            if(fileOutputStream!=null)
                fileOutputStream.close();
        }
        /*
        Now after running you will be able to find the destination file in the mentioned location.
        Here we are simply copying the contents from source to destination file.
         */
    }
}
