package API.SimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDome3 {
    public static void main(String[] args) throws ParseException {
        /*
        需求:
            秒杀活动: 2023年11月11日0:0:0 (毫秒值)
            开始时间: 2023年11月11日0:10:0 (毫秒值)

            小贾下单并付款的时间为: 2023年11月11日 0:01:00
            小皮下单并付款的时间为: 2023年11月11日 0:11:00
            用代码说明这两位同学有没有参加上秒杀活动?
         */

        //1.定义字符串表示三个时间
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr1 = "2023年11月11日 0:01:00";
        String orderStr2 = "2023年11月11日 0:11:00";

        //2.解析上面的三个时间，得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date order1Date = sdf.parse(orderStr1);
        Date order2Date = sdf.parse(orderStr2);

        //3.得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long order1Time = order1Date.getTime();
        long order2Time = order2Date.getTime();

        //4.判断
        if (order2Time >= startTime && order2Time <= endTime) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }


    }
}
