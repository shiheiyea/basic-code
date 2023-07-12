package API.Regex;

public class RegexDome3 {
    public static void main(String[] args) {
        //      \     转义字符   改变后面那个字符原本的含义
        //练习:   以字符串的形式打印一个双引号
        //" 在Java中表示字符串的开头或者结尾
        //此时\表示转义字符，改变了后面那个双引号原本的含义
        //把他变成了一个普普通通的双引号而已。
        System.out.println("\"");
        //    \    表示转义字符
        //    \\   前面的\是一个转义字符，改变了后面\原本的含义，把他变成一个普普通通的\而已。
        System.out.println("C:\\Users\\27596\\IdeaProjects\\basic-code\\day14-code\\src\\API\\RegexDome\\RegexDome2.java");

        // .表示任意一个字符
        System.out.println("你".matches("..")); //false
        System.out.println("你".matches(".")); //true
        System.out.println("你a".matches(".."));//true

        // \\d只能是任意的一位数字
        // 简单来记: 两个\表示一个\
        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false
        System.out.println("333".matches("\\d\\d\\d")); // true

        // \\w只能是一位单词字符 [a-zA-Z_ 0-9]
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w")); //false
        System.out.println("_".matches("\\w")); //false

        // \\W非单词字符
        System.out.println("你".matches("\\W")); // true
        System.out.println("-----------------------------");
        // 以上正则匹配只能校验单个字符。

        //必须是数字字母下划线至少6位
        System.out.println("2442fsfsf".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false

        // 必须是数字和字符 必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_ _]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_ ]]{4}"));//false

    }
}
