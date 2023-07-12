package String;

public class String12 {
    public static void main(String[] args) {
        String talk = "MLGB，你玩的真好，CNM，以后不要在玩了，TMD，SB";

        String[] arr = {"TMD","CNM","SB","MLGB"};

        for (int i = 0; i < arr.length; i++) {
            //字符串替换
            talk = talk.replace(arr[i],"***");
        }

        System.out.println(talk);
    }
}
