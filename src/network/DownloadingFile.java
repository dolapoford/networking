package network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class DownloadingFile {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dl103.fcfdffeadfdfe.xyz/?file=M3R4SUNiN3JsOHJ6WWQ2a3NQS1Y5ZGlxVlZIOCtyZ0dtY2M1d2prc0Q2b0hzSjVrOXZDb0w4eGJKNjRNaHFpck9OeFYrbldOSVp1cVBBUENrZDBDRWphajB0Y3hxblNFMXBZMEhPMGhFelN0bGVMbXNtRXpxMUx4TmZDSU1la1ROQ0Y4cTB3bTkzZldsYWZUc1FIcitEYi85eC9SVXpKWTVtczdjL2pBcGRsTzNHWE9VT2ZseDVoWTZIUzUrNVZjenVXZnNVU2s1Yjh1N0prbmVFWXhJYllNOEx2SzhhYkd0bW9oaTZZS2lCbjBtYXlyRnNwekc2Q1JKQmxYZUNjUitlYjlXUThYd2lCRHFUcnJyL3R6dnpGZkplWm00WGl4cEt1d05XdkxLNUd3WElmWkx1cnM%3D");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoInput(true);
            InputStream stream = urlConnection.getInputStream();
            System.out.println("Downloading file from youtube");
            byte[] buffer = stream.readAllBytes();
            File targetFile = new File("C:\\Users\\USER\\Desktop\\Folder\\demo.mp4");
            OutputStream outStream = new FileOutputStream(targetFile);
            outStream.write(buffer);
            System.out.println("Done downloading file from Youtube");

        } catch (IOException e) {

        }
    }
}