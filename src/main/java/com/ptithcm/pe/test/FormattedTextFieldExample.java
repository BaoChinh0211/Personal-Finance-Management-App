package com.ptithcm.pe.test;

import javax.swing.*;
import javax.swing.text.*;
import java.text.NumberFormat;

public class FormattedTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formatted TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // Tạo định dạng số có phân tách hàng nghìn
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setGroupingUsed(true);

        // Tạo một JFormattedTextField với định dạng số
        JFormattedTextField textField = new JFormattedTextField(format);
        textField.setColumns(10);

        // Sử dụng DocumentFilter để loại bỏ các ký tự không phải là số
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        panel.add(new JLabel("Enter Number: "));
        panel.add(textField);

        frame.getContentPane().add(panel);
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
