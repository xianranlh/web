import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ser {
    public String a(){
        String text =null;
        try {
            StringBuilder nr = new StringBuilder();
            ServerSocket a =new ServerSocket(8080);
            Socket accept = a.accept();
            InputStream in=accept.getInputStream();
            byte[] b=new byte[1024];
            int x;
            while ((x=in.read(b))!=-1){
                nr.append(new String(b, 0, x)) ;
            }
            System.out.println(nr.toString());
             text = nr.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
    public static void main(String[] args) {
        Ser ser=new Ser();
        String a = ser.a();
        String sq = ser.sq(a);
ser.map(sq);
    }

    private void map(String s) {
        String[] split1 = s.split("&");
        for (String string : split1) {
            System.out.println(string);
        }
        Map<String, String> map = new HashMap<>();
        for (String string : split1) {
            String[] split2 = string.split("=");
            map.put(split2[0],split2[1]);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print(entry.getKey()+"---");
            System.out.println(entry.getValue());
        }

    }

    private String sq(String a) {
        String[] split = a.split("\n");
        System.out.println(split[0]);
        int length = split.length-1;
        System.out.println(split[split.length-1]);
        String s = split[length];
        System.out.println(s);
        return s;

    }
}
