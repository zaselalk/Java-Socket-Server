package com.tech.client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",3001);
            ObjectOutputStream dos = new ObjectOutputStream(socket.getOutputStream());
            dos.writeUTF("Hello world !");
            dos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
