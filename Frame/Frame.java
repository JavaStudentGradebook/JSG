/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Chynna
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FordhamGradebook = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        ArchivedClass = new javax.swing.JButton();
        AddClass = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        ChooseAClass = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Gradebook = new javax.swing.JPanel();
        AddAssignment = new javax.swing.JButton();
        AddStudent = new javax.swing.JButton();
        GradebookScrollPane = new javax.swing.JScrollPane();
        ClassTable = new javax.swing.JTable();
        Attendance = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Statistics = new javax.swing.JPanel();
        ManageClass = new javax.swing.JPanel();
        ManageGradingSchemes = new javax.swing.JButton();
        DropClass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ArchivedClass.setText("Archived Classes");

        AddClass.setText("Add A Class");
        AddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassActionPerformed(evt);
            }
        });

        LogOut.setText("Log Out");

        ChooseAClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS1", "CS2", "Software Engineering" }));
        ChooseAClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseAClassActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose A Class:");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArchivedClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChooseAClass, 0, 291, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(143, 143, 143)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(AddClass, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addGap(168, 168, 168))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChooseAClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArchivedClass, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(168, 168, 168))
        );

        FordhamGradebook.addTab("Home", Home);

        AddAssignment.setText("Add Assignment");
        AddAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAssignmentActionPerformed(evt);
            }
        });

        AddStudent.setText("Add Student");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });

        ClassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Name", "Quiz1", "Homework1", "Lab1"
            }
        ));
        ClassTable.setRowHeight(40);
        GradebookScrollPane.setViewportView(ClassTable);

        javax.swing.GroupLayout GradebookLayout = new javax.swing.GroupLayout(Gradebook);
        Gradebook.setLayout(GradebookLayout);
        GradebookLayout.setHorizontalGroup(
            GradebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradebookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GradebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GradebookLayout.createSequentialGroup()
                        .addComponent(AddAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GradebookLayout.createSequentialGroup()
                        .addComponent(GradebookScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );
        GradebookLayout.setVerticalGroup(
            GradebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradebookLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(GradebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GradebookScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        FordhamGradebook.addTab("Gradebook", Gradebook);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Days Missed"
            }
        ));
        jTable1.setRowHeight(50);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout AttendanceLayout = new javax.swing.GroupLayout(Attendance);
        Attendance.setLayout(AttendanceLayout);
        AttendanceLayout.setHorizontalGroup(
            AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        AttendanceLayout.setVerticalGroup(
            AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );

        FordhamGradebook.addTab("Attendance", Attendance);

        javax.swing.GroupLayout StatisticsLayout = new javax.swing.GroupLayout(Statistics);
        Statistics.setLayout(StatisticsLayout);
        StatisticsLayout.setHorizontalGroup(
            StatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
        );
        StatisticsLayout.setVerticalGroup(
            StatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        FordhamGradebook.addTab("Statistics", Statistics);

        ManageGradingSchemes.setText("Manage Grading Schemes");
        ManageGradingSchemes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGradingSchemesActionPerformed(evt);
            }
        });

        DropClass.setText("Drop Class");
        DropClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageClassLayout = new javax.swing.GroupLayout(ManageClass);
        ManageClass.setLayout(ManageClassLayout);
        ManageClassLayout.setHorizontalGroup(
            ManageClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageClassLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(ManageGradingSchemes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(DropClass, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );
        ManageClassLayout.setVerticalGroup(
            ManageClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageClassLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(ManageClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageGradingSchemes, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DropClass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        FordhamGradebook.addTab("Manage Class", ManageClass);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FordhamGradebook, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FordhamGradebook)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassActionPerformed
        AddClassFrame newClass = new AddClassFrame();
        newClass.setVisible(true);
    }//GEN-LAST:event_AddClassActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        AddStudentDialog newStudent = new AddStudentDialog(this, false);
        newStudent.setVisible(true);
        
        DefaultTableModel model = (DefaultTableModel) ClassTable.getModel();
        model.addRow(new Object[]{});
        model.setValueAt(newStudent.getFirstNameField(), ClassTable.getSelectedRow(), 0);
    }//GEN-LAST:event_AddStudentActionPerformed

    private void ChooseAClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseAClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseAClassActionPerformed

    private void ManageGradingSchemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGradingSchemesActionPerformed
        GradingSchemeFrame newGradingScheme = new GradingSchemeFrame();
        newGradingScheme.setVisible(true);
    }//GEN-LAST:event_ManageGradingSchemesActionPerformed

    private void AddAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAssignmentActionPerformed
           DefaultTableModel model = (DefaultTableModel) ClassTable.getModel();
           model.addColumn("Quiz3");
           AddAssignmentFrame newAssignment = new AddAssignmentFrame();
           newAssignment.setVisible(true);
    }//GEN-LAST:event_AddAssignmentActionPerformed

    private void DropClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropClassActionPerformed
        DropClass dropClass = new DropClass(this, false);
        dropClass.setVisible(true);
    }//GEN-LAST:event_DropClassActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAssignment;
    private javax.swing.JButton AddClass;
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton ArchivedClass;
    private javax.swing.JPanel Attendance;
    private javax.swing.JComboBox<String> ChooseAClass;
    private javax.swing.JTable ClassTable;
    private javax.swing.JButton DropClass;
    private javax.swing.JTabbedPane FordhamGradebook;
    private javax.swing.JPanel Gradebook;
    private javax.swing.JScrollPane GradebookScrollPane;
    private javax.swing.JPanel Home;
    private javax.swing.JButton LogOut;
    private javax.swing.JPanel ManageClass;
    private javax.swing.JButton ManageGradingSchemes;
    private javax.swing.JPanel Statistics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
