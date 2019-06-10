/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracaballos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author santi
 */
public class Carrera extends Thread {

    private JLabel eti;
    private frmCarreraCaballos p;

    public Carrera(JLabel eti, frmCarreraCaballos p) {

        this.eti = eti;
        this.p = p;

    }

    public void run() {

        int c1 = 0, c2 = 0, c3 = 0, c4=0 , c5=0 , c6=0;
        while (true) {
            try {
                sleep((int) (Math.random() * 1000));
                c1 = p.getlblCaballo1().getLocation().x;
                c2 = p.getlblCaballo2().getLocation().x;
                c3 = p.getlblCaballo3().getLocation().x;
                c4 = p.getlblCaballo1().getLocation().x;
                c5 = p.getlblCaballo2().getLocation().x;
                c6 = p.getlblCaballo3().getLocation().x;
                if (c1 < p.getlblMeta().getLocation().x - 10 && c2 < p.getlblMeta().getLocation().x - 10 && c3 < p.getlblMeta().getLocation().x - 10 && c4 < p.getlblMeta().getLocation().x - 10 && c5< p.getlblMeta().getLocation().x - 10 && c6 < p.getlblMeta().getLocation().x - 10) {
                    eti.setLocation(eti.getLocation().x + 10, eti.getLocation().y);
                    p.repaint();
                } else {
                    break;
                }

            } catch (InterruptedException e) {

            }
            if (eti.getLocation().x >= p.getlblMeta().getLocation().x - 10) {
                if (c1 > c2 && c1 > c3 && c1 > c4 && c1< c5 && c1<c6) {
                    JOptionPane.showMessageDialog(null, "Ganó 1");
                } else if (c2 > c1) {
                    JOptionPane.showMessageDialog(null, "Ganó 2");
                } else if (c3 > c1 && c3 > c2) {
                    JOptionPane.showMessageDialog(null, "Ganó 3");
                }
                else if (c4 > c1 && c4 > c2 && c4< c3) {
                    JOptionPane.showMessageDialog(null, "Ganó 4");
                }
                 else if (c5 > c1 && c5 > c2 && c5< c3 && c5<c4) {
                    JOptionPane.showMessageDialog(null, "Ganó 5");
                }
                 else if (c6 > c1 & c6 > c2 & c6< c3 & c6<c4 & c6<c5) {
                    JOptionPane.showMessageDialog(null, "Ganó 6");
                }
                 else {
                    JOptionPane.showMessageDialog(null, "Empate.");
                }
            }
        }

    }
}
