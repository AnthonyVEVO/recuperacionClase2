
package ec.edu.espoch.calculadora.vista;

import ec.edu.espoch.calculadora.controlador.Controlador;


public class Principal extends javax.swing.JFrame {

    private Controlador objControlador; 
    

    
    
    public Principal() {
        initComponents();
        
        //constructor
       objControlador = new Controlador(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroUno = new javax.swing.JLabel();
        lblNumeroDos = new javax.swing.JLabel();
        btnResult = new javax.swing.JButton();
        txtNumeroUno = new javax.swing.JTextField();
        txtNumeroDos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRespuesta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumeroUno.setText("Numero uno");
        lblNumeroUno.setBorder(new javax.swing.border.MatteBorder(null));

        lblNumeroDos.setText("Numero Dos");
        lblNumeroDos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnResult.setText("R E S U L T A D O");
        btnResult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        txtNumeroUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroUnoActionPerformed(evt);
            }
        });

        txtAreaRespuesta.setColumns(20);
        txtAreaRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtAreaRespuesta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumeroDos)
                            .addComponent(lblNumeroUno))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txtNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnResult)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroUno)
                    .addComponent(txtNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDos)
                    .addComponent(txtNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroUnoActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        // TODO add your handling code here:
        objControlador.prosesoSumar();
    }//GEN-LAST:event_btnResultActionPerformed
    public String getNumeroUno(){
        return txtNumeroUno.getText();   
    
    }
    public String getNumeroDos(){
        return txtNumeroDos.getText();
        
    }
        public void mostrarResultado (int result){
        btnResult.setText(String.valueOf(result));
       
    }
    

        public void respuesta (String msm){
        txtAreaRespuesta.setText(msm);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumeroDos;
    private javax.swing.JLabel lblNumeroUno;
    private javax.swing.JTextArea txtAreaRespuesta;
    private javax.swing.JTextField txtNumeroDos;
    private javax.swing.JTextField txtNumeroUno;
    // End of variables declaration//GEN-END:variables


}
