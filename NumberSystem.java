import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberSystem {
    JFrame frame;
    JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, clr;
    JTextField output;
    JLabel solution;
    ImageIcon icon;
    double aVal = 0, bVal = 0, cVal = 0, dVal = 0, eVal = 0, fVal = 0, gVal = 0, hVal = 0, iVal = 0, jVal = 0, kVal = 0, lVal = 0, mVal = 0, nVal = 0, oVal = 0, pVal = 0;

        public NumberSystem(){

        //SETUP THE BUTTONS FOR USER INPUT
            a = new JButton("0");
            a.setBounds(10, 10, 90, 90);
            a.setBackground(new Color(38, 39, 42));
            a.setForeground(Color.GRAY);
            a.setFont(new Font("Arial", Font.BOLD, 32));
            a.addActionListener(new aListener());
            
            b = new JButton("0");
            b.setBounds(100, 10, 90, 90);
            b.setBackground(new Color(38, 39, 42));
            b.setForeground(Color.GRAY);
            b.setFont(new Font("Arial", Font.BOLD, 32));
            b.addActionListener(new bListener());
    
            c = new JButton("0");
            c.setBounds(190, 10, 90, 90);
            c.setBackground(new Color(38, 39, 42));
            c.setForeground(Color.GRAY);
            c.setFont(new Font("Arial", Font.BOLD, 32));
            c.addActionListener(new cListener());
    
            d = new JButton("0");
            d.setBounds(270, 10, 90, 90);
            d.setBackground(new Color(38, 39, 42));
            d.setForeground(Color.GRAY);
            d.setFont(new Font("Arial", Font.BOLD, 32));
            d.addActionListener(new dListener());
    
            e = new JButton("0");
            e.setBounds(360, 10, 90, 90);
            e.setBackground(new Color(38, 39, 42));
            e.setForeground(Color.GRAY);
            e.setFont(new Font("Arial", Font.BOLD, 32));
            e.addActionListener(new eListener());

    
            f = new JButton("0");
            f.setBounds(450, 10, 90, 90);
            f.setBackground(new Color(38, 39, 42));
            f.setForeground(Color.GRAY);
            f.setFont(new Font("Arial", Font.BOLD, 32));
            f.addActionListener(new fListener());
    
            g = new JButton("0");
            g.setBounds(540, 10, 90, 90);
            g.setBackground(new Color(38, 39, 42));
            g.setForeground(Color.GRAY);
            g.setFont(new Font("Arial", Font.BOLD, 32));
            g.addActionListener(new gListener());
    
            h = new JButton("0");
            h.setBounds(630, 10, 90, 90);
            h.setBackground(new Color(38, 39, 42));
            h.setForeground(Color.GRAY);
            h.setFont(new Font("Arial", Font.BOLD, 32));
            h.addActionListener(new hListener());
            h.addActionListener(new hListener());

            i = new JButton("0");
            i.setBounds(710, 10, 90, 90);
            i.setBackground(new Color(38, 39, 42));
            i.setForeground(Color.GRAY);
            i.setFont(new Font("Arial", Font.BOLD, 32));
            i.addActionListener(new iListener());

            j = new JButton("0");
            j.setBounds(800, 10, 90, 90);
            j.setBackground(new Color(38, 39, 42));
            j.setForeground(Color.GRAY);
            j.setFont(new Font("Arial", Font.BOLD, 32));
            j.addActionListener(new jListener());

            k = new JButton("0");
            k.setBounds(890, 10, 90, 90);
            k.setBackground(new Color(38, 39, 42));
            k.setForeground(Color.GRAY);
            k.setFont(new Font("Arial", Font.BOLD, 32));
            k.addActionListener(new kListener());

            l = new JButton(".");
            l.setBounds(980, 10, 90, 90);
            l.setBackground(new Color(38, 39, 42));
            l.setForeground(Color.GRAY);
            l.setFont(new Font("Arial", Font.BOLD, 32));
            //NO LISTENER SINCE DECIMAL

            m = new JButton("0");
            m.setBounds(1070, 10, 90, 90);
            m.setBackground(new Color(38, 39, 42));
            m.setForeground(Color.GRAY);
            m.setFont(new Font("Arial", Font.BOLD, 32));
            m.addActionListener(new mListener());

            n = new JButton("0");
            n.setBounds(1160, 10, 90, 90);
            n.setBackground(new Color(38, 39, 42));
            n.setForeground(Color.GRAY);
            n.setFont(new Font("Arial", Font.BOLD, 32));
            n.addActionListener(new nListener());

            o = new JButton("0");
            o.setBounds(1250, 10, 90, 90);
            o.setBackground(new Color(38, 39, 42));
            o.setForeground(Color.GRAY);
            o.setFont(new Font("Arial", Font.BOLD, 32));
            o.addActionListener(new oListener());

            p = new JButton("0");
            p.setBounds(1340, 10, 90, 90);
            p.setBackground(new Color(38, 39, 42));
            p.setForeground(Color.GRAY);
            p.setFont(new Font("Arial", Font.BOLD, 32));
            p.addActionListener(new pListener());

        // C L E A R   B U T T O N
            clr = new JButton("CLR");
            clr.setBounds(1430, 10, 90, 90);
            clr.setBackground(Color.RED);
            clr.setForeground(Color.WHITE);
            clr.setFont(new Font("Arial", Font.BOLD, 16));
            clr.addActionListener(new clearListener());



        //DISPLAY OUTPUT
            output = new JTextField();
            output.setBounds(10, 100, 1510, 90);
            output.setHorizontalAlignment(SwingConstants.CENTER);
            output.setBackground(new Color(38, 39, 42));
            output.setForeground(Color.WHITE);
            output.setFont(new Font("Arial", Font.BOLD, 32));
            output.setEditable(false);
            output.setText("Press the buttons to set your bin value - Developed by DeanDEV 2024");

            solution = new JLabel("Solution goes here...");
            solution.setBounds(10, 0, 1500, 500);
            solution.setForeground(Color.GRAY);
            solution.setFont(new Font("Arial", Font.PLAIN, 32));
    
            frame = new JFrame("DeanDEV BIT TO DECIMAL");
            frame.setSize(1530, 500);
            frame.getContentPane().setBackground(new Color(38, 39, 42));
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(a);
            frame.add(b);
            frame.add(c);
            frame.add(d);
            frame.add(e);
            frame.add(f);
            frame.add(g);
            frame.add(h);
            frame.add(i);
            frame.add(j);
            frame.add(k);
            frame.add(l);
            frame.add(m);
            frame.add(n);
            frame.add(o);
            frame.add(p);
            frame.add(clr);
            frame.add(output);
            frame.add(solution);

            //icon = new ImageIcon("src/icon.png");
            icon = new ImageIcon(getClass().getClassLoader().getResource("icon.png"));
            frame.setIconImage(icon.getImage());

}

public class operation {
    public operation(){
        double totalVal = aVal + bVal +cVal + dVal + eVal + fVal + gVal + hVal + iVal + jVal + kVal + lVal + mVal + nVal + oVal + pVal;
        output.setText(String.valueOf(totalVal));
        solution.setText(aVal+ " + " + bVal + " + " + cVal + " + " + dVal + " + " + eVal + " + " + fVal + " + " + gVal + " + " + hVal + " + " + iVal + " + " + jVal + " + " + kVal + " + " + mVal + " + " + nVal + " + " + oVal + " + " + pVal);
    }
}


public class aListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        a.setText("1");
        a.setForeground(Color.RED);
        aVal = 1024;
        new operation();
    }
}

public class bListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        b.setText("1");
        b.setForeground(Color.RED);
        bVal = 512;
        new operation();
    }
}

public class cListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        c.setText("1");
        c.setForeground(Color.RED);
        cVal = 256;
        new operation();
    }
}

public class dListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        d.setText("1");
        d.setForeground(Color.RED);
        dVal = 128;
        new operation();
    }
}

public class eListener implements ActionListener {
    public void actionPerformed(ActionEvent ef){
        e.setText("1");
        e.setForeground(Color.RED);
        eVal = 64;
        new operation();
    }
}

public class fListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        f.setText("1");
        f.setForeground(Color.RED);
        fVal = 32;
        new operation();
    }
}

public class gListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        g.setText("1");
        g.setForeground(Color.RED);
        gVal = 16;
        new operation();
    }
}

public class hListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        h.setText("1");
        h.setForeground(Color.RED);
        hVal = 8;
        new operation();
    }
}


public class iListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        i.setText("1");
        i.setForeground(Color.RED);
        iVal = 4;
        new operation();
    }
}

public class jListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        j.setText("1");
        j.setForeground(Color.RED);
        jVal = 2;
        new operation();
    }
}

public class kListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        k.setText("1");
        k.setForeground(Color.RED);
        kVal = 1;
        new operation();
    }
}

//THERE IS NO L LISTENER SINCE L IS A POINT

public class mListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        m.setText("1");
        m.setForeground(Color.RED);
        mVal = 0.5;
        new operation();
    }
}

public class nListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        n.setText("1");
        n.setForeground(Color.RED);
        nVal = 0.25;
        new operation();
    }
}

public class oListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        o.setText("1");
        o.setForeground(Color.RED);
        oVal = 0.125;
        new operation();
    }
}

public class pListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        p.setText("1");
        p.setForeground(Color.RED);
        pVal = 0.0625;
        new operation();
    }
}

//CLEAR BUTTON ACTION LISTENER
public class clearListener implements ActionListener {
    public void actionPerformed(ActionEvent efg){
    //BOARD CLEAR ALL TEXT
        a.setText("0");
        a.setForeground(Color.GRAY);

        b.setText("0");
        b.setForeground(Color.GRAY);

        c.setText("0");
        c.setForeground(Color.GRAY);

        d.setText("0");
        d.setForeground(Color.GRAY);

        e.setText("0");
        e.setForeground(Color.GRAY);

        f.setText("0");
        f.setForeground(Color.GRAY);

        g.setText("0");
        g.setForeground(Color.GRAY);

        h.setText("0");
        h.setForeground(Color.GRAY);

        i.setText("0");
        i.setForeground(Color.GRAY);

        j.setText("0");
        j.setForeground(Color.GRAY);

        //L IS A POINT

        k.setText("0");
        k.setForeground(Color.GRAY);

        m.setText("0");
        m.setForeground(Color.GRAY);

        n.setText("0");
        n.setForeground(Color.GRAY);

        o.setText("0");
        o.setForeground(Color.GRAY);

        p.setText("0");
        p.setForeground(Color.GRAY);

        output.setText("Press the buttons to set your bin value - Developed by DeanDEV 2024");
        solution.setText("Solution goes here...");
    
    //BOARD CLEAR ALL VALUES
    aVal = 0; bVal = 0; cVal = 0; dVal = 0; eVal = 0; fVal = 0; gVal = 0; hVal = 0; iVal = 0; jVal = 0; kVal = 0; lVal = 0; mVal = 0; nVal = 0; oVal = 0; pVal = 0;
    }
}
    public static void main(String[] args){
        new NumberSystem();

    }
}
