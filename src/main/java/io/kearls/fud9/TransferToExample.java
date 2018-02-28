package io.kearls.fud9;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class TransferToExample {
    public static void main(String[] args) throws IOException {
        String target = "http://www.google.com";

        try (InputStream in = new URL(target).openStream()) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            in.transferTo(baos);
            System.out.println("SIZE: " + baos.size());
            System.out.println("GOT [" + baos.toString() + "]");
            System.out.println("");
            String content = baos.toString();
            String lines[] = content.split("\\r?\\n");
            System.out.println("Got " + lines.length + " lines");
        }
    }
}
