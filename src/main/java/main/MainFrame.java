/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import adapters.AirToTemperatureAdapter;
import devices.AirConditioningDevice;
import mouseAdapters.ComponentResizer;
import contexts.Context;
import variables.TemperatureVariable;
import mouseAdapters.FrameDragListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import sensors.Sensor;
import variables.VolumeVariable;

/**
 *
 * @author cleber
 */
public class MainFrame extends javax.swing.JFrame implements ComponentListener {

    /**
     * Creates new form CreateUniserveFrame
     */
    public MainFrame() {
        initComponents();
        
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        maximized = true;
        
        FrameDragListener frameDragListener = new FrameDragListener(this);
        header_title.addMouseListener(frameDragListener);
        header_title.addMouseMotionListener(frameDragListener);
        
        ComponentResizer componentResizer = new ComponentResizer(new Insets(10, 10, 10, 10), this);
        componentResizer.setSnapSize(new Dimension(15, 15));
        
        menu_bar_file_panel.setVisible(false);
   
        contextPanel = new Context();
        contextPanel.setTitle("Sala");
        contextPanel.setPreferredSize(new Dimension(2048, 768));
        contextPanel.setMinimumSize(new Dimension(2048, 768));
        contextPanel.setColor(Color.white);
        
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 0, 0);
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        
        layeredPanel.add(contextPanel, gridBagConstraints, 1);
        
//        Sensor sensor = new Sensor();
//        
//        sensor.setName("S1");
//        sensor.setRadius(25);
//        sensor.setColor(new Color(255,102, 102));
//        sensor.addComponentListener(contextPanel);
//        
//        gridBagConstraints.insets = new java.awt.Insets(400, 10, 0, 0);
//        contextPanel.add(sensor, gridBagConstraints);
        
        VolumeVariable volume = new VolumeVariable(contextPanel);
        
        gridBagConstraints.insets = new java.awt.Insets(50, 400, 0, 0);
        contextPanel.addBlock(volume, gridBagConstraints);
        
        AirConditioningDevice airConditioning = new AirConditioningDevice(contextPanel);
        
        gridBagConstraints.insets = new java.awt.Insets(200, 100, 0, 0);
        contextPanel.addBlock(airConditioning, gridBagConstraints);
        
        AirToTemperatureAdapter air_to_temp = new AirToTemperatureAdapter(contextPanel);
        
        gridBagConstraints.insets = new java.awt.Insets(200, 600, 0, 0);
        contextPanel.addBlock(air_to_temp, gridBagConstraints);
        
        TemperatureVariable temperature = new TemperatureVariable(contextPanel);
        
        gridBagConstraints.insets = new java.awt.Insets(400, 400, 0, 0);
        contextPanel.addBlock(temperature, gridBagConstraints);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        header_panel = new javax.swing.JPanel();
        header_actions_panel = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        minimize_btn = new javax.swing.JButton();
        maximize_btn = new javax.swing.JButton();
        header_title = new javax.swing.JLabel();
        header_padding_panel = new javax.swing.JPanel();
        menu_bar_panel = new javax.swing.JPanel();
        menu_bar_file_btn = new javax.swing.JButton();
        menu_bar_edit_btn = new javax.swing.JButton();
        layeredPanel = new javax.swing.JLayeredPane();
        menu_bar_file_panel = new javax.swing.JPanel();
        new_btn = new javax.swing.JButton();
        open_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        save_btn = new javax.swing.JButton();
        export_btn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        quit_btn = new javax.swing.JButton();
        gridBackground = new customWidgets.GridBackground();
        footer_panel = new javax.swing.JPanel();
        footer_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(42, 42, 42));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.BorderLayout(0, 1));

        header_panel.setBackground(new java.awt.Color(42, 42, 42));
        header_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 42), 5));
        header_panel.setPreferredSize(new java.awt.Dimension(800, 90));
        header_panel.setLayout(new java.awt.BorderLayout(10, 0));

        header_actions_panel.setBackground(new java.awt.Color(42, 42, 42));
        header_actions_panel.setRequestFocusEnabled(false);
        header_actions_panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        close_btn.setBackground(new java.awt.Color(0, 0, 0));
        close_btn.setFont(new java.awt.Font("Liberation Sans", 1, 11)); // NOI18N
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_btn.png"))); // NOI18N
        close_btn.setToolTipText("");
        close_btn.setBorderPainted(false);
        close_btn.setContentAreaFilled(false);
        close_btn.setFocusPainted(false);
        close_btn.setFocusable(false);
        close_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_btn.setMaximumSize(new java.awt.Dimension(25, 25));
        close_btn.setMinimumSize(new java.awt.Dimension(25, 25));
        close_btn.setPreferredSize(new java.awt.Dimension(30, 25));
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_btnMouseExited(evt);
            }
        });
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        header_actions_panel.add(close_btn);

        minimize_btn.setBackground(new java.awt.Color(0, 0, 0));
        minimize_btn.setFont(new java.awt.Font("Liberation Sans", 1, 11)); // NOI18N
        minimize_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize_btn.png"))); // NOI18N
        minimize_btn.setToolTipText("");
        minimize_btn.setBorderPainted(false);
        minimize_btn.setContentAreaFilled(false);
        minimize_btn.setFocusPainted(false);
        minimize_btn.setFocusable(false);
        minimize_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimize_btn.setMaximumSize(new java.awt.Dimension(25, 25));
        minimize_btn.setMinimumSize(new java.awt.Dimension(25, 25));
        minimize_btn.setPreferredSize(new java.awt.Dimension(30, 25));
        minimize_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_btnMouseExited(evt);
            }
        });
        minimize_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimize_btnActionPerformed(evt);
            }
        });
        header_actions_panel.add(minimize_btn);

        maximize_btn.setBackground(new java.awt.Color(0, 0, 0));
        maximize_btn.setFont(new java.awt.Font("Liberation Sans", 1, 11)); // NOI18N
        maximize_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maximize_btn.png"))); // NOI18N
        maximize_btn.setToolTipText("");
        maximize_btn.setBorderPainted(false);
        maximize_btn.setContentAreaFilled(false);
        maximize_btn.setFocusPainted(false);
        maximize_btn.setFocusable(false);
        maximize_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maximize_btn.setMaximumSize(new java.awt.Dimension(25, 25));
        maximize_btn.setMinimumSize(new java.awt.Dimension(25, 25));
        maximize_btn.setPreferredSize(new java.awt.Dimension(30, 25));
        maximize_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximize_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximize_btnMouseExited(evt);
            }
        });
        maximize_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximize_btnActionPerformed(evt);
            }
        });
        header_actions_panel.add(maximize_btn);

        header_panel.add(header_actions_panel, java.awt.BorderLayout.LINE_START);

        header_title.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header_title.setText("IoTVerse Simulator");
        header_title.setToolTipText("");
        header_title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header_panel.add(header_title, java.awt.BorderLayout.CENTER);

        header_padding_panel.setBackground(new java.awt.Color(42, 42, 42));
        header_padding_panel.setPreferredSize(new java.awt.Dimension(110, 65));
        header_padding_panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));
        header_panel.add(header_padding_panel, java.awt.BorderLayout.LINE_END);

        menu_bar_panel.setBackground(new java.awt.Color(42, 42, 42));
        menu_bar_panel.setPreferredSize(new java.awt.Dimension(1032, 30));
        menu_bar_panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        menu_bar_file_btn.setBackground(new java.awt.Color(42, 42, 42));
        menu_bar_file_btn.setForeground(new java.awt.Color(255, 255, 255));
        menu_bar_file_btn.setText("Arquivo");
        menu_bar_file_btn.setContentAreaFilled(false);
        menu_bar_file_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_bar_file_btnMouseClicked(evt);
            }
        });
        menu_bar_panel.add(menu_bar_file_btn);

        menu_bar_edit_btn.setBackground(new java.awt.Color(42, 42, 42));
        menu_bar_edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        menu_bar_edit_btn.setText("Editar");
        menu_bar_edit_btn.setContentAreaFilled(false);
        menu_bar_edit_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menu_bar_edit_btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        menu_bar_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_bar_edit_btnActionPerformed(evt);
            }
        });
        menu_bar_panel.add(menu_bar_edit_btn);

        header_panel.add(menu_bar_panel, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(header_panel, java.awt.BorderLayout.PAGE_START);

        layeredPanel.setBackground(new java.awt.Color(42, 42, 42));
        layeredPanel.setOpaque(true);
        java.awt.GridBagLayout jLayeredPane1Layout = new java.awt.GridBagLayout();
        jLayeredPane1Layout.columnWidths = new int[] {0};
        jLayeredPane1Layout.rowHeights = new int[] {0};
        jLayeredPane1Layout.columnWeights = new double[] {0.5};
        jLayeredPane1Layout.rowWeights = new double[] {0.5};
        layeredPanel.setLayout(jLayeredPane1Layout);

        menu_bar_file_panel.setBackground(new java.awt.Color(40, 40, 40));
        menu_bar_file_panel.setPreferredSize(new java.awt.Dimension(200, 120));
        menu_bar_file_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_bar_file_panelMouseExited(evt);
            }
        });
        java.awt.GridBagLayout menu_bar_file_panelLayout = new java.awt.GridBagLayout();
        menu_bar_file_panelLayout.columnWeights = new double[] {0.5};
        menu_bar_file_panelLayout.rowWeights = new double[] {0.5};
        menu_bar_file_panel.setLayout(menu_bar_file_panelLayout);

        new_btn.setBackground(new java.awt.Color(40, 40, 40));
        new_btn.setForeground(new java.awt.Color(255, 255, 255));
        new_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_file_white.png"))); // NOI18N
        new_btn.setText("Novo");
        new_btn.setBorderPainted(false);
        new_btn.setContentAreaFilled(false);
        new_btn.setFocusPainted(false);
        new_btn.setFocusable(false);
        new_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        new_btn.setIconTextGap(8);
        new_btn.setMargin(new java.awt.Insets(0, -10, 0, 0));
        new_btn.setOpaque(true);
        new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_btnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        menu_bar_file_panel.add(new_btn, gridBagConstraints);

        open_btn.setBackground(new java.awt.Color(40, 40, 40));
        open_btn.setForeground(new java.awt.Color(255, 255, 255));
        open_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/open_file_white.png"))); // NOI18N
        open_btn.setText("Abrir");
        open_btn.setContentAreaFilled(false);
        open_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        open_btn.setIconTextGap(6);
        open_btn.setMargin(new java.awt.Insets(0, -10, 0, 0));
        open_btn.setOpaque(true);
        open_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                open_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                open_btnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        menu_bar_file_panel.add(open_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        menu_bar_file_panel.add(jSeparator1, gridBagConstraints);

        save_btn.setBackground(new java.awt.Color(40, 40, 40));
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        save_btn.setText("Salvar");
        save_btn.setContentAreaFilled(false);
        save_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        save_btn.setIconTextGap(6);
        save_btn.setMargin(new java.awt.Insets(0, -10, 0, 0));
        save_btn.setOpaque(true);
        save_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                save_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                save_btnMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        menu_bar_file_panel.add(save_btn, gridBagConstraints);

        export_btn.setBackground(new java.awt.Color(40, 40, 40));
        export_btn.setForeground(new java.awt.Color(255, 255, 255));
        export_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/export.png"))); // NOI18N
        export_btn.setText("Exportar");
        export_btn.setContentAreaFilled(false);
        export_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        export_btn.setIconTextGap(6);
        export_btn.setMargin(new java.awt.Insets(0, -10, 0, 0));
        export_btn.setOpaque(true);
        export_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                export_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                export_btnMouseExited(evt);
            }
        });
        export_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        menu_bar_file_panel.add(export_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        menu_bar_file_panel.add(jSeparator2, gridBagConstraints);

        quit_btn.setBackground(new java.awt.Color(40, 40, 40));
        quit_btn.setForeground(new java.awt.Color(255, 255, 255));
        quit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quit.png"))); // NOI18N
        quit_btn.setText("Sair");
        quit_btn.setContentAreaFilled(false);
        quit_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quit_btn.setIconTextGap(6);
        quit_btn.setMargin(new java.awt.Insets(0, -10, 0, 0));
        quit_btn.setOpaque(true);
        quit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quit_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quit_btnMouseExited(evt);
            }
        });
        quit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        menu_bar_file_panel.add(quit_btn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        layeredPanel.add(menu_bar_file_panel, gridBagConstraints);

        gridBackground.setBackground(new java.awt.Color(0, 0, 0));
        gridBackground.setcellSize(50);

        javax.swing.GroupLayout gridBackgroundLayout = new javax.swing.GroupLayout(gridBackground);
        gridBackground.setLayout(gridBackgroundLayout);
        gridBackgroundLayout.setHorizontalGroup(
            gridBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1064, Short.MAX_VALUE)
        );
        gridBackgroundLayout.setVerticalGroup(
            gridBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        layeredPanel.add(gridBackground, gridBagConstraints);

        getContentPane().add(layeredPanel, java.awt.BorderLayout.CENTER);

        footer_panel.setBackground(new java.awt.Color(255, 255, 255));
        footer_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        footer_panel.setPreferredSize(new java.awt.Dimension(800, 40));
        footer_panel.setLayout(new java.awt.BorderLayout(0, 10));

        footer_title.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        footer_title.setForeground(new java.awt.Color(42, 42, 42));
        footer_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer_title.setText("V0.0.1 @ CleberPeter");
        footer_title.setToolTipText("");
        footer_title.setRequestFocusEnabled(false);
        footer_panel.add(footer_title, java.awt.BorderLayout.CENTER);

        getContentPane().add(footer_panel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseEntered
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_btn_focused.png"))); // NOI18N
    }//GEN-LAST:event_close_btnMouseEntered

    private void close_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseExited
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close_btn.png"))); // NOI18N
    }//GEN-LAST:event_close_btnMouseExited

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close_btnActionPerformed

    private void minimize_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btnMouseEntered
        minimize_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize_btn_focused.png"))); // NOI18N
    }//GEN-LAST:event_minimize_btnMouseEntered

    private void minimize_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btnMouseExited
        minimize_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize_btn.png"))); // NOI18N
    }//GEN-LAST:event_minimize_btnMouseExited

    private void minimize_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimize_btnActionPerformed
        setExtendedState(java.awt.Frame.ICONIFIED);
        maximized = false;
    }//GEN-LAST:event_minimize_btnActionPerformed

    private void maximize_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximize_btnMouseEntered
        maximize_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maximize_btn_focused.png")));
    }//GEN-LAST:event_maximize_btnMouseEntered

    private void maximize_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximize_btnMouseExited
        maximize_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maximize_btn.png"))); 
    }//GEN-LAST:event_maximize_btnMouseExited

    private void maximize_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximize_btnActionPerformed
        
        if (!maximized)
        {
            setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            maximized = true;
        }
        else
        {
            setExtendedState(java.awt.Frame.NORMAL);
            maximized = false;
        }
    }//GEN-LAST:event_maximize_btnActionPerformed

    private void menu_bar_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_bar_edit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_bar_edit_btnActionPerformed

    private void menu_bar_file_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bar_file_btnMouseClicked
        menu_bar_file_panel.setVisible(true);
    }//GEN-LAST:event_menu_bar_file_btnMouseClicked

    private void menu_bar_file_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_bar_file_panelMouseExited
        if (!menu_bar_file_panel.contains(evt.getPoint()))
        {
            menu_bar_file_panel.setVisible(false);
        }
    }//GEN-LAST:event_menu_bar_file_panelMouseExited

    private void quit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quit_btnActionPerformed

    private void quit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_btnMouseExited
        quit_btn.setBackground(new Color(40,40,40));
        quit_btn.setForeground(new Color(255,255,255));
        quit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quit.png")));
    }//GEN-LAST:event_quit_btnMouseExited

    private void quit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_btnMouseEntered
        quit_btn.setBackground(new Color(255,214,10));
        quit_btn.setForeground(new Color(0,0,0));
        quit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/quit_black.png"))); // NOI
    }//GEN-LAST:event_quit_btnMouseEntered

    private void export_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_export_btnActionPerformed

    private void export_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_export_btnMouseExited
        export_btn.setBackground(new Color(40,40,40));
        export_btn.setForeground(new Color(255,255,255));
        export_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/export.png")));
    }//GEN-LAST:event_export_btnMouseExited

    private void export_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_export_btnMouseEntered
        export_btn.setBackground(new Color(255,214,10));
        export_btn.setForeground(new Color(0,0,0));
        export_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/export_black.png"))); // NOI
    }//GEN-LAST:event_export_btnMouseEntered

    private void save_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_btnMouseExited
        save_btn.setBackground(new Color(40,40,40));
        save_btn.setForeground(new Color(255,255,255));
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png")));
    }//GEN-LAST:event_save_btnMouseExited

    private void save_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_btnMouseEntered
        save_btn.setBackground(new Color(255,214,10));
        save_btn.setForeground(new Color(0,0,0));
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_black.png"))); // NOI18N
    }//GEN-LAST:event_save_btnMouseEntered

    private void open_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open_btnMouseExited
        open_btn.setBackground(new Color(40,40,40));
        open_btn.setForeground(new Color(255,255,255));
        open_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/open_file_white.png")));
    }//GEN-LAST:event_open_btnMouseExited

    private void open_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open_btnMouseEntered
        open_btn.setBackground(new Color(255,214,10));
        open_btn.setForeground(new Color(0,0,0));
        open_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/open_file_black.png"))); // NOI18N
    }//GEN-LAST:event_open_btnMouseEntered

    private void new_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_btnMouseExited
        new_btn.setBackground(new Color(40,40,40));
        new_btn.setForeground(new Color(255,255,255));
        new_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_file_white.png")));
    }//GEN-LAST:event_new_btnMouseExited

    private void new_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_btnMouseEntered
        new_btn.setBackground(new Color(255,214,10));
        new_btn.setForeground(new Color(0,0,0));
        new_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_file_black.png"))); // NOI18N
    }//GEN-LAST:event_new_btnMouseEntered

    private void main_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_panelMouseClicked
        menu_bar_file_panel.setVisible(false);
    }//GEN-LAST:event_main_panelMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_btn;
    private javax.swing.JButton export_btn;
    private javax.swing.JPanel footer_panel;
    private javax.swing.JLabel footer_title;
    private customWidgets.GridBackground gridBackground;
    private javax.swing.JPanel header_actions_panel;
    private javax.swing.JPanel header_padding_panel;
    private javax.swing.JPanel header_panel;
    private javax.swing.JLabel header_title;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLayeredPane layeredPanel;
    private javax.swing.JButton maximize_btn;
    private javax.swing.JButton menu_bar_edit_btn;
    private javax.swing.JButton menu_bar_file_btn;
    private javax.swing.JPanel menu_bar_file_panel;
    private javax.swing.JPanel menu_bar_panel;
    private javax.swing.JButton minimize_btn;
    private javax.swing.JButton new_btn;
    private javax.swing.JButton open_btn;
    private javax.swing.JButton quit_btn;
    private javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void componentResized(ComponentEvent ce) {
//        System.out.println("main.MainFrame.componentResized()");
    }

    @Override
    public void componentMoved(ComponentEvent ce) {
        
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        
        gridBagConstraints.insets = new Insets(ce.getComponent().getY(), ce.getComponent().getX(), 0, 0);
        
        GridBagLayout layout = (GridBagLayout) layeredPanel.getLayout();
        layout.setConstraints(ce.getComponent(), gridBagConstraints);
    }

    @Override
    public void componentShown(ComponentEvent ce) {
        System.out.println("Src.MainFrame.componentShown()");
    }

    @Override
    public void componentHidden(ComponentEvent ce) {
        System.out.println("Src.MainFrame.componentHidden()");
    }
    
    private Boolean maximized;
    private GridBagLayout layeredPanelLayout;
    private Context contextPanel;
}
