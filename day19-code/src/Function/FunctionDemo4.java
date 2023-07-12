package Function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FunctionDemo4 extends MyJFrame implements ActionListener {

    JButton jButton = new JButton("GO");

    public FunctionDemo4() {
        initJFrame();
        initView();
        this.setVisible(true);
    }

    public void initJFrame() {
        //定制长宽高
        this.setSize(250, 520);
        //界面标题
        this.setTitle("登录");
        //界面顶置
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //用xy轴加入组件
        this.setLayout(null);
        //关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void initView() {
        jButton.setBounds(75, 210, 100, 50);
        jButton.addActionListener(super::MyMethod);
        this.getContentPane().add(jButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(jButton)) {
            System.out.println("GO1");
        }
    }

    public void method(ActionEvent e) {
        System.out.println("GO2");
    }
}
