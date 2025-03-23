package com.tech.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3001);
            Socket socket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            //read the message
            String message = ois.readUTF();
            System.out.println(message);
            serverSocket.close();
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
