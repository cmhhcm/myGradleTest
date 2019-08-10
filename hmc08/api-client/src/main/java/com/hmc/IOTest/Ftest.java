package com.hmc.IOTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 * Author:meice Huang
 * Time: 2019-08-11 06:26
 */
public class Ftest extends JFrame implements Serializable {

    private static final long serialVersionUID = -3011247927524255324L;

    private JPanel jContentPane = null;//创建面板对象

    private JPanel controlPannel = null;//创建面板对象

    private JTextArea jTextArea = null;//创建文本域对象

    private JButton openButton = null;//创建按钮对象

    private JButton closeButton = null;//创建关闭按钮

    public Ftest() {
        super();
        initialize();
    }

    private JButton getOpenButton() {
        if(openButton == null) {
            openButton = new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //创建文件对象
                    File file = new File("word.txt");
                    try {
                        //创建FileWriter对象
                        FileWriter out = new FileWriter(file);
                        //获取文本域中的文本
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

        }
        return openButton;
    }

    private JButton getCloseButton() {
        if(closeButton == null) {
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    try {
                        FileReader in = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = in.read(byt);
                        if(len >0){
                            jTextArea.setText(new String(byt,0,len));
                        }
                        in.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    private void initialize() {
       this.setSize(300,200);
       this.setContentPane(getJContentPanne());
       this.setTitle("JFrame");
    }


    private JTextArea getJTextArea(){
        if(jTextArea == null) {
            jTextArea = new JTextArea();
        }
        return  jTextArea;
    }

    private JPanel getControlPanel(){
        if(controlPannel == null) {
            FlowLayout flowLayout = new FlowLayout();
            flowLayout.setVgap(1);
            controlPannel = new JPanel();
            controlPannel.setLayout(flowLayout);
            controlPannel.add(getOpenButton(),null);
            controlPannel.add(getCloseButton(),null);
        }
        return controlPannel;
    }
    private JPanel getJContentPanne() {
        if(jContentPane == null){
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJTextArea(),BorderLayout.CENTER);
            jContentPane.add(getControlPanel(),BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    public static void main(String[] args) {
        Ftest thisClass =  new Ftest();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }
}
