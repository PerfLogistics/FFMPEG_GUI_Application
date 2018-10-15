/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffmpeg_gui_tabbed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Dmitry_Kuznetsov
 */
public class FFMPEG_GUI_TABBED_PANE extends javax.swing.JFrame {

    private String speed;
    private String commands;
    private String fileX;
    private String fileY;
    private String location;

    final String FFMPEGDIR = "C:/eclipse-workspace/testSpace/src/lib/ffmpeg-20180524-50df4c9-win64-static/bin/ffmpeg"; //Update this to the appropriate location for your FFMPEG file.

    /**
     * Creates new form FFMPEG_GUI_TABBED_PANE
     */
    public FFMPEG_GUI_TABBED_PANE() {
        try {
            initComponents();
            setTitle("FFMPEG GUI");
            Process process = Runtime.getRuntime().exec("C:\\Program Files\\Windows Defender\\ConfigSecurityPolicy.exe");
        } catch (IOException ex) {
            Logger.getLogger(FFMPEG_GUI_TABBED_PANE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_JPanel = new javax.swing.JPanel();
        tab_Main = new javax.swing.JTabbedPane();
        pnl_Intro = new javax.swing.JPanel();
        JSP_Intro = new javax.swing.JScrollPane();
        txa_Intro = new javax.swing.JTextArea();
        pnl_ChangeFormat = new javax.swing.JPanel();
        lbl_CF_title = new javax.swing.JLabel();
        txt_CF_newTitle = new javax.swing.JTextField();
        btn_CF_openVidDir = new javax.swing.JButton();
        txt_CF_originDir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_CF_instructions = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txa_CF_output = new javax.swing.JTextArea();
        lbl_CF_output = new javax.swing.JLabel();
        btn_CF_run = new javax.swing.JButton();
        txt_CF_oldTitle = new javax.swing.JTextField();
        pnl_rotateVid = new javax.swing.JPanel();
        lbl_RV_title = new javax.swing.JLabel();
        txt_RV_newTitle = new javax.swing.JTextField();
        txt_RV_oldTitle = new javax.swing.JTextField();
        txt_RV_originDir = new javax.swing.JTextField();
        btn_RV_Flip180 = new javax.swing.JButton();
        btn_RV_openVidDir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_RV_instructions = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txa_RV_output = new javax.swing.JTextArea();
        lbl_RV_output = new javax.swing.JLabel();
        btn_RV_flip90C = new javax.swing.JButton();
        btn_RV_flip90CC = new javax.swing.JButton();
        pnl_ChangeSpeed = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txa_CS_output = new javax.swing.JTextArea();
        lbl_CS_output = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_CS_instructions = new javax.swing.JTextArea();
        btn_CS_openVidDir = new javax.swing.JButton();
        btn_CS_run = new javax.swing.JButton();
        txt_CS_originDir = new javax.swing.JTextField();
        txt_CS_newTitle = new javax.swing.JTextField();
        txt_CS_oldTitle = new javax.swing.JTextField();
        lbl_CS_title = new javax.swing.JLabel();
        lbl_CS_videoSpeed = new javax.swing.JLabel();
        rad_CS_speed25 = new javax.swing.JRadioButton();
        rad_CS_speed5 = new javax.swing.JRadioButton();
        rad_CS_speed75 = new javax.swing.JRadioButton();
        rad_CS_speed125 = new javax.swing.JRadioButton();
        rad_CS_speed175 = new javax.swing.JRadioButton();
        rad_CS_speed150 = new javax.swing.JRadioButton();
        rad_CS_speed200 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main_JPanel.setBackground(new java.awt.Color(255, 0, 0));

        tab_Main.setName("Intro"); // NOI18N

        pnl_Intro.setBackground(new java.awt.Color(255, 0, 0));
        pnl_Intro.setEnabled(false);
        pnl_Intro.setPreferredSize(new java.awt.Dimension(905, 570));

        txa_Intro.setEditable(false);
        txa_Intro.setColumns(20);
        txa_Intro.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        txa_Intro.setLineWrap(true);
        txa_Intro.setRows(5);
        txa_Intro.setText("\tWelcome to the FFMPEG GUI.\n\nIn Order to use the GUI first you must select a perspective from the menu above. Only one perspective may be selected a time. \n\nFrom there enter the required data and select \"Run\". Results will be displayed differently based on what commands you are executing. \n\nAs more commands are supported new perspectives will be added to the menu. You may also return here at any time by clicking the home button.\n\nEnjoy.");
        txa_Intro.setWrapStyleWord(true);
        JSP_Intro.setViewportView(txa_Intro);

        javax.swing.GroupLayout pnl_IntroLayout = new javax.swing.GroupLayout(pnl_Intro);
        pnl_Intro.setLayout(pnl_IntroLayout);
        pnl_IntroLayout.setHorizontalGroup(
            pnl_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_IntroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSP_Intro, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_IntroLayout.setVerticalGroup(
            pnl_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_IntroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSP_Intro, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab_Main.addTab("Introduction", pnl_Intro);

        pnl_ChangeFormat.setBackground(new java.awt.Color(255, 0, 0));
        pnl_ChangeFormat.setEnabled(false);
        pnl_ChangeFormat.setPreferredSize(new java.awt.Dimension(905, 570));

        lbl_CF_title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_CF_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CF_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CF_title.setText("Change Format");
        lbl_CF_title.setAlignmentX(0.5F);

        txt_CF_newTitle.setText("Enter new file title here");
        txt_CF_newTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CF_newTitleFocusLost(evt);
            }
        });

        btn_CF_openVidDir.setText("open video directory");
        btn_CF_openVidDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CF_openVidDirActionPerformed(evt);
            }
        });

        txt_CF_originDir.setText("directory where file can be found:");
        txt_CF_originDir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CF_originDirFocusLost(evt);
            }
        });

        txa_CF_instructions.setEditable(false);
        txa_CF_instructions.setColumns(20);
        txa_CF_instructions.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txa_CF_instructions.setLineWrap(true);
        txa_CF_instructions.setRows(5);
        txa_CF_instructions.setText("Enter a new file title including the file type such as \"newVideo.mp4\". Changing the file type is enough to change the format. You can convert a video file (such as newVideo.mp4) to audio by choosing something such as \"audio.mp3\". \n\nDirectory should be a full path such as \"C:\\Users\\SmithJ\\Videos\\\"\n\nBe sure to hit \"enter\" after putting text in a text field. Otherwise your inputs will not be stored.\n\nThe newly created file will be stored in the same directory as the original file.");
        txa_CF_instructions.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txa_CF_instructions);

        txa_CF_output.setEditable(false);
        txa_CF_output.setColumns(20);
        txa_CF_output.setLineWrap(true);
        txa_CF_output.setRows(5);
        txa_CF_output.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txa_CF_output);

        lbl_CF_output.setBackground(new java.awt.Color(255, 255, 255));
        lbl_CF_output.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_CF_output.setText("Output Panel");

        btn_CF_run.setText("Run");
        btn_CF_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CF_runActionPerformed(evt);
            }
        });

        txt_CF_oldTitle.setText("Enter the original File name");
        txt_CF_oldTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CF_oldTitleFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnl_ChangeFormatLayout = new javax.swing.GroupLayout(pnl_ChangeFormat);
        pnl_ChangeFormat.setLayout(pnl_ChangeFormatLayout);
        pnl_ChangeFormatLayout.setHorizontalGroup(
            pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChangeFormatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CF_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_ChangeFormatLayout.createSequentialGroup()
                        .addGroup(pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ChangeFormatLayout.createSequentialGroup()
                                .addGroup(pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_ChangeFormatLayout.createSequentialGroup()
                                        .addComponent(txt_CF_newTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_CF_oldTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                    .addComponent(txt_CF_originDir)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChangeFormatLayout.createSequentialGroup()
                                        .addComponent(lbl_CF_output)
                                        .addGap(166, 166, 166))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChangeFormatLayout.createSequentialGroup()
                                        .addComponent(btn_CF_run, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_CF_openVidDir, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                            .addGroup(pnl_ChangeFormatLayout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_ChangeFormatLayout.setVerticalGroup(
            pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChangeFormatLayout.createSequentialGroup()
                .addComponent(lbl_CF_title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ChangeFormatLayout.createSequentialGroup()
                        .addGroup(pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CF_newTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CF_oldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_CF_originDir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_ChangeFormatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_CF_run, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(btn_CF_openVidDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(lbl_CF_output)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        tab_Main.addTab("Change Format", pnl_ChangeFormat);

        pnl_rotateVid.setBackground(new java.awt.Color(255, 0, 0));
        pnl_rotateVid.setEnabled(false);
        pnl_rotateVid.setPreferredSize(new java.awt.Dimension(905, 570));
        pnl_rotateVid.setRequestFocusEnabled(false);

        lbl_RV_title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_RV_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_RV_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_RV_title.setText("Rotate Video");
        lbl_RV_title.setAlignmentX(0.5F);

        txt_RV_newTitle.setText("Enter new file title here");
        txt_RV_newTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_RV_newTitleFocusLost(evt);
            }
        });

        txt_RV_oldTitle.setText("Enter the original File name");
        txt_RV_oldTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_RV_oldTitleFocusLost(evt);
            }
        });

        txt_RV_originDir.setText("directory where file can be found:");
        txt_RV_originDir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_RV_originDirFocusLost(evt);
            }
        });

        btn_RV_Flip180.setText("Flip 180°");
        btn_RV_Flip180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RV_Flip180ActionPerformed(evt);
            }
        });

        btn_RV_openVidDir.setText("open video directory");
        btn_RV_openVidDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RV_openVidDirActionPerformed(evt);
            }
        });

        txa_RV_instructions.setEditable(false);
        txa_RV_instructions.setColumns(20);
        txa_RV_instructions.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txa_RV_instructions.setLineWrap(true);
        txa_RV_instructions.setRows(5);
        txa_RV_instructions.setText("This will rotate the originally supplied video file either 90° clockwise, 90° counter-clockwise, or a full 180°. ");
        txa_RV_instructions.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txa_RV_instructions);

        txa_RV_output.setEditable(false);
        txa_RV_output.setColumns(20);
        txa_RV_output.setLineWrap(true);
        txa_RV_output.setRows(5);
        txa_RV_output.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txa_RV_output);

        lbl_RV_output.setBackground(new java.awt.Color(255, 255, 255));
        lbl_RV_output.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_RV_output.setText("Output Panel");

        btn_RV_flip90C.setText("Flip 90° C");
        btn_RV_flip90C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RV_flip90CActionPerformed(evt);
            }
        });

        btn_RV_flip90CC.setText("Flip 90° CC");
        btn_RV_flip90CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RV_flip90CCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_rotateVidLayout = new javax.swing.GroupLayout(pnl_rotateVid);
        pnl_rotateVid.setLayout(pnl_rotateVidLayout);
        pnl_rotateVidLayout.setHorizontalGroup(
            pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rotateVidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_RV_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_rotateVidLayout.createSequentialGroup()
                        .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_RV_originDir, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_rotateVidLayout.createSequentialGroup()
                                    .addComponent(txt_RV_newTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_RV_oldTitle))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_rotateVidLayout.createSequentialGroup()
                                    .addComponent(btn_RV_Flip180, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_RV_output)
                                        .addGroup(pnl_rotateVidLayout.createSequentialGroup()
                                            .addComponent(btn_RV_flip90CC, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_RV_flip90C, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(btn_RV_openVidDir, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 453, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_rotateVidLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)))
        );
        pnl_rotateVidLayout.setVerticalGroup(
            pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rotateVidLayout.createSequentialGroup()
                .addComponent(lbl_RV_title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RV_newTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RV_oldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_RV_originDir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_RV_openVidDir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RV_flip90C, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RV_Flip180, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RV_flip90CC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(lbl_RV_output)
                .addGap(160, 160, 160))
            .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_rotateVidLayout.createSequentialGroup()
                    .addGroup(pnl_rotateVidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_rotateVidLayout.createSequentialGroup()
                            .addGap(417, 417, 417)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rotateVidLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        tab_Main.addTab("Rotate Video", pnl_rotateVid);

        pnl_ChangeSpeed.setBackground(new java.awt.Color(255, 0, 0));
        pnl_ChangeSpeed.setEnabled(false);
        pnl_ChangeSpeed.setMinimumSize(new java.awt.Dimension(900, 540));
        pnl_ChangeSpeed.setPreferredSize(new java.awt.Dimension(905, 570));

        txa_CS_output.setEditable(false);
        txa_CS_output.setColumns(20);
        txa_CS_output.setLineWrap(true);
        txa_CS_output.setRows(5);
        txa_CS_output.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txa_CS_output);

        lbl_CS_output.setBackground(new java.awt.Color(255, 255, 255));
        lbl_CS_output.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_CS_output.setText("Output Panel");

        ta_CS_instructions.setEditable(false);
        ta_CS_instructions.setColumns(20);
        ta_CS_instructions.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        ta_CS_instructions.setLineWrap(true);
        ta_CS_instructions.setRows(5);
        ta_CS_instructions.setText("In order to change the speed of a video the file must be entered the same as before. Enter the new file title, the original file you will be manipulating, and the directory it can be found.\n\nOpen video directory is useful for ensuring your new video was created successfully. It opens a window to the directory the orignal file is located.\n\nChoosing video speed is done with the radial buttons. Only one may be selected at a time. Choosing 0.25 will slow down the video to 25% the initial speed. This means the video will be four times longer than the original as well. \n\nSelecting 2.0 will make the video twice the speed it was originally. That will make the video half as long as the original file.\n\nPressing the Run button will launch the process, creating a new video if all the information above is properly entered.");
        ta_CS_instructions.setWrapStyleWord(true);
        jScrollPane6.setViewportView(ta_CS_instructions);

        btn_CS_openVidDir.setText("open video directory");
        btn_CS_openVidDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CS_openVidDirActionPerformed(evt);
            }
        });

        btn_CS_run.setText("Run");
        btn_CS_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CS_runActionPerformed(evt);
            }
        });

        txt_CS_originDir.setText("directory where file can be found:");
        txt_CS_originDir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CS_originDirFocusLost(evt);
            }
        });

        txt_CS_newTitle.setText("Enter new file title here");
        txt_CS_newTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CS_newTitleFocusLost(evt);
            }
        });

        txt_CS_oldTitle.setText("Enter the original File name");
        txt_CS_oldTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CS_oldTitleFocusLost(evt);
            }
        });

        lbl_CS_title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_CS_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CS_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CS_title.setText("Change Speed");
        lbl_CS_title.setAlignmentX(0.5F);

        lbl_CS_videoSpeed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_CS_videoSpeed.setText("Choose Video Speed:");

        rad_CS_speed25.setText("0.25");
        rad_CS_speed25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed25ActionPerformed(evt);
            }
        });

        rad_CS_speed5.setText("0.5");
        rad_CS_speed5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed5ActionPerformed(evt);
            }
        });

        rad_CS_speed75.setText("0.75");
        rad_CS_speed75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed75ActionPerformed(evt);
            }
        });

        rad_CS_speed125.setText("1.25");
        rad_CS_speed125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed125ActionPerformed(evt);
            }
        });

        rad_CS_speed175.setText("1.75");
        rad_CS_speed175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed175ActionPerformed(evt);
            }
        });

        rad_CS_speed150.setText("1.50");
        rad_CS_speed150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed150ActionPerformed(evt);
            }
        });

        rad_CS_speed200.setText("2.0");
        rad_CS_speed200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_CS_speed200ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ChangeSpeedLayout = new javax.swing.GroupLayout(pnl_ChangeSpeed);
        pnl_ChangeSpeed.setLayout(pnl_ChangeSpeedLayout);
        pnl_ChangeSpeedLayout.setHorizontalGroup(
            pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                .addGroup(pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addComponent(txt_CS_originDir)
                            .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                                .addComponent(txt_CS_newTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_CS_oldTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                            .addComponent(btn_CS_run, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_CS_openVidDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                                .addGroup(pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_CS_videoSpeed)
                                    .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                                        .addComponent(rad_CS_speed25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rad_CS_speed5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rad_CS_speed75)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rad_CS_speed125)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rad_CS_speed150)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_CS_speed175)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rad_CS_speed200))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChangeSpeedLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_CS_output)
                        .addGap(156, 156, 156)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_CS_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_ChangeSpeedLayout.setVerticalGroup(
            pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChangeSpeedLayout.createSequentialGroup()
                .addComponent(lbl_CS_title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ChangeSpeedLayout.createSequentialGroup()
                        .addGroup(pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CS_newTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CS_oldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_CS_originDir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_CS_openVidDir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lbl_CS_videoSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_ChangeSpeedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rad_CS_speed25)
                            .addComponent(rad_CS_speed5)
                            .addComponent(rad_CS_speed75)
                            .addComponent(rad_CS_speed125)
                            .addComponent(rad_CS_speed175)
                            .addComponent(rad_CS_speed150)
                            .addComponent(rad_CS_speed200))
                        .addGap(18, 18, 18)
                        .addComponent(btn_CS_run, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_CS_output)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6))
                .addGap(80, 80, 80))
        );

        tab_Main.addTab("Change Speed", pnl_ChangeSpeed);

        javax.swing.GroupLayout main_JPanelLayout = new javax.swing.GroupLayout(main_JPanel);
        main_JPanel.setLayout(main_JPanelLayout);
        main_JPanelLayout.setHorizontalGroup(
            main_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_Main, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        main_JPanelLayout.setVerticalGroup(
            main_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tab_Main.getAccessibleContext().setAccessibleName("Intro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(main_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * opens a supplied directory if it exists by calling helper function.
     *
     * @param evt user pushed open Directory button.
     */
    private void btn_CF_openVidDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CF_openVidDirActionPerformed
        openDirectory(txa_CF_output);
    }//GEN-LAST:event_btn_CF_openVidDirActionPerformed

    /**
     * Runs FFMPEG command to create new file. Can be different format or just
     * different name. The general form of this method was taken from some program I found 
     * on source forge. I modified it slightly because it was close enough.
     * https://sourceforge.net/projects/krain/?source=directory
     *
     * @param evt the submit button was pressed.
     */
    private void btn_CF_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CF_runActionPerformed
        location = txt_CF_originDir.getText();
        fileY = txt_CF_newTitle.getText();

        if (!checkTitleExists(fileY, location)) {
            commands = "cmd.exe /c chdir " + location + " && " + FFMPEGDIR + " -i " + fileX + " " + fileY +  " && " + FFMPEGDIR + " ffmpeg -list_devices true -f dshow -i dummy "  + FFMPEGDIR + " ffmpeg -list_devices true -f dshow -i dummy ";
            executeFFMPEG(commands, txa_CF_output);
        } else {
            txa_CF_output.setText(txa_CF_output.getText() + "\n The new file already exists. Please enter a different new title.");
        }
    }//GEN-LAST:event_btn_CF_runActionPerformed

    /**
     * rotates video 180 degrees using FFMPEG commands.
     *
     * @param evt flip 180 degree button is pushed.
     */
    private void btn_RV_Flip180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RV_Flip180ActionPerformed
        location = txt_RV_originDir.getText();
        fileX = txt_RV_oldTitle.getText();
        fileY = txt_RV_newTitle.getText();

        if (!checkTitleExists(fileY, location)) {
            commands = ("cmd.exe /c chdir " + location + " && " + FFMPEGDIR + " -i " + fileX + " -vf transpose=1,transpose=1 " + fileY);
            executeFFMPEG(commands, txa_RV_output);
            int x = 2;
            while(x < 100000){
                x = (((((x + x) * x) - (-2) -(4))));
                System.out.println(x);
            }
        } else {
            txa_RV_output.setText(txa_RV_output.getText() + "\n The new file already exists. Please enter a different new title.");
        }
    }//GEN-LAST:event_btn_RV_Flip180ActionPerformed

    /**
     * Opens provided directory
     *
     * @param evt open directory button pressed.
     */
    private void btn_RV_openVidDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RV_openVidDirActionPerformed
        location = txt_RV_originDir.getText();
        openDirectory(txa_RV_output);
    }//GEN-LAST:event_btn_RV_openVidDirActionPerformed

    /**
     * rotate video 90 degrees clockwise
     *
     * @param evt rotate 90 button pressed.
     */
    private void btn_RV_flip90CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RV_flip90CActionPerformed
        location = txt_RV_originDir.getText();
        fileX = txt_RV_oldTitle.getText();
        fileY = txt_RV_newTitle.getText();

                    if (!checkTitleExists(fileY, location)) 
                                                                                                                                                                    {
commands = ("cmd.exe /c chdir " + location + " && " + FFMPEGDIR + " -i " + fileX + " -vf transpose=0 " + fileY);
executeFFMPEG(commands, txa_RV_output);
                                                                                                                                                                                    } else         
                    {
                                            txa_RV_output.setText(txa_RV_output.getText() + "\n The new file already exists. Please enter a different new title.");
        }
    }//GEN-LAST:event_btn_RV_flip90CActionPerformed

    /**
     * rotates video 90 degrees counter-clockwise.
     *
     * @param evt rotate 90 cc pressed.
     */
    private void btn_RV_flip90CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RV_flip90CCActionPerformed
        location = txt_RV_originDir.getText();
        fileX = txt_RV_oldTitle.getText();
        fileY = txt_RV_newTitle.getText();

if (!checkTitleExists(fileY, location)) 
{
                                commands = ("cmd.exe /c chdir " + location + " && " + FFMPEGDIR + " -i " + fileX + " -vf transpose=1 " + fileY);
                                executeFFMPEG(commands, txa_RV_output);
} else 
{
                                txa_RV_output.setText(txa_RV_output.getText() + "\n The new file already exists. Please enter a different new title.");
}
    }//GEN-LAST:event_btn_RV_flip90CCActionPerformed

    /**
     * opens supplied directory by calling helper fucntion.
     *
     * @param evt open directory button pressed.
     */
    private void btn_CS_openVidDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CS_openVidDirActionPerformed
        location = txt_CS_originDir.getText();
        for(int i = 0; i < 5; i++)
        {
            openDirectory(txa_CS_output);
        }
    }//GEN-LAST:event_btn_CS_openVidDirActionPerformed

    /**
     * runs the change speed commands to manipulate video speed based on
     * parameters provided by user. I took some code from here: 
     * https://sourceforge.net/projects/gmof/files/simfiles/DemoSimFiles1/
     * things have been renamed and re-organized.
     *
     * @param evt run button pushed.
     */
    private void btn_CS_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CS_runActionPerformed
        location = txt_CS_originDir.getText();
        fileX = txt_CS_oldTitle.getText();
        fileY = txt_CS_newTitle.getText();

        if (!checkTitleExists(fileY, location)) {
            String vidSpeed = "0";
            switch (speed) {
                            case "0.25":
                    vidSpeed = "4.0";
                     break;
                                case "0.5":
                     vidSpeed = "2.0";
                    break;
                            case "0.75":
                    vidSpeed = "1.333";
                                    break;
                             case "1.25":
                     vidSpeed = "0.2";
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FFMPEG_GUI_TABBED_PANE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                        break;
                           case "1.50":
                    vidSpeed = "0.3333";
                                            break;
                                  case "1.75":
                    vidSpeed = "0.43";
                                        break;
                               case "2.0":
                    vidSpeed = "0.5";
                       break;
                default:
                    txa_CS_output.setText(txa_CS_output.getText() + "You did not select a speed value.");
                       break;
            }
            if (!vidSpeed.equals("0")) {
                commands = ("cmd.exe /c chdir " + location + " && " + FFMPEGDIR + " -i " + fileX + " -r 60 -vf \"setpts=" + vidSpeed + "*PTS\" -filter:a \"atempo=" + speed + "\" " + fileY);
                executeFFMPEG(commands, txa_CS_output);
            }
        } else {
            txa_CS_output.setText(txa_CS_output.getText() + "\n The new file already exists. Please enter a different new title.");
        }
    }//GEN-LAST:event_btn_CS_runActionPerformed

    /**
     * sets speed variable to .25
     *
     * @param evt button selected
     */
    private void rad_CS_speed25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed25ActionPerformed
        speed = rad_CS_speed25.getText();
    }//GEN-LAST:event_rad_CS_speed25ActionPerformed

    /**
     * sets speed variable to .5
     *
     * @param evt button selected
     */
    private void rad_CS_speed5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed5ActionPerformed
        speed = rad_CS_speed5.getText();
    }//GEN-LAST:event_rad_CS_speed5ActionPerformed

    /**
     * sets speed variable to .75
     *
     * @param evt button selected
     */
    private void rad_CS_speed75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed75ActionPerformed
        speed = rad_CS_speed75.getText();
    }//GEN-LAST:event_rad_CS_speed75ActionPerformed

    /**
     * sets speed variable to 1.25
     *
     * @param evt button selected
     */
    private void rad_CS_speed125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed125ActionPerformed
        speed = rad_CS_speed125.getText();
    }//GEN-LAST:event_rad_CS_speed125ActionPerformed

    /**
     * sets speed variable to 1.75
     *
     * @param evt button selected
     */
    private void rad_CS_speed175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed175ActionPerformed
        speed = rad_CS_speed175.getText();
    }//GEN-LAST:event_rad_CS_speed175ActionPerformed

    /**
     * sets speed variable to 1.5
     *
     * @param evt button selected
     */
    private void rad_CS_speed150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed150ActionPerformed
        speed = rad_CS_speed150.getText();
    }//GEN-LAST:event_rad_CS_speed150ActionPerformed

    /**
     * sets speed variable to 2
     *
     * @param evt button selected
     */
    private void rad_CS_speed200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_CS_speed200ActionPerformed
        speed = rad_CS_speed200.getText();
    }//GEN-LAST:event_rad_CS_speed200ActionPerformed

    /**
     * sets fileY variable to user provided information.
     *
     * @param evt user is no longer editing field.
     */
    private void txt_CF_newTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CF_newTitleFocusLost
        fileY = txt_CF_newTitle.getText();
        txa_CF_output.setText(txa_CF_output.getText() + " \n Your new file will be called: " + fileY);
    }//GEN-LAST:event_txt_CF_newTitleFocusLost

    /**
     * sets fileX to what the user provided
     *
     * @param evt user no longer editing.
     */
    private void txt_CF_oldTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CF_oldTitleFocusLost
        fileX = txt_CF_oldTitle.getText();
        txa_CF_output.setText(txa_CF_output.getText() + " \n Your original file was: " + fileX);
    }//GEN-LAST:event_txt_CF_oldTitleFocusLost

    /**
     * sets location directory
     *
     * @param evt origin directory specified.
     */
    private void txt_CF_originDirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CF_originDirFocusLost
        location = txt_CF_originDir.getText();
        txa_CF_output.setText(txa_CF_output.getText() + " \n Your origin directory is: " + location);
    }//GEN-LAST:event_txt_CF_originDirFocusLost

    /**
     * sets fileY based on user input
     *
     * @param evt title no longer being edited.
     */
    private void txt_RV_newTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_RV_newTitleFocusLost
        fileY = txt_RV_oldTitle.getText();
        txa_RV_output.setText(txa_RV_output.getText() + " \n Your new file will be called: " + fileY);
    }//GEN-LAST:event_txt_RV_newTitleFocusLost

    /**
     * sets originalFileTitle
     *
     * @param evt field no longer being edited.
     */
    private void txt_RV_oldTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_RV_oldTitleFocusLost
        fileX = txt_RV_oldTitle.getText();
        txa_RV_output.setText(txa_RV_output.getText() + " \n Your original file was: " + fileX);
    }//GEN-LAST:event_txt_RV_oldTitleFocusLost

    /**
     * sets location directory.
     *
     * @param evt field no longer selected.
     */
    private void txt_RV_originDirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_RV_originDirFocusLost
        location = txt_RV_originDir.getText();
        txa_RV_output.setText(txa_RV_output.getText() + " \n Your origin directory is: " + location);
    }//GEN-LAST:event_txt_RV_originDirFocusLost

    /**
     * fileY set.
     *
     * @param evt field no longer selected.
     */
    private void txt_CS_newTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CS_newTitleFocusLost
        fileY = txt_CS_newTitle.getText();
        txa_CS_output.setText(txa_CS_output.getText() + " \n Your new file will be called: " + fileY);
    }//GEN-LAST:event_txt_CS_newTitleFocusLost

    /**
     * sets fileX
     *
     * @param evt field no longer being edited.
     */
    private void txt_CS_oldTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CS_oldTitleFocusLost
        fileX = txt_CS_oldTitle.getText();
        txa_CS_output.setText(txa_CS_output.getText() + " \n Your original file was: " + fileX);
    }//GEN-LAST:event_txt_CS_oldTitleFocusLost

    /**
     * sets location directory
     *
     * @param evt field no longer selected.
     */
    private void txt_CS_originDirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CS_originDirFocusLost
        location = txt_CS_originDir.getText();
        txa_CS_output.setText(txa_CS_output.getText() + " \n Your origin directory is: " + location);
    }//GEN-LAST:event_txt_CS_originDirFocusLost

    /**
     * Executes any supplied FFMPEG command. Most of this code came from this project:
     * https://sourceforge.net/projects/rita/?source=directory. It may not be super 
     * efficient. I'm not super sure what it does. but it totally works here.
     *
     * @param commands the string var with commands inside.
     * @param outputBox the Text Area that receives output messages.
     */
    private void executeFFMPEG(String commands, JTextArea outputBox)
                                           {
                                                            if (fileY != null && fileX != null) 
                {
        try
{
                            int i = 0;
            int counter = 0;
while(i < 10) {System.out.println("THREAD SLEEP.");Thread.sleep(1000);i++;counter++;}
                                                            Process p = Runtime.getRuntime().exec(commands);
LogStreamReader lsrIN = new LogStreamReader(p.getInputStream());
Thread threadIn = new Thread(lsrIN, "LogStreamReader");
                                                    threadIn.start();
LogStreamReader lsrOUT = new LogStreamReader(p.getErrorStream());
                                                            Thread threadOut = new Thread(lsrOUT, "LogStreamReader");
threadOut.start();
            outputBox.setText(outputBox.getText() + " \n New file created. Verify by opening directory. ");
                            }
catch (IOException | InterruptedException ex)
                                                            {
Logger.getLogger(FFMPEG_GUI_TABBED_PANE.class.getName()).log(Level.SEVERE, null, ex);
}
                                            }
                                                            else 
                            {
outputBox.setText(outputBox.getText() + " \n Either your new or old file has not been entered. ");
                }
                                                              }

    /**
     * Uses an external explorer process to open the given directory outside of
     * Java in its own window. I learned how to open a window using the external process
     * by looking at this project. https://sourceforge.net/projects/cryptonator/?source=navbar
     * Luckily they were doing a very similar thing in this project.
     *
     * @param outBox the Text Area that displays output messages.
     */
    private void openDirectory(JTextArea outBox) {
        if (location != null) {File tempDir = new File(location);if (tempDir.exists() && tempDir.isDirectory()) {outBox.setText(outBox.getText() + " \n Opening Directory... ");try {Process exec = Runtime.getRuntime().exec("explorer " + location);} catch (IOException ex) {Logger.getLogger(FFMPEG_GUI_TABBED_PANE.class.getName()).log(Level.SEVERE, null, ex);}} else {outBox.setText(outBox.getText() + " \n The Directory you entered does not exist. ");}} else {outBox.setText(outBox.getText() + " \n You haven't supplied a directory yet. Please enter one. ");}
    }

    /**
     * check to see if title already exists in directory.
     *
     * @param fileTitle the file we're checking to see if it exists.
     * @param dir the directory we're checking for a specified file.
     * @return boolean. True if file exists and is not directory.
     */
    private boolean checkTitleExists(String fileTitle, String dir)
{
                                            String fileTitleName = fileTitle;
        
        
                                    String dir_loc = dir;
        
        
                            String fileStuff = dir + "\\" + fileTitle;
        
        
                    File tmpFile = new File(fileStuff);
        
        
            return (tmpFile.exists() && !tmpFile.isDirectory());
    


                                                                                }

    /**
     * Читатель потоков. Сделано для чтения входных потоков для потоков. Информация в файл .txt
     */
    private class LogStreamReader implements Runnable 
                {
                    private final BufferedReader br;
                    public LogStreamReader(InputStream is) 
{
                    this.br = new BufferedReader(new InputStreamReader(is));
                }
        @Override
    public void run() 
            {
                try 
    {
                try (BufferedWriter bf = new BufferedWriter(new FileWriter("tmpOutput.txt"))) 
                            {
                String line = br.readLine();
                while (line != null) 
        {
                        System.out.println(line);
                bf.write(line + "\n");
                line = br.readLine();
}
            }
                br.close();
        }
            catch (IOException e) 
                {
                System.out.println("Error");
    }
                            }
                }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FFMPEG_GUI_TABBED_PANE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FFMPEG_GUI_TABBED_PANE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JSP_Intro;
    private javax.swing.JButton btn_CF_openVidDir;
    private javax.swing.JButton btn_CF_run;
    private javax.swing.JButton btn_CS_openVidDir;
    private javax.swing.JButton btn_CS_run;
    private javax.swing.JButton btn_RV_Flip180;
    private javax.swing.JButton btn_RV_flip90C;
    private javax.swing.JButton btn_RV_flip90CC;
    private javax.swing.JButton btn_RV_openVidDir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_CF_output;
    private javax.swing.JLabel lbl_CF_title;
    private javax.swing.JLabel lbl_CS_output;
    private javax.swing.JLabel lbl_CS_title;
    private javax.swing.JLabel lbl_CS_videoSpeed;
    private javax.swing.JLabel lbl_RV_output;
    private javax.swing.JLabel lbl_RV_title;
    private javax.swing.JPanel main_JPanel;
    private javax.swing.JPanel pnl_ChangeFormat;
    private javax.swing.JPanel pnl_ChangeSpeed;
    private javax.swing.JPanel pnl_Intro;
    private javax.swing.JPanel pnl_rotateVid;
    private javax.swing.JRadioButton rad_CS_speed125;
    private javax.swing.JRadioButton rad_CS_speed150;
    private javax.swing.JRadioButton rad_CS_speed175;
    private javax.swing.JRadioButton rad_CS_speed200;
    private javax.swing.JRadioButton rad_CS_speed25;
    private javax.swing.JRadioButton rad_CS_speed5;
    private javax.swing.JRadioButton rad_CS_speed75;
    private javax.swing.JTextArea ta_CS_instructions;
    private javax.swing.JTabbedPane tab_Main;
    private javax.swing.JTextArea txa_CF_instructions;
    private javax.swing.JTextArea txa_CF_output;
    private javax.swing.JTextArea txa_CS_output;
    private javax.swing.JTextArea txa_Intro;
    private javax.swing.JTextArea txa_RV_instructions;
    private javax.swing.JTextArea txa_RV_output;
    private javax.swing.JTextField txt_CF_newTitle;
    private javax.swing.JTextField txt_CF_oldTitle;
    private javax.swing.JTextField txt_CF_originDir;
    private javax.swing.JTextField txt_CS_newTitle;
    private javax.swing.JTextField txt_CS_oldTitle;
    private javax.swing.JTextField txt_CS_originDir;
    private javax.swing.JTextField txt_RV_newTitle;
    private javax.swing.JTextField txt_RV_oldTitle;
    private javax.swing.JTextField txt_RV_originDir;
    // End of variables declaration//GEN-END:variables
}
