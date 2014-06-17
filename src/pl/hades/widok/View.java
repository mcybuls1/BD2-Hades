/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.hades.widok;

import pl.hades.baza.Zlecenie;
import java.util.ArrayList;

/**
 *
 * @author Mikolaj Cybulski
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        zlecenia = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents()//GEN-BEGIN:initComponents
    {

        noweDialog = new javax.swing.JDialog();
        lewyNowePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        prawyNowePanel = new javax.swing.JPanel();
        imieZlecField = new javax.swing.JTextField();
        nazwZlecField = new javax.swing.JTextField();
        wiezField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        imieZmarField = new javax.swing.JTextField();
        nazwZmarField = new javax.swing.JTextField();
        dataUrodzZmarField = new javax.swing.JTextField();
        dataZgonuZmarField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        wyznanieZmarField = new javax.swing.JTextField();
        sposobPochowkuField = new javax.swing.JTextField();
        firmaCombo = new javax.swing.JComboBox();
        cmentarzCombo = new javax.swing.JComboBox();
        miejsceStypyCombo = new javax.swing.JComboBox();
        dataStypogrzebuField = new javax.swing.JTextField();
        wprowadzZlecenieButton = new javax.swing.JButton();
        wprowadzDialog = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        karawanPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        markaKarawanTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        modelKarawanTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nrrejestracyjnyKarawanTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        romiarPakiKarawanTextField = new javax.swing.JTextField();
        wprowadzKarawanButton = new javax.swing.JButton();
        miejscePanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        ulicaMiejsceTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        miastoMiejsceTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        nrBudynkuMiejsceTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nrMieszkaniaMiejsceTextField = new javax.swing.JTextField();
        wprowadzMiejsceButton = new javax.swing.JButton();
        firmaPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        nazwaFirmaTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        nrKontaFirmaTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        nipFirmaTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        uslugaFirmaTextField = new javax.swing.JTextField();
        wprowadzFirmeButton = new javax.swing.JButton();
        przegladajDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        zleceniaMenu = new javax.swing.JMenu();
        noweItem = new javax.swing.JMenuItem();
        przegladajItem = new javax.swing.JMenuItem();
        inneMenu = new javax.swing.JMenu();
        wprowadzItem = new javax.swing.JMenuItem();

        noweDialog.setTitle("Nowe Zlecenie");
        noweDialog.setMinimumSize(new java.awt.Dimension(488, 608));

        lewyNowePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Imię zleceniodawcy:");

        jLabel2.setText("Nazwisko zleceniodawcy:");

        jLabel3.setText("Więź:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(19, 65, 201));
        jLabel4.setText("Dane zmarłego:");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(null);

        jLabel5.setText("Imię:");

        jLabel6.setText("Nazwisko:");

        jLabel7.setText("Data urodzenia:");

        jLabel8.setText("Data zgonu:");

        jLabel9.setText("Wyznanie:");

        jLabel10.setText("Sposób pochowku:");

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(19, 65, 201));
        jLabel11.setText("Pochówek i Stypa:");

        jLabel12.setText("Firma:");

        jLabel13.setText("Cmentarz:");

        jLabel14.setText("Miejsce stypy:");

        jLabel15.setText("Data Stypo-pogrzebu:");

        javax.swing.GroupLayout lewyNowePanelLayout = new javax.swing.GroupLayout(lewyNowePanel);
        lewyNowePanel.setLayout(lewyNowePanelLayout);
        lewyNowePanelLayout.setHorizontalGroup(
            lewyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(lewyNowePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lewyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lewyNowePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lewyNowePanelLayout.createSequentialGroup()
                        .addGroup(lewyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        lewyNowePanelLayout.setVerticalGroup(
            lewyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lewyNowePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        prawyNowePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        firmaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmentarzCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        miejsceStypyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        wprowadzZlecenieButton.setText("Wprowadź");

        javax.swing.GroupLayout prawyNowePanelLayout = new javax.swing.GroupLayout(prawyNowePanel);
        prawyNowePanel.setLayout(prawyNowePanelLayout);
        prawyNowePanelLayout.setHorizontalGroup(
            prawyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(prawyNowePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prawyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataStypogrzebuField, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(miejsceStypyCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmentarzCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firmaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sposobPochowkuField)
                    .addComponent(wyznanieZmarField)
                    .addComponent(imieZmarField)
                    .addComponent(nazwZlecField)
                    .addComponent(imieZlecField)
                    .addComponent(wiezField)
                    .addComponent(nazwZmarField)
                    .addComponent(dataUrodzZmarField)
                    .addComponent(dataZgonuZmarField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prawyNowePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(wprowadzZlecenieButton)))
                .addContainerGap())
        );
        prawyNowePanelLayout.setVerticalGroup(
            prawyNowePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prawyNowePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imieZlecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nazwZlecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wiezField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(imieZmarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nazwZmarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataUrodzZmarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataZgonuZmarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wyznanieZmarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sposobPochowkuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(firmaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmentarzCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miejsceStypyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataStypogrzebuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wprowadzZlecenieButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout noweDialogLayout = new javax.swing.GroupLayout(noweDialog.getContentPane());
        noweDialog.getContentPane().setLayout(noweDialogLayout);
        noweDialogLayout.setHorizontalGroup(
            noweDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noweDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lewyNowePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prawyNowePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        noweDialogLayout.setVerticalGroup(
            noweDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noweDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(noweDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prawyNowePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lewyNowePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        wprowadzDialog.setTitle("Inne: Wprowadź");
        wprowadzDialog.setMinimumSize(new java.awt.Dimension(400, 354));

        jLabel17.setText("Marka");

        jLabel18.setText("Model:");

        jLabel19.setText("Nr rejestracyjny:");

        jLabel20.setText("Rozmiar paki:");

        wprowadzKarawanButton.setText("Wprowadź Dane");

        javax.swing.GroupLayout karawanPanelLayout = new javax.swing.GroupLayout(karawanPanel);
        karawanPanel.setLayout(karawanPanelLayout);
        karawanPanelLayout.setHorizontalGroup(
            karawanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(karawanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(karawanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markaKarawanTextField)
                    .addComponent(modelKarawanTextField)
                    .addComponent(nrrejestracyjnyKarawanTextField)
                    .addComponent(romiarPakiKarawanTextField)
                    .addGroup(karawanPanelLayout.createSequentialGroup()
                        .addGroup(karawanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, karawanPanelLayout.createSequentialGroup()
                        .addGap(0, 225, Short.MAX_VALUE)
                        .addComponent(wprowadzKarawanButton)))
                .addContainerGap())
        );
        karawanPanelLayout.setVerticalGroup(
            karawanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(karawanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(markaKarawanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelKarawanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrrejestracyjnyKarawanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(romiarPakiKarawanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(wprowadzKarawanButton)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Karawan", karawanPanel);

        jLabel21.setText("Ulica:");

        jLabel22.setText("Miasto:");

        jLabel23.setText("Nr budynku:");

        jLabel24.setText("Nr mieszkania:");

        wprowadzMiejsceButton.setText("Wprowadź Dane");

        javax.swing.GroupLayout miejscePanelLayout = new javax.swing.GroupLayout(miejscePanel);
        miejscePanel.setLayout(miejscePanelLayout);
        miejscePanelLayout.setHorizontalGroup(
            miejscePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miejscePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(miejscePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ulicaMiejsceTextField)
                    .addComponent(miastoMiejsceTextField)
                    .addComponent(nrBudynkuMiejsceTextField)
                    .addGroup(miejscePanelLayout.createSequentialGroup()
                        .addGroup(miejscePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nrMieszkaniaMiejsceTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miejscePanelLayout.createSequentialGroup()
                        .addGap(0, 225, Short.MAX_VALUE)
                        .addComponent(wprowadzMiejsceButton)))
                .addContainerGap())
        );
        miejscePanelLayout.setVerticalGroup(
            miejscePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miejscePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ulicaMiejsceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miastoMiejsceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrBudynkuMiejsceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrMieszkaniaMiejsceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(wprowadzMiejsceButton)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Miejsce", miejscePanel);

        jLabel25.setText("Nazwa:");

        jLabel26.setText("Nr konta:");

        jLabel27.setText("NIP:");

        jLabel28.setText("Rodzaj usługi:");

        wprowadzFirmeButton.setText("Wprowadź Dane");

        javax.swing.GroupLayout firmaPanelLayout = new javax.swing.GroupLayout(firmaPanel);
        firmaPanel.setLayout(firmaPanelLayout);
        firmaPanelLayout.setHorizontalGroup(
            firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nazwaFirmaTextField)
                    .addComponent(nrKontaFirmaTextField)
                    .addComponent(nipFirmaTextField)
                    .addGroup(firmaPanelLayout.createSequentialGroup()
                        .addGroup(firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(uslugaFirmaTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firmaPanelLayout.createSequentialGroup()
                        .addGap(0, 225, Short.MAX_VALUE)
                        .addComponent(wprowadzFirmeButton)))
                .addContainerGap())
        );
        firmaPanelLayout.setVerticalGroup(
            firmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firmaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nazwaFirmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrKontaFirmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nipFirmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uslugaFirmaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(wprowadzFirmeButton)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Firma", firmaPanel);

        javax.swing.GroupLayout wprowadzDialogLayout = new javax.swing.GroupLayout(wprowadzDialog.getContentPane());
        wprowadzDialog.getContentPane().setLayout(wprowadzDialogLayout);
        wprowadzDialogLayout.setHorizontalGroup(
            wprowadzDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wprowadzDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        wprowadzDialogLayout.setVerticalGroup(
            wprowadzDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wprowadzDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        przegladajDialog.setTitle("Zlecenia: Przeglądaj");
        przegladajDialog.setMinimumSize(new java.awt.Dimension(400, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout przegladajDialogLayout = new javax.swing.GroupLayout(przegladajDialog.getContentPane());
        przegladajDialog.getContentPane().setLayout(przegladajDialogLayout);
        przegladajDialogLayout.setHorizontalGroup(
            przegladajDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(przegladajDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        przegladajDialogLayout.setVerticalGroup(
            przegladajDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(przegladajDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hades");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pl/hades/widok/hades.png"))); // NOI18N

        zleceniaMenu.setText("Zlecenia");

        noweItem.setText("Nowe");
        noweItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noweItemActionPerformed(evt);
            }
        });
        zleceniaMenu.add(noweItem);

        przegladajItem.setText("Przeglądaj");
        przegladajItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                przegladajItemActionPerformed(evt);
            }
        });
        zleceniaMenu.add(przegladajItem);

        jMenuBar1.add(zleceniaMenu);

        inneMenu.setText("Inne");

        wprowadzItem.setText("Wprowadź");
        wprowadzItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                wprowadzItemActionPerformed(evt);
            }
        });
        inneMenu.add(wprowadzItem);

        jMenuBar1.add(inneMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29)
        );

        pack();
    }//GEN-END:initComponents

    private void noweItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noweItemActionPerformed
        // TODO add your handling code here:
        noweDialog.setVisible(true);
    }//GEN-LAST:event_noweItemActionPerformed

    private void wprowadzItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wprowadzItemActionPerformed
        // TODO add your handling code here:
        wprowadzDialog.setVisible(true);
    }//GEN-LAST:event_wprowadzItemActionPerformed

    private void przegladajItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przegladajItemActionPerformed
        // TODO add your handling code here:
        przegladajDialog.setVisible(true);
    }//GEN-LAST:event_przegladajItemActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
//user variables
    private ArrayList<Zlecenie> zlecenia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmentarzCombo;
    private javax.swing.JTextField dataStypogrzebuField;
    private javax.swing.JTextField dataUrodzZmarField;
    private javax.swing.JTextField dataZgonuZmarField;
    private javax.swing.JComboBox firmaCombo;
    private javax.swing.JPanel firmaPanel;
    private javax.swing.JTextField imieZlecField;
    private javax.swing.JTextField imieZmarField;
    private javax.swing.JMenu inneMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel karawanPanel;
    private javax.swing.JPanel lewyNowePanel;
    private javax.swing.JTextField markaKarawanTextField;
    private javax.swing.JTextField miastoMiejsceTextField;
    private javax.swing.JPanel miejscePanel;
    private javax.swing.JComboBox miejsceStypyCombo;
    private javax.swing.JTextField modelKarawanTextField;
    private javax.swing.JTextField nazwZlecField;
    private javax.swing.JTextField nazwZmarField;
    private javax.swing.JTextField nazwaFirmaTextField;
    private javax.swing.JTextField nipFirmaTextField;
    private javax.swing.JDialog noweDialog;
    private javax.swing.JMenuItem noweItem;
    private javax.swing.JTextField nrBudynkuMiejsceTextField;
    private javax.swing.JTextField nrKontaFirmaTextField;
    private javax.swing.JTextField nrMieszkaniaMiejsceTextField;
    private javax.swing.JTextField nrrejestracyjnyKarawanTextField;
    private javax.swing.JPanel prawyNowePanel;
    private javax.swing.JDialog przegladajDialog;
    private javax.swing.JMenuItem przegladajItem;
    private javax.swing.JTextField romiarPakiKarawanTextField;
    private javax.swing.JTextField sposobPochowkuField;
    private javax.swing.JTextField ulicaMiejsceTextField;
    private javax.swing.JTextField uslugaFirmaTextField;
    private javax.swing.JTextField wiezField;
    private javax.swing.JDialog wprowadzDialog;
    private javax.swing.JButton wprowadzFirmeButton;
    private javax.swing.JMenuItem wprowadzItem;
    private javax.swing.JButton wprowadzKarawanButton;
    private javax.swing.JButton wprowadzMiejsceButton;
    private javax.swing.JButton wprowadzZlecenieButton;
    private javax.swing.JTextField wyznanieZmarField;
    private javax.swing.JMenu zleceniaMenu;
    // End of variables declaration//GEN-END:variables
}