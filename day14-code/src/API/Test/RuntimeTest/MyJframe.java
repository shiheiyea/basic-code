package API.Test.RuntimeTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {

    JButton yesBut = new JButton("帅爆了");
    JButton midBit = new JButton("一般般吧");
    JButton noBut = new JButton("不是很帅");
    JButton dadBut = new JButton("算了饶了你吧");

    //决定了上方的按钮是否展示
    //true 展示
    //false 不展示
    boolean flag = false;

    public MyJframe() {

        initFrame();

        initView();

        this.setVisible(true);
    }

    public void initFrame() {
        //定制长宽高
        this.setSize(500, 600);
        //界面标题
        this.setTitle("?");
        //界面顶置
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消内部默认布局
        this.setLayout(null);
    }

    public void initView() {

        this.getContentPane().removeAll();

        if (flag) {
            //展示按钮
            dadBut.setBounds(150,20,150,30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }

        JLabel text = new JLabel("你觉得自己帅不帅");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);


        yesBut.setBounds(200,250,100,30);
        midBit.setBounds(200,325,100,30);
        noBut.setBounds(200,400,100,30);


        yesBut.addActionListener(this);
        midBit.addActionListener(this);
        noBut.addActionListener(this);


        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBit);
        this.getContentPane().add(noBut);
    }

    public void showJDialog(String content) {
        //添加弹窗、弹窗内容
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200,150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //取消默认放置
        jDialog.setLayout(null);
        //弹框不关闭则无法操作下面的界面
        jDialog.setModal(true);
        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(50, 25, 150, 50);
        jDialog.getContentPane().add(warning);

        //让弹框显示出来
        jDialog.setVisible(true);
    }

    //点击
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == yesBut) {
            showJDialog("是不是太自信了");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (e.getSource() == midBit) {
            showJDialog("感觉还是有点自信了");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (e.getSource() == noBut) {
            showJDialog("感觉还是有点");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 18000");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            flag = true;
            initView();
        } else if (e.getSource() == dadBut) {
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
