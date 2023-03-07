package network;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class ServerClientDemo {
    public static void downloadFile(URL url, String outputFileName) throws IOException
    {
        try (InputStream in = url.openStream();
             ReadableByteChannel rbc = Channels.newChannel(in);
             FileOutputStream fos = new FileOutputStream(outputFileName)) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println();
        // call to `downloadFile()` method
        downloadFile(new URL("https://dl135.dlmate35.xyz/?file=M3R4SUNiN3JsOHJ6WWQ2a3NQS1Y5ZGlxVlZIOCtyZ0lrZG8wd2h4b0xLNWZ0WVJrOGUyeU1OMEVDSzRCeklicEJ0ZEEvWFhvUXZmQWV5cUhzWlF2VVh2SzFOa3d0RHJCNTQ4eVVNeGlhVVd1eS9idG15RWl6d0g4Y3QzeUJibENaU28rOFdaNjNET0gyZlBSL0VmZXZtMzU0aCtsYVdGWWxETW9NdWZ2K0xnUjNVWEVVS1N5ZzRCTG9EYkxwSjFNMWEyemswZnoyNkkzcXRsaFYwbHhMc0VMak1Pamo2V1YvUlZmazVBRzN4RDMrcnIzVnNkbFMrT05iMnAwUEhRPQ%3D%3D"),"C:\\Users\\USER\\Desktop\\Folder\\demo.mp4");
    }
    
}
