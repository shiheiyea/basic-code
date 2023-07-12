package IOTest.IOTest3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day23-code\\src\\IOTest\\IOTest3\\names.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line.split("-")[0]);
        }
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
