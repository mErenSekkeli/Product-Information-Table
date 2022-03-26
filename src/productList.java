
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class productList extends javax.swing.JFrame{
    
        public void inject(){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productList().setVisible(true);
            }
        });
    }    
    public productList() {
        initComponents();
        getProductsOnSave();
    }
    
    public void getProductsOnSave(){
        DefaultTableModel model=(DefaultTableModel) urun_tablosu.getModel();
        File file=new File("save.bin");
        if(file.exists()){
        try(Scanner scan=new Scanner(new FileReader("save.bin"))){
           
           int i=0;
           while(scan.hasNextLine()){
               String[] tmp=scan.nextLine().split(",");
               model.addRow(tmp);
           }
           
       }catch (FileNotFoundException ex) { 
         Logger.getLogger(productList.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        }   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        urun_tablosu = new javax.swing.JTable();
        show_btn = new javax.swing.JButton();
        urun_guncelle = new javax.swing.JButton();
        info_message = new javax.swing.JLabel();
        urun_sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tum Urunler");

        urun_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Urun ID", "Urun Ismi", "Kategori", "Fiyat", "Stok Adedi"
            }
        ));
        urun_tablosu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        urun_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urun_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urun_tablosu);

        show_btn.setText("Kapat");
        show_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_btnActionPerformed(evt);
            }
        });

        urun_guncelle.setText("Urun Guncelle");
        urun_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_guncelleActionPerformed(evt);
            }
        });

        info_message.setText(" ");

        urun_sil.setText("Urun Sil");
        urun_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urun_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(show_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(info_message, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(urun_guncelle)
                        .addGap(27, 27, 27)
                        .addComponent(urun_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(info_message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(show_btn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urun_guncelle)
                    .addComponent(urun_sil))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void show_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_btnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_show_btnActionPerformed

    private void urun_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urun_tablosuMouseClicked

    }//GEN-LAST:event_urun_tablosuMouseClicked

    private void urun_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_guncelleActionPerformed
        int row=urun_tablosu.getSelectedRow();
        if(row!=-1){
         DefaultTableModel model=(DefaultTableModel) urun_tablosu.getModel();
          String[] tmp={model.getValueAt(row, 0).toString(),model.getValueAt(row, 1).toString()
                  ,model.getValueAt(row, 2).toString(),model.getValueAt(row, 3).toString(),model.getValueAt(row, 4).toString()};
          try(Scanner scan=new Scanner(new FileReader("save.bin"));
              Scanner scan2=new Scanner(new FileReader("save.bin"))){
              int i=0;
           while(scan.hasNextLine()){
               String[] tmp2=scan.nextLine().split(",");
               i++;
           }
           String[] pr_arr=new String[i];
              for (int j = 0; j < i; j++) {
                  pr_arr[j]=scan2.nextLine();
                  String[] tmp3=pr_arr[j].split(",");
                  if(tmp3[0].equals(tmp[0])){
                      String tmp4=tmp[0]+",";
                      tmp4+=tmp[1]+",";
                      tmp4+=tmp[2]+",";
                      tmp4+=tmp[3]+",";
                      tmp4+=tmp[4];
                      pr_arr[j]=tmp4;
                  }
              }

         try(FileWriter fileOut=new FileWriter("save.bin")){

             for(String s : pr_arr){
                 fileOut.write(s+"\n");//burasi onemli eger bosluk koyulmazsa yazdirma yapmaz
             }
             info_message.setForeground(new Color(0,100,0));
             info_message.setText(tmp[0]+" ID'li Urun Guncellendi");
        } catch (IOException ex) {
            Logger.getLogger(projectOfStock.class.getName()).log(Level.SEVERE, null, ex);
        }       
       }catch (FileNotFoundException ex) { 
         Logger.getLogger(productList.class.getName()).log(Level.SEVERE, null, ex);
         }
          
        }else{
            JOptionPane.showMessageDialog(this, "Lutfen Guncellenecek Urunu Seciniz!");
        }
        
    }//GEN-LAST:event_urun_guncelleActionPerformed

    private void urun_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urun_silActionPerformed
        
        int row=urun_tablosu.getSelectedRow();
        if(row!=-1){
            DefaultTableModel model=(DefaultTableModel)urun_tablosu.getModel();
            String tmp=model.getValueAt(row, 0).toString();
            try(Scanner scan=new Scanner(new FileReader("save.bin"));
                Scanner scan2=new Scanner(new FileReader("save.bin"))){
                int i=0;
                while(scan.hasNextLine()){
                    String tmp2=scan.nextLine();
                    i++;
                }
                String[] pr_arr=new String[i-1];
                int j=0;
                while(scan2.hasNextLine()) {
                    String[] tmp3=scan2.nextLine().split(",");
                    if(!tmp3[0].equals(tmp)){
                        pr_arr[j]=tmp3[0]+",";
                        pr_arr[j]+=tmp3[1]+",";
                        pr_arr[j]+=tmp3[2]+",";
                        pr_arr[j]+=tmp3[3]+",";
                        pr_arr[j]+=tmp3[4];
                        j++;
                    }                    
                }
                try(FileWriter out=new FileWriter("save.bin")){
                    for(String s : pr_arr){
                    out.write(s+"\n");
                    }                    
                }
                info_message.setForeground(new Color(0,100,0));
                info_message.setText(tmp+" ID'li Urun Silindi.Guncel Tablo Icin Tabloyu Kapatin.");
            } catch (IOException ex) {
                Logger.getLogger(productList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Lutfen Silinecek Olan Urunu Seciniz!");
        }
    }//GEN-LAST:event_urun_silActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info_message;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show_btn;
    private javax.swing.JButton urun_guncelle;
    private javax.swing.JButton urun_sil;
    private javax.swing.JTable urun_tablosu;
    // End of variables declaration//GEN-END:variables
}
