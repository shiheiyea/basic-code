package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
        static InetAddress getByName(String host)       确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName( )                           获取此IP地址的主机名
        String getHostAddress( )                        返回文本显示中的IP地址字符串
        */

        //1.获取InetAddress的对象
        //IP的对象一台电脑的对象
        InetAddress address = InetAddress.getByName("黑夜");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);//黑夜

        String ip = address.getHostAddress();
        System.out.println(ip);//2.0.0.1

    }
}
