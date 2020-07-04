package views;
import java.awt.*;
import java.awt.event.AWTEventListener.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.*;
import algo.*;
import game.Themes;
import java.util.Arrays;
public class Board extends JFrame {

    public static int N=4;
    public int count=0;
    public int moves=0;
    public Themes th = new Themes("None",Color.BLACK,Color.WHITE,"/img/q.png");
    private JPanel gui = new JPanel(new BorderLayout(6,6));
    private int[][] isSet = new int[N][N];
    private JButton[][] squares = new JButton[N][N];
    private JPanel board;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenuItem jMenuItem21;
    private JMenuItem jMenuItem22;
    private JMenuItem jMenuItem23;
    private JMenuItem jMenuItem24;
    private JMenuItem jMenuItem25;
    private JMenuItem jMenuItem26;
    private JMenuItem jMenuItem27;
    private JMenuItem jMenuItem31;
    private JMenuItem jMenuItem32;
    private JMenuItem jMenuItem33;
    private JMenuItem jMenuItem34;
    private JMenuItem jMenuItem35;
    private JMenuItem jMenuItem36;
    private JMenuItem jMenuItem37;
    private JMenuItem jMenuItem61;
    private JMenuItem jMenuItem62;
    private JMenuBar jMenuBar1;
    
    public Board() {
        super("N queen game-BOARD");
        initializeGUI();        
//        initComponents();
    }
    
    public Board(int n)
    {
        super("N queen Game-BOARD");
        setN(n);
        initializeGUI();
    }
    
    public Board(int n,Themes t)
    {
        super("N queen Game-BOARD");
        th = new Themes(t.getTitle(),t.getColor1(),t.getColor2(),t.getQueenColor());
        setN(n);
        initializeGUI();
    }
   
    private final void initializeGUI()
    {
        //super("N queen game");
        gui = (JPanel)getContentPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new JMenu("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu2 = new JMenu("Level");
        jMenu3 = new JMenu("Theme");
        jMenu4 = new JMenu("ScoreBoard");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu5 = new JMenu("Help");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu6 = new JMenu("Game");
        jMenuItem21 = new JMenuItem("Level 1");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenuItem22 = new JMenuItem("Level 2");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenuItem23 = new JMenuItem("Level 3");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenuItem24 = new JMenuItem("Level 4");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenuItem25 = new JMenuItem("Level 5");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenuItem26 = new JMenuItem("Level 6");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenuItem27 = new JMenuItem("Level 7");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenuItem31 = new JMenuItem("None");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenuItem32 = new JMenuItem("PINK BLUSH");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenuItem33 = new JMenuItem("BLUE DROPS");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenuItem34 = new JMenuItem("SUMMER SMILES");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenuItem35 = new JMenuItem("LILAC LOVE");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenuItem36 = new JMenuItem("WOOD LAND");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenuItem37 = new JMenuItem("PLUM POSSE");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenuItem61 = new JMenuItem("Reset");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenuItem62 = new JMenuItem("Submit");
        jMenuItem62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem62ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem21);
        jMenu2.add(jMenuItem22);
        jMenu2.add(jMenuItem23);
        jMenu2.add(jMenuItem24);
        jMenu2.add(jMenuItem25);
        jMenu2.add(jMenuItem26);
        jMenu2.add(jMenuItem27);
        jMenu3.add(jMenuItem31);
        jMenu3.add(jMenuItem32);
        jMenu3.add(jMenuItem33);
        jMenu3.add(jMenuItem34);
        jMenu3.add(jMenuItem35);
        jMenu3.add(jMenuItem36);
        jMenu3.add(jMenuItem37);
        jMenu6.add(jMenuItem61);
        jMenu6.add(jMenuItem62);
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu6);
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);
    //    jMenuBar1.add(jMenu4);
        jMenuBar1.add(jMenu5);
        setJMenuBar(jMenuBar1);
        gui.setBorder(new EmptyBorder(20,160,50,160));
        board = new JPanel(new GridLayout(N,N));
        board.setBorder(new EmptyBorder(0,3,0,3));
        gui.setBackground(Color.GRAY);
        gui.add(board);
        //Insets buttonMargin = new Insets(0,0,0,0);
        //JLabel jl = new JLabel("Namrata Krishna");
        //gui.add(jl);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                isSet[i][j] = 0;
            }
        }
        ButtonHandler buttonHandler = new ButtonHandler();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                squares[i][j] = new JButton();
                if((i+j)%2 != 0)
                    squares[i][j].setBackground(th.getColor1());
                else
                    squares[i][j].setBackground(th.getColor2());
                board.add(squares[i][j]);
                squares[i][j].addActionListener(buttonHandler);
            }
        }
        
//        squares[row][col].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q.png")));
        setSize(1000,740);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Home h = new Home();
        this.dispose();
        h.setVisible(true);
    }
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Score sb = new Score();
        this.dispose();
        sb.setVisible(true);
    }    
    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Help h = new Help();
        this.dispose();
        h.setVisible(true);
    }
    private void jMenuItem21ActionPerformed(ActionEvent evt) {
        setN(4);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem22ActionPerformed(ActionEvent evt) {
        setN(5);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem23ActionPerformed(ActionEvent evt) {
        setN(6);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem24ActionPerformed(ActionEvent evt) {
        setN(7);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem25ActionPerformed(ActionEvent evt) {
        setN(8);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem26ActionPerformed(ActionEvent evt) {
        setN(9);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem27ActionPerformed(ActionEvent evt) {
        setN(10);
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem31ActionPerformed(ActionEvent evt) {
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem32ActionPerformed(ActionEvent evt) {
        Themes t = new Themes("PINK BLUSH",Color.PINK,Color.WHITE,"/img/purpleq.png");
        Board b = new Board(N,t);
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem33ActionPerformed(ActionEvent evt) {
        Color c = new Color(0,204,255);
        Themes t = new Themes("BLUE DROPS",c,Color.WHITE,"/img/blueq.png");
        Board b = new Board(N,t);
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem34ActionPerformed(ActionEvent evt) {
        Color y = new Color(255,255,100);
        Color o = new Color(255,153,51);
        Themes t = new Themes("SUMMER SMILES",y,o,"/img/redq.png");
        Board b = new Board(N,t);
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem35ActionPerformed(ActionEvent evt) {
        Color p = new Color(153,0,204);
        Themes t = new Themes("LILAC LOVE",p,Color.WHITE,"/img/greenq.png");
        Board b = new Board(N,t);
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem36ActionPerformed(ActionEvent evt) {
        Color y = new Color(77,38,0);
        Color o = new Color(255,255,255);
        Themes t = new Themes("WOOD LAND",y,o,"/img/yellowq.png");
        Board b = new Board(N,t);
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem37ActionPerformed(ActionEvent evt) {
        Color purple = new Color(115,0,230);
        Color pink = new Color(255,179,255);
        Themes t = new Themes("PLUM POSSE",purple,pink,"/img/blackq.png");
        Board b = new Board(N,t);
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem61ActionPerformed(ActionEvent evt) {
        Board b = new Board();
        this.dispose();
        b.setVisible(true);
    }
    private void jMenuItem62ActionPerformed(ActionEvent evt) {
        if(processClick()){
            Integer i = new Integer(moves);
            Score s = new Score(i.toString(),"CONGRATS!! YOU WON AND YOUR MOVES: ",N);
            N++;
            this.dispose();
            s.setVisible(true);
        }
        else{
            Integer i = new Integer(moves);
            Score s = new Score(i.toString(),"YOU LOSE!! TRY AGAIN AND YOUR MOVES: ",N);
            this.dispose();
            s.setVisible(true);
        }
    }    
    public static void setN(int n){
        N = n;
    }
    public static int getN(){
        return N;
    }
    /*private boolean isValidMove(int i,int j){
        int rowDelta = Math.abs(i-row);
        int colDelta = Math.abs(j-col);
        if((rowDelta == 1) && (colDelta == 2))
            return true;
        if((colDelta == 1) && (rowDelta == 2))
            return true;
        return false;
    }*/
    
    private boolean processClick()
    {
        NQ nqueen = new NQ();
        if(nqueen.solveNQ(isSet,N)){
            return true;
        }
        //squares[row][col].setIcon(null);
        //squares[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/q.png")));
        //row = i;
        //col = j;
        return false;
    }
    
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(source == squares[i][j]){
                        if(isSet[i][j] == 1){
                            isSet[i][j] = 0;
                            squares[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                            count--;
                        }else{
                            if(count < N){
                                isSet[i][j] = 1;
                                squares[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource(th.getQueenColor())));                    
                                count++;
                            }
                        }
                        moves++;
                        //processClick(i,j);
                        return;
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
    }// </editor-fold>//GEN-END:initComponents

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
                //new Board().setVisible(true);
               Login l = new Login();
               l.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}