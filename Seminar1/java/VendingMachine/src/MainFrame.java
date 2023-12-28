import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import Domain.*;
import Services.*;

public class MainFrame extends JFrame {

    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfProduct, tfCost;

    JTextArea listBox; // Текстовая область для вывода списка продуктов

    public void initialize(VendingMachine vm) {

        // Поле ввода номера продукта
        JLabel lbProduct = new JLabel("Product №");
        lbProduct.setFont(mainFont);

        tfProduct = new JTextField();
        tfProduct.setFont(mainFont);

        // Поле ввода наличности
        JLabel lbCost = new JLabel("Cost:");
        lbCost.setFont(mainFont);

        tfCost = new JTextField();
        tfCost.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbProduct);
        formPanel.add(tfProduct);
        formPanel.add(lbCost);
        formPanel.add(tfCost);

        // Установка области вывода продуктов
        listBox = new JTextArea();
        listBox.setFont(mainFont);
        listBox.setLineWrap(true);

        // Формирование и вывод списка продуктов
        List<Product> listProd = vm.getAssort();
        listBoxUpdate(listProd);

        JButton btnOk = new JButton("Купить товар");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Покупка продукта при нажатии кнопки купить товар
                int prodNumber = Integer.parseInt(tfProduct.getText());
                int cost = Integer.parseInt(tfCost.getText());
                long prodId = listProd.get(prodNumber - 1).getId();
                if (cost >= listProd.get(prodNumber - 1).getPrice()) {
                    vm.buyProduct(prodId);
                    listBoxUpdate(listProd);
                } else {
                    listBox.setText("Недостаточно денег для оплаты");
                }

            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Перезагрузка списка товаров при нажатии кнопки сброса
                listBoxUpdate(listProd);

            }

        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);

        mainPanel.add(listBox, BorderLayout.CENTER);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void listBoxUpdate(List<Product> listProd) {
        // Вывод списка продуктов
        String pr = "";
        int i = 1;

        for (Product p : listProd) {
            pr = pr + i + ". " + p.getName() + " - " + p.getPrice() + " р.\r\n";
            i++;
        }

        listBox.setText(pr);
    }

    public static void main(String[] arg) {
        MainFrame myFrame = new MainFrame();
        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display disp = new Display();
        List<Product> listProd = new ArrayList<>();
        VendingMachine vm = new VendingMachine(hold, coin, disp, listProd);
        myFrame.initialize(vm);
    }

}
