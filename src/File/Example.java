package File;

import java.io.File;

public class Example {

    public static void main(String[] args) {
        File dir = new File("D:/JAVA21/oop/src/File/Person");
        dir.mkdir();
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        File file1 = new File(dirlocation + "/Student.txt");
        File file2 = new File(dirlocation + "/Teacher.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
