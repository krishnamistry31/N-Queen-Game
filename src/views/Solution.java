package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import algo.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
public class Solution extends JFrame{

    public static int N = 4;
    private JMenuBar jMenuBar1;
    private JMenu jMenu1;
    private JPanel gui = new JPanel(new BorderLayout(6,6));
    private JButton[][] squares; //= new JButton[N][N];
    private JPanel board;
    public Solution() {
        super("N queen game-SOLUTION");
        initializeGUI();        
//        initComponents();
    }
    
    public Solution(int n)
    {
        super("N queen Game-SOLUTION");
        setN(n);
        squares = new JButton[N][N];
        initializeGUI();
    }    
    private final void initializeGUI()
    {
        
        //super("N queen game");
        gui = (JPanel)getContentPane();
        gui.setBorder(new EmptyBorder(20,160,50,160));
        board = new JPanel(new GridLayout(N,N));
        board.setBorder(new EmptyBorder(0,3,0,3));
        gui.setBackground(Color.GRAY);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new JMenu("Back");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);
        gui.add(board);
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                squares[i][j] = new JButton();
                if((i+j)%2 != 0)
                    squares[i][j].setBackground(Color.BLACK);
                else
                    squares[i][j].setBackground(Color.WHITE);
                board.add(squares[i][j]);
            }
        }
        OneSol os = new OneSol();
        int sol[][] = new int[N][N];
        sol = os.solveNQ(N);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(sol[i][j] == 1){
                    squares[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q.png")));                    
                }
            }
        }
        setSize(1000,740);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Score b = new Score(N,"TRY AGAIN");
        this.dispose();
        b.setVisible(true);
    }

    public static void setN(int n){
        N = n;
    }
    public static int getN(){
        return N;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Solution().setVisible(true);
               Login l = new Login();
               l.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    // End of variables declaration                   
}