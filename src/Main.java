//package name
package project.src;
//imported modules
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Shape Area class
class shapes_area{
    //Constructor
    shapes_area(){
        //Create Window
        JFrame frame = new JFrame("AREA OF SHAPES");
        frame.setBounds(200, 200, 500, 400);
        JLabel select_shape = new JLabel("Select a Shape:");
        select_shape.setBounds(50, 50, 150, 22);
        frame.add(select_shape);
        String[] shapes = { "No shape selected", "Rectangle", "Triangle", "Circle" };
        JComboBox<String> shape_list = new JComboBox<>(shapes);
        shape_list.setBounds(200, 50, 170, 25);
        frame.add(shape_list);
        JButton calculate=new JButton("Calculate");
        JButton  exit=new JButton("Exit");
        //dropdown menu of shape names
        shape_list.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = frame.getContentPane().getComponentCount() - 1; i >= 0; i--) {
                    if (!(frame.getContentPane().getComponent(i) instanceof JButton)) {
                        frame.getContentPane().remove(i);
                    }
                }
                frame.add(select_shape);
                frame.add(shape_list);
                //area of rectangle
                if (shape_list.getSelectedItem().equals("Rectangle")) {
                    JLabel length = new JLabel("Length:");
                    length.setBounds(50, 100, 100, 30);
                    frame.add(length);
                    JLabel breadth = new JLabel("Breadth:");
                    breadth.setBounds(50, 140, 100, 30);
                    frame.add(breadth);
                    JLabel area = new JLabel("Area:");
                    area.setBounds(50, 180, 100, 30);
                    frame.add(area);
                    JTextField length_field=new JTextField();
                    length_field.setBounds(200, 100, 150, 30);
                    frame.add(length_field);
                    JTextField breadth_field=new JTextField();
                    breadth_field.setBounds(200, 140, 150, 30);
                    frame.add(breadth_field);
                    JTextField area_field=new JTextField();
                    area_field.setBounds(200, 180, 150, 30);
                    area_field.setEditable(false);
                    frame.add(area_field);
                    //area calculation button
                    calculate.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            double length=Double.parseDouble(length_field.getText());
                            double breadth=Double.parseDouble(breadth_field.getText());
                            area_field.setText(String.valueOf(length*breadth));
                        }
                    });
                }
                //area of triangle
                else if (shape_list.getSelectedItem().equals("Triangle")) {
                    JLabel base = new JLabel("Base:");
                    base.setBounds(50, 100, 100, 30);
                    frame.add(base);
                    JLabel height = new JLabel("Height:");
                    height.setBounds(50, 140, 100, 30);
                    frame.add(height);
                    JLabel area = new JLabel("Area:");
                    area.setBounds(50, 180, 100, 30);
                    frame.add(area);
                    JTextField base_field=new JTextField();
                    base_field.setBounds(200, 100, 150, 30);
                    frame.add(base_field);
                    JTextField height_field=new JTextField();
                    height_field.setBounds(200, 140, 150, 30);
                    frame.add(height_field);
                    JTextField area_field=new JTextField();
                    area_field.setBounds(200, 180, 150, 30);
                    area_field.setEditable(false);
                    frame.add(area_field);
                    calculate.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            double base=Double.parseDouble(base_field.getText());
                            double height=Double.parseDouble(height_field.getText());
                            area_field.setText(String.valueOf(0.5*base*height));
                        }
                    });
                }
                //area of circle
                else if (shape_list.getSelectedItem().equals("Circle")) {
                    JLabel base = new JLabel("Radius:");
                    base.setBounds(50, 100, 100, 30);
                    frame.add(base);
                    JLabel area = new JLabel("Area:");
                    area.setBounds(50, 180, 100, 30);
                    frame.add(area);
                    JTextField radius_field=new JTextField();
                    radius_field.setBounds(200, 100, 150, 30);
                    frame.add(radius_field);
                    JTextField area_field=new JTextField();
                    area_field.setBounds(200, 180, 150, 30);
                    area_field.setEditable(false);
                    frame.add(area_field);
                    calculate.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            double radius=Double.parseDouble(radius_field.getText());
                            area_field.setText(String.valueOf(3.14*radius*radius));
                        }
                    });
                }
                frame.revalidate();
                frame.repaint();
            }

        });

        calculate.setBounds(50, 250, 100, 25);
        frame.add(calculate);

        exit.setBounds(160, 250, 100, 25);
        frame.add(exit);
        //exit button
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

//Employee Pay Slip class
class emp_rep{
    //pay slip calculation function
    void emprep(){
        //Create Window
        JFrame empframe=new JFrame("EMPLOYEE SALARY");
        empframe.setSize(800, 700);

        //Create Window Elements
        JLabel l1=new JLabel("Employee name");
        l1.setBounds(100,15,150,50);
        empframe.add(l1);

        JLabel l2=new JLabel("Employee ID");
        l2.setBounds(100,65,150,50);
        empframe.add(l2);

        JLabel l3=new JLabel("Employee mail id");
        l3.setBounds(100,115,150,50);
        empframe.add(l3);

        JLabel l4=new JLabel("Employee mobile no.");
        l4.setBounds(100,165,150,50);
        empframe.add(l4);

        JLabel l5=new JLabel("Employee address");
        l5.setBounds(100,215,150,50);
        empframe.add(l5);

        JLabel l6=new JLabel("Employee type");
        l6.setBounds(100,265,150,50);
        empframe.add(l6);

        JTextField t1=new JTextField();
        t1.setBounds(250,30,100,20);
        empframe.add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(250,80,100,20);
        empframe.add(t2);

        JTextField t3=new JTextField();
        t3.setBounds(250,130,100,20);
        empframe.add(t3);

        JTextField t4=new JTextField();
        t4.setBounds(250,180,100,20);
        empframe.add(t4);

        JTextField t5=new JTextField();
        t5.setBounds(250,230,100,20);
        empframe.add(t5);

        JRadioButton r1=new JRadioButton("Professor");
        r1.setBounds(220,280,100,20);

        JRadioButton r2=new JRadioButton("Assistant Professor");
        JRadioButton r3=new JRadioButton("Associate Professor");
        r2.setBounds(360,280,200,20);
        r3.setBounds(560,280,200,20);

        JLabel l7=new JLabel("Basic Pay");
        l7.setBounds(100,310,150,50);
        empframe.add(l7);

        JTextField t6=new JTextField();
        t6.setBounds(250,320,100,20);
        empframe.add(t6);

        JButton b1=new JButton("Compute");
        JButton b2=new JButton("Exit");
        b1.setBounds(170,375,100,20);
        b2.setBounds(350,375,100,20);

        ButtonGroup bg=new ButtonGroup();

        empframe.add(r2);
        empframe.add(r3);
        empframe.add(b1);
        empframe.add(b2);

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        empframe.add(r1);
        JTextArea rep=new JTextArea();
        rep.setBounds(900,100,500,500);
        rep.setEditable(false);

        //Handle Events
        //exit button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                empframe.dispose();
            }
        });
        //bill calculate button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                empframe.setSize(1500, 700);
                rep.setText("");
                rep.append("\t\t*RECEIPT BILL*");
                rep.append("\n\t\nEMPLOYEE NAME:"+t1.getText());
                rep.append("\n\t\nEMPLOYEE ID:"+t2.getText());
                rep.append("\n\t\nEMPLOYEE MAIL ID:"+t3.getText());
                rep.append("\n\t\nPHONE NUMBER:"+t4.getText());
                rep.append("\n\t\nADDRESS:"+t5.getText());
                String type="";
                double BP=Double.parseDouble(t6.getText());
                if(r1.isSelected())
                    type="Professor";
                else if(r2.isSelected())
                    type="Assistant Professor";
                else if(r3.isSelected())
                    type="Associate Professor";
                rep.append("\n\t\nEMPLOYEE TYPE:"+type);
                //pay slip for professor
                if(type.equals("Professor")){
                    double DA=0.97*BP,HRA=0.1*BP,PF=0.12*BP,STAFF=0.001*BP,GP,NP;
                    GP=DA+HRA+BP;
                    NP=GP-PF-STAFF;
                    rep.append("\n\t\nDA:"+DA);
                    rep.append("\n\t\nHRA:"+HRA);
                    rep.append("\n\t\nPF:"+PF);
                    rep.append("\n\t\nSTAFF:"+STAFF);
                    rep.append("\n\t\nGP:"+GP);
                    rep.append("\n\t\nNP:"+NP);
                }
                //pay slip for associate professor
                else if(type.equals("Associate Professor")){
                    double DA=0.7*BP,HRA=0.1*BP,PF=0.12*BP,STAFF=0.001*BP,GP,NP;
                    GP=DA+HRA+BP;
                    NP=GP-PF-STAFF;
                    rep.append("\n\t\nDA:"+DA);
                    rep.append("\n\t\nHRA:"+HRA);
                    rep.append("\n\t\nPF:"+PF);
                    rep.append("\n\t\nSTAFF:"+STAFF);
                    rep.append("\n\t\nGP:"+GP);
                    rep.append("\n\t\nNP:"+NP);
                }
                //payslip for assistant professor
                else if(type.equals("Assistant Professor")){
                    double DA=0.6*BP,HRA=0.1*BP,PF=0.12*BP,STAFF=0.001*BP,GP,NP;
                    GP=DA+HRA+BP;
                    NP=GP-PF-STAFF;
                    rep.append("\n\t\nDA:"+DA);
                    rep.append("\n\t\nHRA:"+HRA);
                    rep.append("\n\t\nPF:"+PF);
                    rep.append("\n\t\nSTAFF:"+STAFF);
                    rep.append("\n\t\nGP:"+GP);
                    rep.append("\n\t\nNP:"+NP);
                }
                empframe.repaint();
                empframe.revalidate();
                empframe.add(rep);
            }
        });

        empframe.setLayout(null);
        empframe.setVisible(true);
    }
}
//electricity bill class
class elec_bill {
    void electra() {
        //Create Window
        JFrame elecframe=new JFrame("ELECTRICITY BILL");
        elecframe.setSize(600, 400);

        elecframe.setLayout(null);
        elecframe.setVisible(true);

        JLabel l1=new JLabel("Consumer Name");
        l1.setBounds(100,20,150,50);
        elecframe.add(l1);

        JLabel l2=new JLabel("Consumer ID");
        l2.setBounds(100,70,150,50);
        elecframe.add(l2);

        JLabel l3=new JLabel("Previous month reading");
        l3.setBounds(100,120,150,50);
        elecframe.add(l3);

        JLabel l4=new JLabel("Current month reading");
        l4.setBounds(100,170,150,50);
        elecframe.add(l4);

        JLabel l5=new JLabel("Type of bill");
        l5.setBounds(100,220,150,50);
        elecframe.add(l5);

        JTextField t1=new JTextField();
        t1.setBounds(250,35,100,20);
        elecframe.add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(250,85,100,20);
        elecframe.add(t2);

        JTextField t3=new JTextField();
        t3.setBounds(250,135,100,20);
        elecframe.add(t3);

        JTextField t4=new JTextField();
        t4.setBounds(250,185,100,20);
        elecframe.add(t4);

        JRadioButton r1=new JRadioButton("Domestic");
        JRadioButton r2=new JRadioButton("Commercial");
        r1.setBounds(250,230,100,20);
        r2.setBounds(350,230,100,20);
        elecframe.add(r1);
        elecframe.add(r2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b1=new JButton("Compute bill");
        JButton b2=new JButton("Exit");
        b1.setBounds(100,280,110,20);
        b2.setBounds(220,280,110,20);
        elecframe.add(b1);
        elecframe.add(b2);
        JTextArea bill=new JTextArea();
        bill.setBounds(500,20,350,300);
        bill.setEditable(false);
        //Handle Events
        //exit button
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                elecframe.dispose();
            }
        });
        //bill computation button
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                elecframe.setSize(1000, 400);
                bill.setText("");
                bill.append("\t*ELECTRICITY BILL");
                bill.append("\n\nCONSUMER NAME:"+t1.getText());
                bill.append("\n\nCONSUMER ID:"+t2.getText());
                bill.append("\n\nPREVIOUS MONTH READING:"+t3.getText());
                bill.append("\n\nCURRENT MONTH READING"+t4.getText());
                double units=Integer.parseInt(t4.getText())-Integer.parseInt(t3.getText());
                bill.append("\n\nUNITS:"+String.valueOf(units));
                String type="";
                double bill_amt=0;
                if(r1.isSelected())
                    type="Domestic";
                else if(r2.isSelected())
                    type="Commercial";
                bill.append("\n\nTYPE OF BILL:"+type);
                //for domestic type of bill
                if(type.equals("Domestic")){
                    if(units<=100)
                        bill_amt=units*1;
                    else if (units<=200)
                        bill_amt=100+ (units-100)*2.5;
                    else if (units<=500)
                        bill_amt=100+ 100*2.5+(units-200)*4;
                    else if(units>500)
                        bill_amt=100+100*2.5+300*4+(units-500)*6;
                }
                //for commercial type of bill
                else if(type.equals("Commercial")) {
                    if (units <= 100)
                        bill_amt = units * 2;
                    else if (units <= 200)
                        bill_amt = 100 * 2 + (units - 100) * 4.5;
                    else if (units <= 500)
                        bill_amt = 100 * 2 + 100 * 4.5 + (units - 200) * 6;
                    else if (units > 500)
                        bill_amt = 100 * 2.5 + 100 * 4 + 300 * 6 + (units - 500) * 7;
                }
                bill.append("\n\nBILL AMOUNT:"+String.valueOf(bill_amt));
                elecframe.revalidate();
                elecframe.repaint();
                elecframe.add(bill);
            }
        });
    }
}
//calculator class
class calculator{
    void calci() {
        //Create Window
        JFrame window = new JFrame("Calculator");
        window.setSize(450, 500);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.BLACK); // Set the background of the window to black

        Font font = new Font("Arial", Font.PLAIN, 16);
        Font font1 = new Font("Arial", Font.PLAIN, 16);

        JTextField display = new JTextField();
        display.setBounds(30, 70, 345, 50);
        display.setEditable(false);
        display.setFont(font);
        display.setBackground(Color.BLACK); // Set display background to black
        display.setForeground(Color.WHITE); // Set display text to white

        JLabel label = new JLabel("");
        label.setBounds(320, 40, 100, 25);
        label.setForeground(Color.WHITE); // Set label text color to white

        // Initialize variables
        JButton add, sub, mul, div, clear, equals, exit, delete;
        JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("×");
        div = new JButton("/");
        delete = new JButton("<");
        clear = new JButton("C");
        equals = new JButton("=");
        exit = new JButton("Exit");

        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");

        // Set button colors
        JButton[] buttons = {   add, sub, mul, div, clear, equals, exit, delete,
                num0, num1, num2, num3, num4, num5, num6, num7, num8, num9
        };

        for (JButton button : buttons) {
            button.setFont(font1);
            button.setBackground(Color.DARK_GRAY);  // Set button background to gray
            button.setForeground(Color.WHITE); // Set button text color to white
        }

        add.setBackground(Color.gray);
        sub.setBackground(Color.gray);
        mul.setBackground(Color.gray);
        div.setBackground(Color.gray);

        exit.setBackground(Color.RED);
        clear.setBackground(Color.ORANGE);
        clear.setForeground(Color.black);
        equals.setBackground(Color.GREEN);
        equals.setForeground(Color.black);

        // Set content position
        // Numbers
        num7.setBounds(30, 150, 50, 50);
        num8.setBounds(100, 150, 50, 50);
        num9.setBounds(170, 150, 50, 50);

        num4.setBounds(30, 220, 50, 50);
        num5.setBounds(100, 220, 50, 50);
        num6.setBounds(170, 220, 50, 50);

        num1.setBounds(30, 290, 50, 50);
        num2.setBounds(100, 290, 50, 50);
        num3.setBounds(170, 290, 50, 50);

        num0.setBounds(30, 360, 200, 50);

        // Operations
        add.setBounds(240, 150, 50, 50);
        sub.setBounds(240, 220, 50, 50);
        mul.setBounds(240, 290, 50, 50);
        div.setBounds(240, 360, 50, 50);
        equals.setBounds(310, 280, 60, 130);
        clear.setBounds(310, 200, 60, 70);
        delete.setBounds(310, 150, 58, 40);
        exit.setBounds(30, 20, 100, 25);


        //Handle Events
        final boolean[] setOperator = {false};
        double op1;
        double op2;
        String operator;
        //digits from 0 to 9

        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num0.getText());
                setOperator[0] = true;
            }
        });


        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num1.getText());
                setOperator[0] = true;
            }
        });

        num2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num2.getText());
                setOperator[0] = true;
            }
        });

        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num3.getText());
                setOperator[0] = true;
            }
        });

        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num4.getText());
                setOperator[0] = true;
            }
        });

        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num5.getText());
                setOperator[0] = true;
            }
        });

        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num6.getText());
                setOperator[0] = true;
            }
        });

        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num7.getText());
                setOperator[0] = true;
            }
        });

        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num8.getText());
                setOperator[0] = true;
            }
        });

        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num9.getText());
                setOperator[0] = true;
            }
        });

        //Operations

       //addition
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(setOperator[0])
                {
                    display.setText(display.getText() + add.getText());
                    setOperator[0] = false;
                }

            }
        });

        //subtraction
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(setOperator[0])
                {
                    display.setText(display.getText() + sub.getText());
                    setOperator[0] = false;
                }
            }
        });
        //multiplication
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(setOperator[0])
                {
                    display.setText(display.getText() + "*");
                    setOperator[0] = false;
                }
            }
        });
         //division
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(setOperator[0])
                {
                    display.setText(display.getText() + div.getText());
                    setOperator[0] = false;
                }
            }
        });
        //all clear button
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                label.setText("");
                setOperator[0] = false;
            }
        });
        //equals button
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int count = 0;
                int output = 0;
                String value1 = "";
                int length = display.getText().length();

                if(!display.getText().isEmpty() && setOperator[0])
                {
                    while (true) {

                        String value2 = "", operator;

                        if (value1.isEmpty())
                            while (count != length) {
                                if (Character.isDigit(display.getText().charAt(count)))
                                    value1 = value1 + display.getText().charAt(count++);
                                else
                                    break;
                            }
                        operator = String.valueOf(display.getText().charAt(count++));
                        while (count != length) {
                            if (Character.isDigit(display.getText().charAt(count)))
                                value2 = value2 + display.getText().charAt(count++);
                            else
                                break;
                        }
                        if (!value1.isEmpty() && !value2.isEmpty()) {
                            switch (operator) {
                                case "+":
                                    output = (Integer.parseInt(value1) + Integer.parseInt(value2));
                                    break;
                                case "-":
                                    output = (Integer.parseInt(value1) - Integer.parseInt(value2));
                                    break;
                                case "*":
                                    output = (Integer.parseInt(value1) * Integer.parseInt(value2));
                                    break;
                                case "/":
                                    if(Integer.parseInt(value2) != 0)
                                    {
                                        output = (Integer.parseInt(value1) / Integer.parseInt(value2));
                                        break;
                                    }
                                default:
                                    display.setText("MATH ERROR");
                                    return;
                            }

                            if (count != length)
                            {
                                value1 = String.valueOf(output);
                            }
                            else
                            {
                                label.setText(display.getText());
                                display.setText(String.valueOf(output));
                                return;
                            }

                        }
                    }
                }
                display.setText("ERROR");
            }
        });
        //delete or backspace button
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!display.getText().isEmpty())
                    try {
                        if(!Character.isDigit(display.getText().charAt(display.getText().length()-1)))
                            setOperator[0] = true;
                        display.setText(display.getText(0, display.getText().length() - 1));
                        if(display.getText().isEmpty())
                            setOperator[0] = false;
                    } catch (BadLocationException ex) {
                        throw new RuntimeException(ex);
                    }

            }
        });
        //exit button
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                window.dispose();
            }
        });


        //display Elements
        window.add(display);
        window.add(label);
        //Numbers
        window.add(num7);
        window.add(num8);
        window.add(num9);
        window.add(num4);
        window.add(num5);
        window.add(num6);
        window.add(num1);
        window.add(num2);
        window.add(num3);
        window.add(num0);

        //Operations
        window.add(add);
        window.add(sub);
        window.add(mul);
        window.add(div);
        window.add(equals);
        window.add(clear);
        window.add(delete);
        window.add(exit);

        window.setLayout(null);
        window.setVisible(true);
    }
}

class binary {

    binary() {

        JFrame bihexframe=new JFrame("BINARY<=>DECIMAL");
        bihexframe.setSize(500, 400);

        JLabel l1=new JLabel("BINARY");
        l1.setBounds(100,35,150,50);
        bihexframe.add(l1);

        JLabel l2=new JLabel("DECIMAL");
        l2.setBounds(100,150-65,150,50);
        bihexframe.add(l2);

        JTextField t1=new JTextField();
        t1.setBounds(250,115-65,100,20);
        bihexframe.add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(250,165-65,100,20);
        bihexframe.add(t2);

        JButton b1=new JButton("Calculate");
        JButton b2=new JButton("Exit");
        b1.setBounds(100,200-65,100,20);
        b2.setBounds(220,200-65,100,20);
        bihexframe.add(b1);
        bihexframe.add(b2);

        //Handle Events
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //dec to bin
                if(t1.getText().length() == 0)
                {
                    int dec_num = Integer.parseInt(t2.getText());
                    String str_term = "";
                    String term = "";
                    if (dec_num == 0) {
                        t1.setText("0");
                        return;
                    }
                    while (dec_num != 0) {
                        int num_term = dec_num % 2;
                        dec_num = dec_num / 2;
                        term = String.valueOf(num_term);
                        str_term = str_term + term;
                    }
                    char[] original = str_term.toCharArray();
                    char temp1;
                    int i = 0, j = str_term.length() - 1;
                    while (i < j) {
                        temp1 = original[j];
                        original[j] = original[i];
                        original[i] = temp1;
                        i++;
                        j--;
                    }
                    str_term = String.valueOf(original);
                    t1.setText(str_term);
                    t2.setText("");
                }
                else
                {
                    //binary to dec:
                    int dec_sum_no=0;
                    String str_bin=t1.getText();
                    char temp2;
                    char[] bin_array=str_bin.toCharArray();
                    int m=0;
                    int   n=str_bin.length()-1;
                    while(m<n){
                        temp2=bin_array[n];
                        bin_array[n]=bin_array[m];
                        bin_array[m]=temp2;
                        m++;
                        n--;
                    }
                    for(int k=0;k<str_bin.length();k++){
                        dec_sum_no+=Character.getNumericValue(bin_array[k])*(int)Math.pow(2,k);
                    }
                    t2.setText(String.valueOf(dec_sum_no));
                    t1.setText("");
                }
            }});
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bihexframe.dispose();}
        });

        bihexframe.setLayout(null);
        bihexframe.setVisible(true);

    }
}

class exception {
    exception() {

        Font font = new Font("Arial", Font.PLAIN, 16);
        JTextArea arey = new JTextArea();
        arey.setBounds(230, 50, 500, 300);
        arey.setEditable(false);
        arey.setAutoscrolls(true);
        arey.setFont(font);


        JFrame window = new JFrame("Exception Handling");
        window.setSize(800, 400);

        JButton procA, procB, procC, exit;
        procA = new JButton("Procedure A");
        procB = new JButton("Procedure B");
        procC = new JButton("Procedure C");
        exit = new JButton("Exit");

        JLabel output = new JLabel("OUTPUT :");
        output.setBounds(250, 20, 100, 25);
        output.setFont(font);

        procA.setBounds(30, 50, 120, 35);
        procB.setBounds(30, 120, 120, 35);
        procC.setBounds(30, 190, 120, 35);
        exit.setBounds(30, 260, 120, 35);

        window.add(procA);
        window.add(procB);
        window.add(procC);
        window.add(output);
        window.add(exit);


        //Handle Events
        procA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                arey.setText("");
                arey.append("\n  Inside procA");
                arey.append("\n  procA's finally");
                arey.append("\n  Exception caught: java.lang.RuntimeException: demo");


            }
        });

        procB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                arey.setText("");
                arey.append("\n  Inside procB");
                arey.append("\n  procB's finally");

            }
        });

        procC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                arey.setText("");
                arey.append("\n  Inside procC");
                arey.append("\n  procC's finally");

            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                window.dispose();

            }
        });

        window.add(arey);
        window.setLayout(null);
        window.setVisible(true);
    }
}
class jobexec{
    void job(){
        Font font = new Font("Arial",Font.PLAIN,16);
        JTextArea j = new JTextArea();
        j.setBounds(230,50,500,300);
        j.setEditable(false);
        j.setAutoscrolls(true);
        j.setFont(font);

        JFrame win = new JFrame("Job Application");
        win.setSize(800,400);

        win.setLayout(null);
        win.setVisible(true);

        JLabel l1=new JLabel("Name:");
        l1.setBounds(100,35,150,50);
        win.add(l1);

        JLabel l2=new JLabel("Job Role");
        l2.setBounds(100,85,150,50);
        win.add(l2);

        JLabel l3=new JLabel("Age");
        l3.setBounds(100,135,150,50);
        win.add(l3);

        JTextField t1=new JTextField();
        t1.setBounds(250,50,100,20);
        win.add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(250,100,100,20);
        win.add(t2);

        JTextField t3=new JTextField();
        t3.setBounds(250,150,100,20);
        win.add(t3);

        JButton b1=new JButton("Apply");
        JButton b2=new JButton("Exit");
        b1.setBounds(100,185,110,20);
        b2.setBounds(220,185,110,20);
        win.add(b1);
        win.add(b2);
        JTextArea r1= new  JTextArea();
        r1.setBounds(400,50,400,330);
        r1.setEditable(false);
        //Handle Events
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                win.dispose();
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                win.setSize(900,400);
                r1.setText("");
                r1.append("\t\t***Application*** ");
                double Age= Double.parseDouble(t3.getText());
                if(Age<18)
                {
                    r1.append("\n\t\n\tSorry it's too Early To Apply!!!!");
                    r1.append("\n\t\n\tNAME:"+t1.getText());
                    r1.append("\n\t\n\tJob Role:"+t2.getText());
                    r1.append("\n\t\n\tAge:"+t3.getText());

                }
                else if(Age>40)
                {
                    r1.append("\n\t\n\tSorry it's too Late To Apply!!!!!");
                    r1.append("\n\t\n\tNAME:"+t1.getText());
                    r1.append("\n\t\n\tJob Role:"+t2.getText());
                    r1.append("\n\t\n\tAge:"+t3.getText());
                }
                else
                {r1.append("\n\t\n\tCongratulations you are eligible  for the Job!!!");
                    r1.append("\n\t\n\tNAME:"+t1.getText());
                    r1.append("\n\t\n\tJob Role:"+t2.getText());
                    r1.append("\n\t\n\tAge:"+t3.getText());
                }
                win.revalidate();
                win.repaint();
                win.add(r1);


            }

        });

    }
}



@SuppressWarnings("serial")
class MMT1 extends JFrame implements MouseListener {
    JLabel lb1;
    @SuppressWarnings("unused")
    MMT1(){
        new JFrame();
        this.setTitle("MOUSE ACTION LISTENER");
        this.setBounds(700, 300,700, 500);
        this.setLayout(null);
        lb1=new JLabel("MOVE CURSOR IN THE FRAME TO INITIATE MOUSE OPERATIONS");
        lb1.setFont(new Font("Arial",Font.PLAIN,15));
        lb1.setBounds((this.getWidth()/2)-200,this.getHeight()/2,550,25);
        this.add(lb1);
        this.addMouseListener(this);
        this.setVisible(true);
        JButton butone=new JButton("Exit");
        butone.setBounds(700,300,100,20);
        butone.addActionListener(e->this.dispose());
        this.add(butone);
    }


    public void mouseClicked(MouseEvent e) {
        lb1.setText("Mouse Clicked at X="+e.getX()+" Y="+e.getY());
        lb1.setBounds((this.getWidth()/2)-lb1.getText().length(),this.getHeight()/2,550,25);
    }



    public void mousePressed(MouseEvent e) {
        lb1.setText("Mouse Pressed at X="+e.getX()+" Y="+e.getY());
        lb1.setBounds((this.getWidth()/2)-lb1.getText().length(),this.getHeight()/2,550,25);
    }

    public void mouseReleased(MouseEvent e) {
        lb1.setText("Mouse Released at X="+e.getX()+" Y="+e.getY());
        lb1.setBounds((this.getWidth()/2)-lb1.getText().length(),this.getHeight()/2,550,25);
    }

    public void mouseEntered(MouseEvent e) {
        lb1.setText("Mouse Entered at X="+e.getX()+" Y="+e.getY());
        lb1.setBounds((this.getWidth()/2)-lb1.getText().length(),this.getHeight()/2,550,25);
    }

    public void mouseExited(MouseEvent e) {
        lb1.setText("Mouse Exited at X="+e.getX()+" Y="+e.getY());
        lb1.setBounds((this.getWidth()/2)-lb1.getText().length(),this.getHeight()/2,550,25);
    }


}

//Threading
class Even extends Thread{
    int number;
    JTextArea display;

    Even(int number, JTextArea display)
    {
        this.number = number;
        this.display = display;
    }

    public void run()
    {
        display.append("\n  " + number + " is even");
        display.append("\n  Its square is " + (number*number) + "\n");
    }
}

class Odd extends Thread{
    int number;
    JTextArea display;
    Odd(int number, JTextArea display)
    {
        this.number = number;
        this.display = display;
    }

    public void run()
    {
        display.append("\n  " + number + " is odd");
        display.append("\n  Its cube is " + (number*number*number) + "\n");
    }
}

class thrd extends Thread{
    boolean is_running = false;
    boolean new_thread = true;
    JFrame window = new JFrame("Threading");
    JTextArea display = new JTextArea();

    thrd(){

        //Inititalize variables

        window.setSize(450, 500);

        Font font = new Font("Arial", Font.PLAIN, 16);
        Font font1 = new Font("Arial", Font.PLAIN, 24);


        display.setBounds(30, 70, 365, 310);
        display.setEditable(false);
        display.setFont(font);

        JLabel output = new JLabel("Output");
        output.setBounds((window.getSize().width/2)-50, 30, 100, 25);
        output.setFont(font1);

        JButton start, exit;
        start = new JButton("Start");
        start.setBounds(50, 400, 100, 35);

        exit = new JButton("Exit");
        exit.setBounds(270, 400, 100, 35);

        //Handle Events
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(start.getText(), "Start"))
                {
                    is_running = true;
                    start.setText("Stop");
                    if(new_thread) {
                        start();
                        new_thread = false;
                    }
                }
                else{
                    is_running = false;
                    start.setText("Start");
                }

            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                window.dispose();
            }
        });

        //Draw elements
        window.add(display);
        window.add(start);
        window.add(exit);
        window.add(output);

        window.setLayout(null);
        window.setVisible(true);

    }

    public void run(){
        int number, count = 0;
        Random rand = new Random();
        while (true){
            if(is_running) {
                if (count > 3) {
                    display.setText("");
                    count = 0;
                }
                number = rand.nextInt(10);
                display.append("\n  The number is " + number);
                count++;

                if (number % 2 == 0) {
                    Even t = new Even(number, display);
                    t.start();
                } else {
                    Odd t = new Odd(number, display);
                    t.start();
                }


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else
            try {
                display.setText("\n Program Terminated");
                Thread.sleep(500);
                display.append(".");
                Thread.sleep(500);
                display.append(".");
                Thread.sleep(500);
                display.append(".");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {

        JFrame f=new JFrame(" OPEN ENDED");
        f.setBounds(200,200,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel name=new JLabel("JAVA OPEN ENDED  ASSIGNMENT");
        JLabel point1=new JLabel("->  Click on the Lab Programs option to look into the Lab programs list");
        JLabel point2=new JLabel("-> Click on the Assignment Programs option  to look into the Assignments programs list");
        JLabel point3=new JLabel("->  Click on the Exit option to Quit the Application");
        JLabel point4=new JLabel("->  Click on the Developers option to look into the Team members-list");
        name.setBounds(475,80,700,500);
        point1.setBounds(420,145,1500,500);
        point2.setBounds(420,185,1500,500);
        point3.setBounds(420,225,1500,500);
        point4.setBounds(420,265,1500,500);
        name.setFont(new Font("Arial",Font.PLAIN,30));
        point1.setFont(new Font("Arial",Font.PLAIN,25));
        point2.setFont(new Font("Arial",Font.PLAIN,25));
        point3.setFont(new Font("Arial",Font.PLAIN,25));
        point4.setFont(new Font("Arial",Font.PLAIN,25));
        f.add(name);
        f.add(point1);
        f.add(point2);
        f.add(point3);
        f.add(point4);
        JMenuBar bar=new JMenuBar();
        JMenu lab=new JMenu("Lab Programs");
        JMenu assignment =new JMenu("Assignment Programs");
        JMenu exit=new JMenu("Exit");
        JMenu devs=new JMenu("Developers");

        bar.add(lab);
        bar.add(assignment);
        bar.add(exit);
        bar.add(devs);

        JMenuItem emp=new JMenuItem("Employee Salary");
        JMenuItem elect=new JMenuItem("Electricity Bill");
        JMenuItem excep = new JMenuItem("Exception Handling");
        JMenuItem shap_area = new JMenuItem("Area of Shapes");
        JMenuItem Job=new JMenuItem("Job Exception");
        JMenuItem mmt=new JMenuItem("Mouse Listener");
        JMenuItem Thrd = new JMenuItem("Threading");
        JMenuItem Bi_hex=new JMenuItem("Binary to decimal");
        JMenuItem calci=new JMenuItem("Calculator");
        JMenuItem exit_item=new JMenuItem("Exit options");
        JMenuItem reon=new JMenuItem("Reon Dsouza -> 4SO23CS184");
        JMenuItem ruben=new JMenuItem("Ruben Saldanha -> 4SO23CS191");
        JMenuItem samuel=new JMenuItem("Samuel Pinto -> 4SO23CS195");
        JMenuItem shivam=new JMenuItem("Shivam S -> 4SO23CS214");



        lab.add(emp);
        lab.add(elect);
        lab.add(excep);
        lab.add(shap_area);
        lab.add(Job);
        lab.add(mmt);
        lab.add(Thrd);

        assignment.add(Bi_hex);
        assignment.add(calci);

        devs.add(reon);
        devs.add(ruben);
        devs.add(samuel);
        devs.add(shivam);


        exit.add(exit_item);

        f.setJMenuBar(bar);

        exit_item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice= JOptionPane.showConfirmDialog(f,"Thank you,would you like to exit?","EXIT",JOptionPane.YES_NO_OPTION);
                if(choice==JOptionPane.YES_OPTION){
                    Window[] array_frames = Window.getWindows();
                    for (Window each_frame : array_frames) {
                        if (each_frame != f) {
                            each_frame.dispose();
                        }
                    }
                    System.exit(0);
                }
            }
        });
        calci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator calcobj=new calculator();
                calcobj.calci();
            }
        });
        elect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elec_bill elecb_obj=new elec_bill();
                elecb_obj.electra();
            }
        });
        emp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                emp_rep empy=new emp_rep();
                empy.emprep();
            }
        });
        Bi_hex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                binary bye_bye = new binary();
            }
        });
        excep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exception excep = new exception();
            }
        });
        shap_area.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shapes_area sa=new shapes_area();
            }
        });
        Job.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jobexec  j=new jobexec();
                j.job();
            }
        });
        mmt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MMT1 program = new MMT1();

            }
        });
        Thrd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thrd program = new thrd();
            }
        });


        f.setLayout(null);
        f.setVisible(true);
    }
}
