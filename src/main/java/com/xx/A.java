package com.xx;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            StringBuilder a =new StringBuilder();
            int x;

            byte[] b =new byte[1024];
            while ((x=inputStream.read(b))!=-1){
                a.append(new String(b,0,x));
            }
            String[] split = a.toString().split("\n");
            String s = split[split.length - 1];
            String[] split1 = s.split("&");
            Map map =new HashMap();
            for (String string : split1) {
                String[] split2 = string.split("=");
                for (String s1 : split2) {
                    map.put(split2[0],split2[1]);
                }
            }
            String string = map.get("xm").toString();
            System.out.println(string);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
