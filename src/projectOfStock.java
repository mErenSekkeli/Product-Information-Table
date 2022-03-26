
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class projectOfStock extends javax.swing.JFrame {
    
    public projectOfStock() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        urun_ad = new javax.swing.JTextField();
        urun_kategori = new javax.swing.JComboBox<>();
        urun_fiyat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        urun_stok = new javax.swing.JTextField();
        productsList = new javax.swing.JButton();
        addProduct = new javax.swing.JButton();
        error_message = new javax.swing.JLabel();
        error_message.setBackground(Color.RED);
        jLabel5 = new javax.swing.JLabel();
        urun_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Urun Ismi:");

        jLabel2.setText("Kategori:");

        jLabel3.setText("Fiyat:");

        urun_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_adActionPerformed(evt);
            }
        });

        urun_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kategori Seciniz", "Kultur Sanat", "Yemek", "Elektronik", "Kisisel Esya" }));

        jLabel4.setText("Adet: ");

        urun_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_stokActionPerformed(evt);
            }
        });

        productsList.setText("Tum Urunler");
        productsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsListActionPerformed(evt);
            }
        });

        addProduct.setText("Urun Ekle");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        error_message.setForeground(new java.awt.Color(255, 0, 51));
        error_message.setText(" ");

        jLabel5.setText("Urun ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(productsList, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(error_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(urun_ad)
                                    .addComponent(urun_kategori, 0, 160, Short.MAX_VALUE)
                                    .addComponent(urun_fiyat)
                                    .addComponent(urun_stok)
                                    .addComponent(urun_id))))
                        .addGap(18, 18, 18)
                        .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(urun_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(urun_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(urun_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(urun_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addProduct)
                        .addGap(34, 34, 34)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(urun_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(productsList)
                .addGap(18, 18, 18)
                .addComponent(error_message)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void urun_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urun_adActionPerformed

    private void urun_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urun_stokActionPerformed

    private void productsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsListActionPerformed
        directingProducts();
    }//GEN-LAST:event_productsListActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        String pr=""; int check=1;
        File file=new File("save.bin");
        if(file.exists()){
        try(Scanner scan=new Scanner(new FileReader("save.bin"))){
          
            while(scan.hasNextLine()){
                String[] tmp=scan.nextLine().split(",");
                if(tmp[0].equals(urun_id.getText())){
                    check=-1;
                }
            }
            
       }catch (FileNotFoundException ex) { 
         Logger.getLogger(productList.class.getName()).log(Level.SEVERE, null, ex);
         }            
        }
        
        if(check==-1){
            error_message.setForeground(Color.RED);
            error_message.setText("Ayni ID'li Bir Baska Urun Bulunmaktadir!");            
        }else if(urun_id.getText().equals("")){
            error_message.setForeground(Color.RED);
            error_message.setText("Urun ID'si Bos Birakilamaz!");
        }else if(urun_ad.getText().equals("")){
            error_message.setForeground(Color.RED);
            error_message.setText("Urun Ismi Bos Birakilamaz!");
        }else if(urun_kategori.getSelectedIndex()==0){
            error_message.setForeground(Color.RED);
            error_message.setText("Lutfen Bir Kategori Seciniz.");
        }else if(urun_fiyat.getText().equals("")){
            error_message.setForeground(Color.RED);
            error_message.setText("Urunun Fiyati Bos Birakilamaz!");
        }else if(urun_stok.getText().equals("")){
            error_message.setForeground(Color.RED);
            error_message.setText("Stok Miktari Bos Birakilamaz!");
        }
        else{
            pr=urun_id.getText()+",";
            pr+=urun_ad.getText()+",";
            pr+=(String)urun_kategori.getSelectedItem()+",";
            pr+=urun_fiyat.getText()+",";
            pr+=urun_stok.getText()+"\n";
            saveAllProperties(pr);            
        }  
        
    }//GEN-LAST:event_addProductActionPerformed

    public void saveAllProperties(String pr){
        try(FileWriter out=new FileWriter("save.bin",true)){
            out.write(pr);
            error_message.setForeground(new Color(0,100,0));
            error_message.setText("Urun Basariyla Kaydedildi!");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(projectOfStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(projectOfStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void directingProducts(){
        productList prls=new productList();
        prls.inject();
    }
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
            java.util.logging.Logger.getLogger(projectOfStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projectOfStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projectOfStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projectOfStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projectOfStock().setVisible(true);
            }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduct;
    private javax.swing.JLabel error_message;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton productsList;
    private javax.swing.JTextField urun_ad;
    private javax.swing.JTextField urun_fiyat;
    private javax.swing.JTextField urun_id;
    private javax.swing.JComboBox<String> urun_kategori;
    private javax.swing.JTextField urun_stok;
    // End of variables declaration//GEN-END:variables
}
