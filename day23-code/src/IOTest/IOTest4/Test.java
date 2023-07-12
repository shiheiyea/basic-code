package IOTest.IOTest4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day23-code\\src\\IOTest\\IOTest4\\names.txt"));
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            if (arr[1].equals("男")) {
                boyList.add(line);
            } else {
                girlList.add(line);
            }

        }
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        Random r = new Random();

        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < 1000000; i++) {
            int index = r.nextInt(arr.length);
            if (index < 7) {
                System.out.println(boyList.get(r.nextInt(boyList.size())));
                boyCount++;
            } else {
                System.out.println(girlList.get(r.nextInt(girlList.size())));
                girlCount++;
            }
        }
        System.out.println("boyCount：" + boyCount);
        System.out.println("girlCount：" + girlCount);
    }
}
