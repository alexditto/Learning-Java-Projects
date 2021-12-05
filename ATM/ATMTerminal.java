package ATM;

import javax.swing.JFrame;

public class ATMTerminal extends JFrame {
    ATMTerminal(){
        System.out.println("Starting ATM");
        this.add(new ATMEngine());
        this.setTitle("ATM");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


}
