package project.src;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Shape Area
class shapes_area{
    //Constructor
    shapes_area(){

        //Create Window
        JFrame calciframe=new JFrame("AREA OF SHAPES");
        calciframe.setSize(1000,400);

        //Create Window Elements
        JLabel rect = new JLabel("RECTANGLE:");
        rect.setBounds(70, 100, 100, 50);

        JLabel rl = new JLabel("LENGTH:");
        rl.setBounds(80, 130, 100, 50);

        JTextField rtl = new JTextField();
        rtl.setBounds(170, 145, 100, 20);

        JLabel rtb = new JLabel("BREADTH:");
        rtb.setBounds(320, 130, 100, 50);

        JTextField rb = new JTextField();
        rb.setBounds(450, 145, 100, 20);

        JLabel area1 = new JLabel("AREA:");
        area1.setBounds(650, 130, 100, 50);

        JTextField res1 = new JTextField();
        res1.setBounds(700, 145, 100, 20);

        JLabel tri=new JLabel("TRIANGLE:");
        tri.setBounds(70, 170, 100, 50);

        JLabel th=new JLabel("HEIGHT:");
        th.setBounds(80, 195, 100, 50);

        JTextField tht=new JTextField();
        tht.setBounds(170, 215, 100, 20);

        JLabel tb=new JLabel("BASE:");
        tb.setBounds(320, 215, 100, 20);

        JTextField b=new JTextField();
        b.setBounds(450, 215, 100, 20);

        JLabel area2 = new JLabel("AREA:");
        area2.setBounds(650, 200, 100, 50);

        JTextField res2= new JTextField();
        res2.setBounds(700, 215, 100, 20);

        JLabel circ=new JLabel("CIRCLE:");
        circ.setBounds(70, 235, 100, 50);

        JLabel c=new JLabel("RADIUS:");
        c.setBounds(80, 255, 100, 50);

        JTextField cr=new JTextField();
        cr.setBounds(170, 270, 100, 20);

        JLabel area3= new JLabel("AREA:");
        area3.setBounds(650, 255, 100, 50);

        JTextField res3 = new JTextField();
        res3.setBounds(700, 270, 100, 20);

        JButton calc =new JButton("CALCULATE");
        calc.setBounds(70, 320, 120, 20);

        JButton calc2 =new JButton("EXIT");
        calc2.setBounds(210, 320, 120, 20);


        //Add Elements to Window

        calciframe.add(rect);
        calciframe.add(rl);
        calciframe.add(rtl);
        calciframe.add(rtb);
        calciframe.add(rb);
        calciframe.add(area1);
        calciframe.add(res1);
        calciframe.add(tri);
        calciframe.add(th);
        calciframe.add(tht);
        calciframe.add(tb);
        calciframe.add(b);
        calciframe.add(area2);
        calciframe.add(res2);
        calciframe.add(circ);
        calciframe.add(c);
        calciframe.add(cr);
        calciframe.add(area3);
        calciframe.add(res3);
        calciframe.add(calc);
        calciframe.add(calc2);


        //Window Properties
        calciframe.setLayout(null);
        calciframe.setVisible(true);


        //Handle Events
        calc2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calciframe.dispose();
            }
        });
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double rect_len=Double.parseDouble(rtl.getText());
                double rect_bred=Double.parseDouble(rb.getText());
                res1.setText(String.valueOf(rect_len*rect_bred));
                double tri_hi=Double.parseDouble(tht.getText());
                double tri_base=Double.parseDouble(b.getText());
                res2.setText(String.valueOf(tri_hi*tri_base*0.5));
                double circ_rad=Double.parseDouble(cr.getText());
                res3.setText(String.valueOf(3.14*circ_rad*circ_rad));
            }
        });

    }
}

class emp_rep{
    void emprep(){
        JFrame empframe=new JFrame("EMPLOYEE SALARY");
        empframe.setSize(800, 700);
        empframe.setLayout(null);
        empframe.setVisible(true);
        JLabel l1=new JLabel("Employee name");
        l1.setBounds(100,100,150,50);
        empframe.add(l1);
        JLabel l2=new JLabel("Employee ID");
        l2.setBounds(100,150,150,50);
        empframe.add(l2);
        JLabel l3=new JLabel("Employee mail id");
        l3.setBounds(100,200,150,50);
        empframe.add(l3);
        JLabel l4=new JLabel("Employee mobile no.");
        l4.setBounds(100,250,150,50);
        empframe.add(l4);
        JLabel l5=new JLabel("Employee address");
        l5.setBounds(100,300,150,50);
        empframe.add(l5);
        JLabel l6=new JLabel("Employee type");
        l6.setBounds(100,350,150,50);
        empframe.add(l6);
        JTextField t1=new JTextField();
        t1.setBounds(250,115,100,20);
        empframe.add(t1);
        JTextField t2=new JTextField();
        t2.setBounds(250,165,100,20);
        empframe.add(t2);
        JTextField t3=new JTextField();
        t3.setBounds(250,215,100,20);
        empframe.add(t3);
        JTextField t4=new JTextField();
        t4.setBounds(250,265,100,20);
        empframe.add(t4);
        JTextField t5=new JTextField();
        t5.setBounds(250,315,100,20);
        empframe.add(t5);
        JRadioButton r1=new JRadioButton("Professor");
        r1.setBounds(220,365,100,20);
        JRadioButton r2=new JRadioButton("Assistant Professor");
        JRadioButton r3=new JRadioButton("Associate Professor");
        r2.setBounds(360,365,200,20);
        r3.setBounds(560,365,200,20);
        JLabel l7=new JLabel("Basic Pay");
        l7.setBounds(100,395,150,50);
        empframe.add(l7);
        JTextField t6=new JTextField();
        t6.setBounds(250,405,100,20);
        empframe.add(t6);
        JButton b1=new JButton("Compute");
        JButton b2=new JButton("Exit");
        b1.setBounds(170,500,100,20);
        b2.setBounds(350,500,100,20);
        ButtonGroup bg=new ButtonGroup();
        empframe.add(r2);
        empframe.add(r3);
        empframe.add(b1);
        empframe.add(b2);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        empframe.add(r1);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                empframe.dispose();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                empframe.setSize(1500, 700);
                JTextArea rep=new JTextArea("\t\t*RECEIPT BILL*");
                rep.setBounds(900,100,500,500);
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
    }
}
class elec_bill {
    void electra() {
        JFrame elecframe=new JFrame("ELECTRICITY BILL");
        elecframe.setSize(600, 600);
        elecframe.setLayout(null);
        elecframe.setVisible(true);
        JLabel l1=new JLabel("Consumer Name");
        l1.setBounds(100,100,150,50);
        elecframe.add(l1);
        JLabel l2=new JLabel("Consumer ID");
        l2.setBounds(100,150,150,50);
        elecframe.add(l2);
        JLabel l3=new JLabel("Previous month reading");
        l3.setBounds(100,200,150,50);
        elecframe.add(l3);
        JLabel l4=new JLabel("Current month reading");
        l4.setBounds(100,250,150,50);
        elecframe.add(l4);
        JLabel l5=new JLabel("Type of bill");
        l5.setBounds(100,300,150,50);
        elecframe.add(l5);
        JTextField t1=new JTextField();
        t1.setBounds(250,115,100,20);
        elecframe.add(t1);
        JTextField t2=new JTextField();
        t2.setBounds(250,165,100,20);
        elecframe.add(t2);
        JTextField t3=new JTextField();
        t3.setBounds(250,215,100,20);
        elecframe.add(t3);
        JTextField t4=new JTextField();
        t4.setBounds(250,265,100,20);
        elecframe.add(t4);
        JRadioButton r1=new JRadioButton("Domestic");
        JRadioButton r2=new JRadioButton("Commercial");
        r1.setBounds(250,310,100,20);
        r2.setBounds(350,310,100,20);
        elecframe.add(r1);
        elecframe.add(r2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        JButton b1=new JButton("Compute bill");
        JButton b2=new JButton("Exit");
        b1.setBounds(100,360,110,20);
        b2.setBounds(220,360,110,20);
        elecframe.add(b1);
        elecframe.add(b2);
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                elecframe.dispose();
            }
        });
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                elecframe.setSize(1200, 600);
                JTextArea bill=new JTextArea("\t*ELECTRICITY BILL");
                bill.setBounds(600,100,350,500);
                bill.setEditable(false);
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
class calculator{
    void calci() {
        JFrame window = new JFrame("Calculator");
        window.setSize(450, 500);

        Font font = new Font("Arial", Font.PLAIN, 16);

        JTextField display = new JTextField();
        display.setBounds(30, 70, 345, 50);
        display.setEditable(false);
        display.setFont(font);

        JLabel label = new JLabel("");
        label.setBounds(320, 40, 100, 25);

        JButton add, sub, mul, div, clear, equals, exit;
        JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;

        //Initialize variables
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("×");
        div = new JButton("÷");
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

        //Set content position
        //Numbers
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

        //Operations
        add.setBounds(240, 150, 50, 50);
        sub.setBounds(240, 220, 50, 50);
        mul.setBounds(240, 290, 50, 50);
        div.setBounds(240, 360, 50, 50);
        equals.setBounds(310, 250, 60, 160);
        clear.setBounds(310, 150, 60, 90);
        exit.setBounds(30, 20, 100, 25);

        //Handle Events
        final double[] op1 = new double[1];
        final int[] op2 = new int[1];

        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num0.getText());
            }
        });


        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num1.getText());
            }
        });

        num2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num2.getText());
            }
        });

        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num3.getText());
            }
        });

        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num4.getText());
            }
        });

        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num5.getText());
            }
        });

        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num6.getText());
            }
        });

        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num7.getText());
            }
        });

        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num8.getText());
            }
        });

        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + num9.getText());
            }
        });

        //Operations
        final String[][] op = {new String[1]};
        final Boolean[] op_select = {false};

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!op_select[0] && !display.getText().isEmpty()) {
                    op1[0] = Integer.parseInt(display.getText());
                    label.setText(display.getText() + " " + add.getText());
                    op[0][0] = add.getText();

                    display.setText("");
                    op_select[0] = true;
                }
            }
        });


        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!op_select[0] && !display.getText().isEmpty()) {
                    op1[0] = Integer.parseInt(display.getText());
                    label.setText(display.getText() + " " + sub.getText());
                    op[0][0] = sub.getText();

                    display.setText("");
                    op_select[0] = true;
                }
            }
        });

        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!op_select[0] && !display.getText().isEmpty()) {
                    op1[0] = Integer.parseInt(display.getText());
                    label.setText(display.getText() + " " + mul.getText());
                    op[0][0] = mul.getText();

                    display.setText("");
                    op_select[0] = true;
                }
            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!op_select[0] && !display.getText().isEmpty()) {
                    op1[0] = Integer.parseInt(display.getText());
                    label.setText(display.getText() + " " + div.getText());
                    op[0][0] = "/";

                    display.setText("");
                    op_select[0] = true;
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                op1[0] = 0;
                op[0][0] = "";
                op2[0] = 0;
                display.setText("");
                label.setText("");
                op_select[0] = false;
            }
        });

        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(op_select[0] && !display.getText().isEmpty())
                {
                    op2[0] = Integer.parseInt(display.getText());

                    switch (op[0][0])
                    {
                        case "+":
                            label.setText(label.getText() + " " + display.getText());
                            display.setText(String.valueOf((op1[0] + op2[0])));
                            break;
                        case "-":
                            label.setText(label.getText() + " " + display.getText());
                            display.setText(String.valueOf((op1[0] - op2[0])));
                            break;
                        case "×":
                            label.setText(label.getText() + " " + display.getText());
                            display.setText(String.valueOf((op1[0] * op2[0])));
                            break;
                        case "/":
                            label.setText(label.getText() + " " + display.getText());
                            if(op2[0] != 0)
                                display.setText(String.valueOf((op1[0] / op2[0])));
                            else
                                display.setText("Error");
                            break;
                    }

                }
            }
        });

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
        l1.setBounds(100,100,150,50);
        bihexframe.add(l1);
        JLabel l2=new JLabel("DECIMAL");
        l2.setBounds(100,150,150,50);
        bihexframe.add(l2);
        JTextField t1=new JTextField();
        t1.setBounds(250,115,100,20);
        bihexframe.add(t1);
        JTextField t2=new JTextField();
        t2.setBounds(250,165,100,20);
        bihexframe.add(t2);
        JButton b1=new JButton("Calculate");
        JButton b2=new JButton("Exit");
        b1.setBounds(100,200,100,20);
        b2.setBounds(220,200,100,20);
        bihexframe.add(b1);
        bihexframe.add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
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
            @Override
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
        l1.setBounds(100,100,150,50);
        win.add(l1);
        JLabel l2=new JLabel("Job Role");
        l2.setBounds(100,150,150,50);
        win.add(l2);
        JLabel l3=new JLabel("Age");
        l3.setBounds(100,200,150,50);
        win.add(l3);
        JTextField t1=new JTextField();
        t1.setBounds(250,115,100,20);
        win.add(t1);
        JTextField t2=new JTextField();
        t2.setBounds(250,165,100,20);
        win.add(t2);
        JTextField t3=new JTextField();
        t3.setBounds(250,215,100,20);
        win.add(t3);
        JButton b1=new JButton("Apply");
        JButton b2=new JButton("Exit");
        b1.setBounds(100,250,110,20);
        b2.setBounds(220,250,110,20);
        win.add(b1);
        win.add(b2);
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                win.dispose();
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                win.setSize(1500,400);
                JTextArea r1= new  JTextArea("\t\t***Application*** ");
                r1.setBounds(900,100,400,300);
                int a=18;
                int b= 40;
                double Age= Double.parseDouble(t3.getText());
                if(Age<a)
                {
                    r1.append("\n\t\n\tSorry it's too Early To Apply!!!!");
                    r1.append("\n\t\n\tNAME:"+t1.getText());
                    r1.append("\n\t\n\tJob Role:"+t2.getText());
                    r1.append("\n\t\n\tAge:"+t3.getText());

                }
                else if(Age>b)
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
        this.setBounds(700,300,400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        lb1=new JLabel("MOVE CURSOR IN THE FRAME TO INITIATE MOUSE OPERATIONS");
        lb1.setBounds(150,150,400,25);
        this.add(lb1);
        this.addMouseListener(this);
        this.setVisible(true);
        JButton butty=new JButton("Exit");
        butty.setBounds(200,200,100,20);
        butty.addActionListener(e->this.dispose());
        this.add(butty);
    }


    public void mouseClicked(MouseEvent e) {
        lb1.setText("Mouse Clicked at X="+e.getX()+" Y="+e.getY());
    }



    public void mousePressed(MouseEvent e) {

        lb1.setText("Mouse Pressed at X="+e.getX()+" Y="+e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        lb1.setText("Mouse Released at X="+e.getX()+" Y="+e.getY());

    }

    public void mouseEntered(MouseEvent e) {
        lb1.setText("Mouse Entered at X="+e.getX()+" Y="+e.getY());

    }

    public void mouseExited(MouseEvent e) {

        lb1.setText("Mouse Exited at X="+e.getX()+" Y="+e.getY());
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
                Thread.sleep(1000);
                display.append(".");
                Thread.sleep(1000);
                display.append(".");
                Thread.sleep(1000);
                display.append(".");
                Thread.sleep(1000);
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
        JMenuBar bar=new JMenuBar();
        JMenu  lab=new JMenu("Lab Program");
        JMenu   assignment =new JMenu("Assignment Program");
        JMenu exit=new JMenu("Exit");

        bar.add(lab);
        bar.add(assignment);
        bar.add(exit);

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

        lab.add(emp);
        lab.add(elect);
        lab.add(excep);
        lab.add(shap_area);
        lab.add(Job);
        lab.add(mmt);
        lab.add(Thrd);

        assignment.add(Bi_hex);
        assignment.add(calci);

        exit.add(exit_item);

        f.setJMenuBar(bar);

        exit_item.addActionListener(new ActionListener() {
            @Override
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
            @Override
            public void actionPerformed(ActionEvent e) {
                shapes_area sa=new shapes_area();
            }
        });
        Job.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jobexec  j=new jobexec();
                j.job();
            }
        });
        mmt.addActionListener(new ActionListener() {
            @Override
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
