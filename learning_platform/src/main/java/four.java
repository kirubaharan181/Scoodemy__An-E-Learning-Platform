import javax.swing.*;

public class four extends JFrame {

    public four() {
        initComponents();
    }

    private void initComponents() {
        jPanel5 = new JPanel();
        jLabel4 = new JLabel();
        jPanel6 = new JPanel();
        jLabel2 = new JLabel();
        jPanel7 = new JPanel();
        jLabel1 = new JLabel();
        jPanel4 = new JPanel();
        jLabel3 = new JLabel();
        jToggleButton2 = new JToggleButton("EXIT");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(2, 2)); // Adjusts layout for a 2x2 grid

        // Teacher Panel
        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setIcon(new ImageIcon(getClass().getResource("C:/Users/kirubaharan/Downloads/happy-teacher-day-background-with-male-teacher-cartoon-illustration-empty-space-chalkboard_742418-27499.png")));
        jLabel4.setText("TEACHER");
        jPanel5.add(jLabel4);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openTeacherLogin();
            }
        });

        // Admin Panel
        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("C:/Users/kirubaharan/Downloads/l3.png")));
        jLabel2.setText("ADMIN");
        jPanel6.add(jLabel2);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openAdminLogin();
            }
        });

        // Student Panel
        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("C:/Users/kirubaharan/Downloads/boy-cartoon-character-surrounded-by-technology_23-2150964573.png")));
        jLabel1.setText("STUDENT");
        jPanel7.add(jLabel1);
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openStudentLogin();
            }
        });

        // Parent Panel
        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("C:/Users/kirubaharan/Downloads/parents.png")));
        jLabel3.setText("PARENT");
        jPanel4.add(jLabel3);
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openParentLogin();
            }
        });

        // Exit Button
        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jToggleButton2.addActionListener(evt -> exitApplication());

        // Add panels to frame
        add(jPanel5);
        add(jPanel6);
        add(jPanel7);
        add(jPanel4);
        add(jToggleButton2);

        pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void openTeacherLogin() {
        teacher_login tl = new teacher_login();
        tl.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tl.setVisible(true);
    }

    private void openAdminLogin() {
        admin_login al = new admin_login();
        al.setExtendedState(JFrame.MAXIMIZED_BOTH);
        al.setVisible(true);
    }

    private void openStudentLogin() {
        student_login sl = new student_login();
        sl.setExtendedState(JFrame.MAXIMIZED_BOTH);
        sl.setVisible(true);
    }

    private void openParentLogin() {
        parent_login pl = new parent_login();
        pl.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pl.setVisible(true);
    }

    private void exitApplication() {
        int confirm = JOptionPane.showConfirmDialog(null, "Do you really want to exit the application?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            four f = new four();
            f.setVisible(true);
        });
    }

    private JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    private JPanel jPanel4, jPanel5, jPanel6, jPanel7;
    private JToggleButton jToggleButton2;
}
