package com.Swing;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    static JFrame jFrame = getFrame(); // наша форма
    static JPanel jPanel = new JPanel(); // наша панель

    public static void main(String[] args) {
        jFrame.add(jPanel); // добавляем панель на форму

        // создание горизонтального слайдера
        JSlider jSlider = new JSlider((JSlider.HORIZONTAL));
        jPanel.add(jSlider); // добавление на панель

        //настройка слайдера
        jSlider.setMinorTickSpacing(5); // шаг школы
        jSlider.setMajorTickSpacing(20); // шаг появления надписи на шкале
        jSlider.setPaintTicks(true); // прорисовка шкалы
        jSlider.setSnapToTicks(true);// зацепиться ли за отметку на шкале?
        jSlider.setPaintLabels(true); // отображение надписей шкалы
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(); // создается форма
        jFrame.setVisible(true); // влючаем видимость
        jFrame.setBounds(750,250,500,500); // размеры
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // выход
        return jFrame;
    }
}
