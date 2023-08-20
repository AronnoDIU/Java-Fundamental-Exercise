package SDLC_Pro_Practice;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

/*
*   Simple java program to download file from extension based URL.
 * */

public class DownloadAnyThingFromWeb {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String address;
        while (!(address = scanner.nextLine()).equalsIgnoreCase("Exit")){
            try {
                URL url = new URL(address);
                String[] paths = address.split("/");
                String filename = paths[paths.length - 1];
                InputStream inputStream = url.openStream();
                OutputStream outputStream = new FileOutputStream("Files/"+ filename);
                byte[] bytes = new  byte[1024];
                int length, downloaded = 0;
                while ((length = inputStream.read(bytes)) != -1){
                    outputStream.write(bytes, 0, length);
                    downloaded += length;
                    System.out.printf("\rDownloaded... %.2fkb", downloaded/1000.0f);
                }
                System.out.println("\nDownload Complete!");
                inputStream.close();
                outputStream.close();
            } catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }
}
