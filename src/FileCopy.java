/*DZ12_lesson14
создать приложение побайтового копирования графического файла.
Например, файл формата png.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try{FileInputStream fileInputStream = new FileInputStream("Picture.png");
            FileOutputStream fileOutputStream = new FileOutputStream("New_pic.png");
            int i;
            while ((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            fileInputStream.close();
            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}