
package Gimnasio;


public class FrmMantenimiento extends javax.swing.JFrame {

    
    public FrmMantenimiento() {      
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMantClientes = new javax.swing.JButton();
        btnMantServicios = new javax.swing.JButton();
        btnMantInstructores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Modulo de Mantenimiento");

        btnMantClientes.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnMantClientes.setText("Mantenimiento de Clientes");
        btnMantClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantClientesActionPerformed(evt);
            }
        });

        btnMantServicios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnMantServicios.setText("Mantenimiento de Servicios");
        btnMantServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantServiciosActionPerformed(evt);
            }
        });

        btnMantInstructores.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnMantInstructores.setText("Mantenimiento de Instructores");
        btnMantInstructores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantInstructoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMantClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMantServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMantInstructores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(btnMantClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMantServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMantInstructores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMantClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantClientesActionPerformed
        FrmOpcionesCRUD frmMantenimientoClientes = new FrmOpcionesCRUD(1);
        frmMantenimientoClientes.setVisible(true);
    }//GEN-LAST:event_btnMantClientesActionPerformed

    private void btnMantServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantServiciosActionPerformed
        FrmOpcionesCRUD frmMantenimientoServicios = new FrmOpcionesCRUD(2);
        frmMantenimientoServicios.setVisible(true);
    }//GEN-LAST:event_btnMantServiciosActionPerformed

    private void btnMantInstructoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantInstructoresActionPerformed
        FrmOpcionesCRUD frmMantenimientoInstructores = new FrmOpcionesCRUD(3);
        frmMantenimientoInstructores.setVisible(true);
    }//GEN-LAST:event_btnMantInstructoresActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMantClientes;
    private javax.swing.JButton btnMantInstructores;
    private javax.swing.JButton btnMantServicios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
