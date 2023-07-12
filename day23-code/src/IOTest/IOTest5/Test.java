package IOTest.IOTest5;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader("day23-code\\src\\IOTest\\IOTest5\\names.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str.split("-")[0]);
        }
        br.close();
        int count = Integer.parseInt(list.get(0));

        Random r = new Random();
        int index = r.nextInt(list.size() - 1) + 1;

        if (count == 3) {
            System.out.println("丘俊云");
        } else {
            System.out.println(list.get(index));
            list.set(0, ++count + "");
            BufferedWriter bw = new BufferedWriter(new FileWriter("day23-code\\src\\IOTest\\IOTest5\\names.txt"));
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
        }

    }
}
