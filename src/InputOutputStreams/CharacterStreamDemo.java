package InputOutputStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Why do we need character stream:
 * Reason: When you want to work on particular file which is holding characters you can use character stream.
 *
 * Character Stream also internally using bytestream only.
 * But is much more simpler & faster to use Character stream if you just have char files.
 * It's better use case when you have a purely char files.
 *
 * Worth Noting: When using CharStream, the file will be read by character by character,
 * one character at a time
 */
public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReaderStream = null;
        FileWriter fileWriterStream = null;

        try{
            fileReaderStream = new FileReader("C:\\Users\\Priya D\\Documents\\InputOutputStreams\\CharacterStreamClassDemo\\source.txt");
            fileWriterStream = new FileWriter("C:\\Users\\Priya D\\Documents\\InputOutputStreams\\CharacterStreamClassDemo\\destination.txt");

            //Reading a source file and writing content to destination file char by char
            int content;
            while((content = fileReaderStream.read()) !=-1){
                fileWriterStream.append((char) content);

                /**
                 * The write mode creates a new file.
                 * append mode is used to add the data at the end of the file if the file already exists
                 *
                 * If the file is already existing write mode overwrites it.
                 * Otherwise append creates a new one
                 */
            }
        }
        finally {
            if(fileReaderStream!=null){
                fileReaderStream.close();
            }
            if(fileWriterStream!=null){
                fileWriterStream.close();
            }
        }
        /**
         * Remember the mistake you made: Not giving finally block/didn't closed the connection
         * If you didn't close the connection the o/p won't be there in the destination file.
         *
         * SO ALWAYS CLOSE CONNECTION YOU MADE IN FILE HANDLING.
         */
    }
}
