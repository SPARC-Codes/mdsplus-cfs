/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MARTE_MHD_BRSetup.java
 *
 * Created on Mar 2, 2011, 1:07:35 PM
 */

/**
 *
 * @author manduchi
 */
public class MARTE_MHD_BRSetup extends DeviceSetup {

    /** Creates new form MARTE_MHD_BRSetup */
    public MARTE_MHD_BRSetup() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceTableBeanInfo1 = new DeviceTableBeanInfo();
        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField3 = new DeviceField();
        jPanel7 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceField5 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceField6 = new DeviceField();
        jPanel9 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceField8 = new DeviceField();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        deviceTable3 = new DeviceTable();
        deviceTable4 = new DeviceTable();
        jPanel4 = new javax.swing.JPanel();
        deviceField9 = new DeviceField();
        deviceField10 = new DeviceField();
        deviceField11 = new DeviceField();
        jPanel10 = new javax.swing.JPanel();
        deviceTable1 = new DeviceTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        deviceTable2 = new DeviceTable();

        setDeviceProvider("localhost");
        setDeviceTitle("MARTe MhdBr Setup");
        setDeviceType("MARTE_MHD_BR");
        setHeight(400);
        setWidth(600);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(5, 0));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Comment: ");
        deviceField1.setNumCols(30);
        deviceField1.setOffsetNid(1);
        deviceField1.setTextOnly(true);
        jPanel5.add(deviceField1);

        jPanel2.add(jPanel5);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Start Sampling(s):");
        deviceField2.setOffsetNid(8);
        jPanel6.add(deviceField2);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("End Sampling(s):");
        deviceField3.setOffsetNid(9);
        jPanel6.add(deviceField3);

        jPanel2.add(jPanel6);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Start Offset Comp(s).:");
        deviceField4.setOffsetNid(6);
        jPanel7.add(deviceField4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("End Offset Comp.(s):");
        deviceField5.setOffsetNid(7);
        jPanel7.add(deviceField5);

        jPanel2.add(jPanel7);

        deviceChoice1.setChoiceItems(new String[] {"MhdBrControl"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Control: ");
        deviceChoice1.setOffsetNid(12);
        deviceChoice1.setUpdateIdentifier("");
        jPanel8.add(deviceChoice1);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Contr. Duration(s): ");
        deviceField6.setOffsetNid(5);
        jPanel8.add(deviceField6);

        jPanel2.add(jPanel8);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Trig. Time: ");
        deviceField7.setNumCols(25);
        deviceField7.setOffsetNid(4);
        jPanel9.add(deviceField7);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Freq. (Hz):");
        deviceField8.setOffsetNid(3);
        jPanel9.add(deviceField8);

        jPanel2.add(jPanel9);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        deviceTable3.setDisplayRowNumber(true);
        deviceTable3.setIdentifier("");
        deviceTable3.setLabelString("Mapping:");
        deviceTable3.setNumCols(1);
        deviceTable3.setNumRows(192);
        deviceTable3.setOffsetNid(1339);
        deviceTable3.setPreferredColumnWidth(60);
        deviceTable3.setPreferredHeight(200);
        deviceTable3.setUseExpressions(true);
        jPanel3.add(deviceTable3);

        deviceTable4.setBinary(true);
        deviceTable4.setDisplayRowNumber(true);
        deviceTable4.setIdentifier("");
        deviceTable4.setLabelString("Autozero Mask");
        deviceTable4.setNumCols(1);
        deviceTable4.setNumRows(192);
        deviceTable4.setOffsetNid(1345);
        deviceTable4.setPreferredColumnWidth(4);
        deviceTable4.setPreferredHeight(200);
        jPanel3.add(deviceTable4);

        jTabbedPane1.addTab("Mapping&Offset", jPanel3);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Max. Br Horizontal Probes (T): ");
        deviceField9.setNumCols(20);
        deviceField9.setOffsetNid(1351);
        jPanel4.add(deviceField9);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Max. Br Vertical Probes (T): ");
        deviceField10.setNumCols(20);
        deviceField10.setOffsetNid(1357);
        jPanel4.add(deviceField10);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("Max time period above threshold (s):");
        deviceField11.setNumCols(20);
        deviceField11.setOffsetNid(1363);
        jPanel4.add(deviceField11);

        jTabbedPane1.addTab("Alarms", jPanel4);

        jPanel10.setLayout(new java.awt.BorderLayout());

        deviceTable1.setColumnNames(new String[] {"Gain", "Offset"});
        deviceTable1.setDisplayRowNumber(true);
        deviceTable1.setIdentifier("");
        deviceTable1.setNumCols(2);
        deviceTable1.setNumRows(192);
        deviceTable1.setOffsetNid(10);
        deviceTable1.setUseExpressions(true);
        jPanel10.add(deviceTable1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("In Calibration", jPanel10);

        jPanel11.setLayout(new java.awt.BorderLayout());

        deviceTable2.setColumnNames(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"});
        deviceTable2.setDisplayRowNumber(true);
        deviceTable2.setIdentifier("");
        deviceTable2.setNumCols(48);
        deviceTable2.setNumRows(4);
        deviceTable2.setOffsetNid(1369);
        deviceTable2.setPreferredColumnWidth(100);
        jPanel11.add(deviceTable2, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel11);

        jTabbedPane1.addTab("Br Corrections", jScrollPane1);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private DeviceTable deviceTable1;
    private DeviceTable deviceTable2;
    private DeviceTable deviceTable3;
    private DeviceTable deviceTable4;
    private DeviceTableBeanInfo deviceTableBeanInfo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
