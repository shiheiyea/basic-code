package IOTest;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.*;

public class IOTest2 {
    public static void main(String[] args) {
        //利用糊涂包生成假数据，并写到文件当中

        //1.定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        //爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //利用正则表达式获取数据
        //3.通过正则表达式，把其中符合要求的数据获取出来
        /*ArrayList<String> familyNameTempList = getData(familyNameStr, "(.{4})(，|。)", 1);
        ArrayList<String> boyNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> girlNameTempList = getData(girlNameStr, "(.. ){4}..", 0);*/

        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        //4.处理数据
        //familyNameTempList (姓氏)
        //处理方案:把每一个姓氏拆开并添加到一个新的集合当中
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            //str 赵钱孙李 周吴郑王 冯陈褚卫蒋沈韩杨
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                familyNameList.add(ch + "");
            }
        }
        //boyNameTempList (男生的名字)
        //处理方案:去除其中的重复元素
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String str : boyNameTempList) {
            if (!boyNameList.contains(str)) {
                boyNameList.add(str);
            }
        }
        //girlNameTempList (女生的名字)
        //处理方案:把里面的每一个元素用空格进行切割，得到每一个女生的名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girlNameList.add(arr[i]);
            }
        }

        //生成数据
        //姓名(唯一)-性别-年龄
        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 70, 50);
        Collections.shuffle(list);

        //6.写出数据
        //细节:
        //糊涂包的相对路径，不是相对于当前项目而言的，而是相对class文件而言的
        FileUtil.writeLines(list, "names.txt", "UTF-8");

    }

    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        //1.生成男生不重复的名字
        HashSet<String> boyhs = new HashSet<>();
        Random r = new Random();
        while (true) {
            if (boyhs.size() == boyCount) {
                break;
            }
            int index1 = r.nextInt(familyNameList.size());
            int index2 = r.nextInt(boyNameList.size());
            boyhs.add(familyNameList.get(index1) + boyNameList.get(index2));
            //随机
            /*Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyhs.add(familyNameList.get(0) + boyNameList.get(0));*/

        }
        //2.生成女生不重复的名字
        HashSet<String> girlhs = new HashSet<>();
        while (true) {
            if (girlhs.size() == girlCount) {
                break;
            }
            int index1 = r.nextInt(familyNameList.size());
            int index2 = r.nextInt(girlNameList.size());
            girlhs.add(familyNameList.get(index1) + girlNameList.get(index2));
            //随机
            /*Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlhs.add(familyNameList.get(0) + girlNameList.get(0));*/
        }

        //3.生成男生的信息并添加到集合当中
        ArrayList<String> list = new ArrayList<>();
        //[18~27]
        for (String boyName : boyhs) {
            //boyName依次表示每一一个 男生的名字
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }
        //4.生成女生的信息并添加到集合当中
        //[18~25]
        for (String girlName : girlhs) {
            //gir1Name依次表示每一个 女生的名字
            int age = r.nextInt(8) + 18;
            list.add(girlName + "-女-" + age);
        }

        return list;
    }
}
