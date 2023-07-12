package Test.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientMyRunnable implements Runnable {
    Socket socket;

    public ClientMyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg = br.readLine();
                System.out.println(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
