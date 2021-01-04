package com.learn.java.lang.wangs.base.swing.event;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author wangsai
 * 事件监听器
 *
 */
public class ActionListenerDemo extends JFrame
{
    JList list;
    JLabel label;
    JButton button1;
    int clicks=0;
    public ActionListenerDemo()
    {
        setTitle("动作事件监听器示例");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,200);
        JPanel contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        setContentPane(contentPane);
        label=new JLabel(" ");
        //修改字体样式
        label.setFont(new Font("楷体",Font.BOLD,16));
        contentPane.add(label, BorderLayout.SOUTH);
        //创建JButton对象
        button1=new JButton("我是普通按钮");
        //修改字体样式
        button1.setFont(new Font("黑体",Font.BOLD,16));
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                label.setText("按钮被单击了 "+(clicks++)+" 次");
            }
        });
        contentPane.add(button1);
    }
    //处理按钮单击事件的匿名内部类
    class Button1ActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            label.setText("按钮被单击了 "+(clicks++)+" 次");
        }
    }
    public static void main(String[] args)
    {
        ActionListenerDemo frame=new ActionListenerDemo();
        frame.setVisible(true);
    }
}
