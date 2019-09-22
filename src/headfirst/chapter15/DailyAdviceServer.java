package headfirst.chapter15;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2019/9/2
 */
public class DailyAdviceServer {
    String[] adviceList = {"Take smaller bites", "Go for the tight jeans, No they do not make you look fit",
    "One Word: inappropriate", "Just for today, be honest", "You might want to rethink that haircut"};

    public void go() {
        try {
            //ServerSocket会监听这台机器在4242端口上的请求
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true) {
                //此方法会停下来等待要求达到后才会继续
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

}
