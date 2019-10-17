package javarash.level2.lev2les9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy2 {
  public static void main(String[] args) throws Exception {
    FileInputStream fileInputStream = new FileInputStream("/Users/alexandrkanishevskii/IdeaProjects/Shild1/src/test");


    FileOutputStream fileOutputStream = new FileOutputStream("/Users/alexandrkanishevskii/IdeaProjects/Shild1/src/testRESULS");

    while (fileInputStream.available()>0)

      {
        int data =fileInputStream.read();
        fileOutputStream.write(data);
      }
    fileInputStream.close();
    fileOutputStream.close();
  }
}
