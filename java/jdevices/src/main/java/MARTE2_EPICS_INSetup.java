/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdsplus
 */
public class MARTE2_EPICS_INSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_EPICS_INSetup
     */
    public MARTE2_EPICS_INSetup() {
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

        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField2 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceField4 = new DeviceField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();
        deviceChoice1 = new DeviceChoice();
        deviceField6 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceChoice2 = new DeviceChoice();
        deviceField8 = new DeviceField();
        jPanel7 = new javax.swing.JPanel();
        deviceField9 = new DeviceField();
        deviceChoice3 = new DeviceChoice();
        deviceField10 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        deviceField11 = new DeviceField();
        deviceChoice4 = new DeviceChoice();
        deviceField12 = new DeviceField();
        jPanel9 = new javax.swing.JPanel();
        deviceField13 = new DeviceField();
        deviceChoice5 = new DeviceChoice();
        deviceField14 = new DeviceField();
        jPanel10 = new javax.swing.JPanel();
        deviceField15 = new DeviceField();
        deviceChoice6 = new DeviceChoice();
        deviceField16 = new DeviceField();
        jPanel11 = new javax.swing.JPanel();
        deviceField17 = new DeviceField();
        deviceChoice7 = new DeviceChoice();
        deviceField18 = new DeviceField();
        jPanel12 = new javax.swing.JPanel();
        deviceField19 = new DeviceField();
        deviceChoice8 = new DeviceChoice();
        deviceField20 = new DeviceField();
        jPanel13 = new javax.swing.JPanel();
        deviceField21 = new DeviceField();
        deviceChoice9 = new DeviceChoice();
        deviceField22 = new DeviceField();
        jPanel14 = new javax.swing.JPanel();
        deviceField23 = new DeviceField();
        deviceChoice10 = new DeviceChoice();
        deviceField24 = new DeviceField();
        jPanel15 = new javax.swing.JPanel();
        deviceField25 = new DeviceField();
        deviceChoice11 = new DeviceChoice();
        deviceField26 = new DeviceField();
        jPanel16 = new javax.swing.JPanel();
        deviceField27 = new DeviceField();
        deviceChoice12 = new DeviceChoice();
        deviceField28 = new DeviceField();
        jPanel17 = new javax.swing.JPanel();
        deviceField29 = new DeviceField();
        deviceChoice13 = new DeviceChoice();
        deviceField30 = new DeviceField();
        jPanel18 = new javax.swing.JPanel();
        deviceField31 = new DeviceField();
        deviceChoice14 = new DeviceChoice();
        deviceField32 = new DeviceField();
        jPanel19 = new javax.swing.JPanel();
        deviceField33 = new DeviceField();
        deviceChoice15 = new DeviceChoice();
        deviceField34 = new DeviceField();
        jPanel20 = new javax.swing.JPanel();
        deviceField35 = new DeviceField();
        deviceChoice16 = new DeviceChoice();
        deviceField36 = new DeviceField();

        setDeviceProvider("spilds.rfx.local:8100");
        setDeviceTitle("EPICS In");
        setDeviceType("MARTE2_EPICS_IN");
        setHeight(500);
        setWidth(900);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Timebase: ");
        deviceField1.setNumCols(25);
        deviceField1.setOffsetNid(3);
        jPanel3.add(deviceField1);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Tibase div.:");
        deviceField2.setNumCols(6);
        deviceField2.setOffsetNid(210);
        jPanel3.add(deviceField2);

        jPanel2.add(jPanel3);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("EPICS CPU Mask: ");
        deviceField3.setNumCols(6);
        deviceField3.setOffsetNid(10);
        jPanel4.add(deviceField3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Write CPU Mask: ");
        deviceField4.setNumCols(6);
        deviceField4.setOffsetNid(17);
        jPanel4.add(deviceField4);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.GridLayout(16, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PV1"));

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("PV Name: ");
        deviceField5.setNumCols(20);
        deviceField5.setOffsetNid(29);
        deviceField5.setTextOnly(true);
        jPanel1.add(deviceField5);

        deviceChoice1.setChoiceIntValues(new int[] {0, -1});
        deviceChoice1.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice1.setConvert(true);
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Output: ");
        deviceChoice1.setOffsetNid(22);
        deviceChoice1.setUpdateIdentifier("");
        jPanel1.add(deviceChoice1);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Seg. Len: ");
        deviceField6.setNumCols(6);
        deviceField6.setOffsetNid(23);
        jPanel1.add(deviceField6);

        jPanel5.add(jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("PV2"));

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("PV Name: ");
        deviceField7.setNumCols(20);
        deviceField7.setOffsetNid(41);
        deviceField7.setTextOnly(true);
        jPanel6.add(deviceField7);

        deviceChoice2.setChoiceIntValues(new int[] {0, -1});
        deviceChoice2.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice2.setConvert(true);
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Output: ");
        deviceChoice2.setOffsetNid(34);
        deviceChoice2.setUpdateIdentifier("");
        jPanel6.add(deviceChoice2);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Seg. Len: ");
        deviceField8.setNumCols(6);
        deviceField8.setOffsetNid(35);
        jPanel6.add(deviceField8);

        jPanel5.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("PV3"));

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("PV Name: ");
        deviceField9.setNumCols(20);
        deviceField9.setOffsetNid(53);
        deviceField9.setTextOnly(true);
        jPanel7.add(deviceField9);

        deviceChoice3.setChoiceIntValues(new int[] {0, -1});
        deviceChoice3.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice3.setConvert(true);
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("Output: ");
        deviceChoice3.setOffsetNid(46);
        deviceChoice3.setUpdateIdentifier("");
        jPanel7.add(deviceChoice3);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Seg. Len: ");
        deviceField10.setNumCols(6);
        deviceField10.setOffsetNid(47);
        jPanel7.add(deviceField10);

        jPanel5.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("PV4"));

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("PV Name: ");
        deviceField11.setNumCols(20);
        deviceField11.setOffsetNid(65);
        deviceField11.setTextOnly(true);
        jPanel8.add(deviceField11);

        deviceChoice4.setChoiceIntValues(new int[] {0, -1});
        deviceChoice4.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice4.setConvert(true);
        deviceChoice4.setIdentifier("");
        deviceChoice4.setLabelString("Output: ");
        deviceChoice4.setOffsetNid(58);
        deviceChoice4.setUpdateIdentifier("");
        jPanel8.add(deviceChoice4);

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Seg. Len: ");
        deviceField12.setNumCols(6);
        deviceField12.setOffsetNid(59);
        jPanel8.add(deviceField12);

        jPanel5.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("PV5"));

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("PV Name: ");
        deviceField13.setNumCols(20);
        deviceField13.setOffsetNid(77);
        deviceField13.setTextOnly(true);
        jPanel9.add(deviceField13);

        deviceChoice5.setChoiceIntValues(new int[] {0, -1});
        deviceChoice5.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice5.setConvert(true);
        deviceChoice5.setIdentifier("");
        deviceChoice5.setLabelString("Output: ");
        deviceChoice5.setOffsetNid(70);
        deviceChoice5.setUpdateIdentifier("");
        jPanel9.add(deviceChoice5);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("Seg. Len: ");
        deviceField14.setNumCols(6);
        deviceField14.setOffsetNid(71);
        jPanel9.add(deviceField14);

        jPanel5.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("PV6"));

        deviceField15.setIdentifier("");
        deviceField15.setLabelString("PV Name: ");
        deviceField15.setNumCols(20);
        deviceField15.setOffsetNid(89);
        deviceField15.setTextOnly(true);
        jPanel10.add(deviceField15);

        deviceChoice6.setChoiceIntValues(new int[] {0, -1});
        deviceChoice6.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice6.setConvert(true);
        deviceChoice6.setIdentifier("");
        deviceChoice6.setLabelString("Output: ");
        deviceChoice6.setOffsetNid(82);
        deviceChoice6.setUpdateIdentifier("");
        jPanel10.add(deviceChoice6);

        deviceField16.setIdentifier("");
        deviceField16.setLabelString("Seg. Len: ");
        deviceField16.setNumCols(6);
        deviceField16.setOffsetNid(83);
        jPanel10.add(deviceField16);

        jPanel5.add(jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("PV7"));

        deviceField17.setIdentifier("");
        deviceField17.setLabelString("PV Name: ");
        deviceField17.setNumCols(20);
        deviceField17.setOffsetNid(101);
        deviceField17.setTextOnly(true);
        jPanel11.add(deviceField17);

        deviceChoice7.setChoiceIntValues(new int[] {0, -1});
        deviceChoice7.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice7.setConvert(true);
        deviceChoice7.setIdentifier("");
        deviceChoice7.setLabelString("Output: ");
        deviceChoice7.setOffsetNid(94);
        deviceChoice7.setUpdateIdentifier("");
        jPanel11.add(deviceChoice7);

        deviceField18.setIdentifier("");
        deviceField18.setLabelString("Seg. Len: ");
        deviceField18.setNumCols(6);
        deviceField18.setOffsetNid(95);
        jPanel11.add(deviceField18);

        jPanel5.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("PV8"));

        deviceField19.setIdentifier("");
        deviceField19.setLabelString("PV Name: ");
        deviceField19.setNumCols(20);
        deviceField19.setOffsetNid(113);
        deviceField19.setTextOnly(true);
        jPanel12.add(deviceField19);

        deviceChoice8.setChoiceIntValues(new int[] {0, -1});
        deviceChoice8.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice8.setConvert(true);
        deviceChoice8.setIdentifier("");
        deviceChoice8.setLabelString("Output: ");
        deviceChoice8.setOffsetNid(106);
        deviceChoice8.setUpdateIdentifier("");
        jPanel12.add(deviceChoice8);

        deviceField20.setIdentifier("");
        deviceField20.setLabelString("Seg. Len: ");
        deviceField20.setNumCols(6);
        deviceField20.setOffsetNid(107);
        jPanel12.add(deviceField20);

        jPanel5.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("PV9"));

        deviceField21.setIdentifier("");
        deviceField21.setLabelString("PV Name: ");
        deviceField21.setNumCols(20);
        deviceField21.setOffsetNid(125);
        deviceField21.setTextOnly(true);
        jPanel13.add(deviceField21);

        deviceChoice9.setChoiceIntValues(new int[] {0, -1});
        deviceChoice9.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice9.setConvert(true);
        deviceChoice9.setIdentifier("");
        deviceChoice9.setLabelString("Output: ");
        deviceChoice9.setOffsetNid(118);
        deviceChoice9.setUpdateIdentifier("");
        jPanel13.add(deviceChoice9);

        deviceField22.setIdentifier("");
        deviceField22.setLabelString("Seg. Len: ");
        deviceField22.setNumCols(6);
        deviceField22.setOffsetNid(119);
        jPanel13.add(deviceField22);

        jPanel5.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("PV10"));

        deviceField23.setIdentifier("");
        deviceField23.setLabelString("PV Name: ");
        deviceField23.setNumCols(20);
        deviceField23.setOffsetNid(137);
        deviceField23.setTextOnly(true);
        jPanel14.add(deviceField23);

        deviceChoice10.setChoiceIntValues(new int[] {0, -1});
        deviceChoice10.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice10.setConvert(true);
        deviceChoice10.setIdentifier("");
        deviceChoice10.setLabelString("Output: ");
        deviceChoice10.setOffsetNid(130);
        deviceChoice10.setUpdateIdentifier("");
        jPanel14.add(deviceChoice10);

        deviceField24.setIdentifier("");
        deviceField24.setLabelString("Seg. Len: ");
        deviceField24.setNumCols(6);
        deviceField24.setOffsetNid(131);
        jPanel14.add(deviceField24);

        jPanel5.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("PV11"));

        deviceField25.setIdentifier("");
        deviceField25.setLabelString("PV Name: ");
        deviceField25.setNumCols(20);
        deviceField25.setOffsetNid(149);
        deviceField25.setTextOnly(true);
        jPanel15.add(deviceField25);

        deviceChoice11.setChoiceIntValues(new int[] {0, -1});
        deviceChoice11.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice11.setConvert(true);
        deviceChoice11.setIdentifier("");
        deviceChoice11.setLabelString("Output: ");
        deviceChoice11.setOffsetNid(142);
        deviceChoice11.setUpdateIdentifier("");
        jPanel15.add(deviceChoice11);

        deviceField26.setIdentifier("");
        deviceField26.setLabelString("Seg. Len: ");
        deviceField26.setNumCols(6);
        deviceField26.setOffsetNid(143);
        jPanel15.add(deviceField26);

        jPanel5.add(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("PV12"));

        deviceField27.setIdentifier("");
        deviceField27.setLabelString("PV Name: ");
        deviceField27.setNumCols(20);
        deviceField27.setOffsetNid(161);
        deviceField27.setTextOnly(true);
        jPanel16.add(deviceField27);

        deviceChoice12.setChoiceIntValues(new int[] {0, -1});
        deviceChoice12.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice12.setConvert(true);
        deviceChoice12.setIdentifier("");
        deviceChoice12.setLabelString("Output: ");
        deviceChoice12.setOffsetNid(154);
        deviceChoice12.setUpdateIdentifier("");
        jPanel16.add(deviceChoice12);

        deviceField28.setIdentifier("");
        deviceField28.setLabelString("Seg. Len: ");
        deviceField28.setNumCols(6);
        deviceField28.setOffsetNid(155);
        jPanel16.add(deviceField28);

        jPanel5.add(jPanel16);

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("PV13"));

        deviceField29.setIdentifier("");
        deviceField29.setLabelString("PV Name: ");
        deviceField29.setNumCols(20);
        deviceField29.setOffsetNid(173);
        deviceField29.setTextOnly(true);
        jPanel17.add(deviceField29);

        deviceChoice13.setChoiceIntValues(new int[] {0, -1});
        deviceChoice13.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice13.setConvert(true);
        deviceChoice13.setIdentifier("");
        deviceChoice13.setLabelString("Output: ");
        deviceChoice13.setOffsetNid(166);
        deviceChoice13.setUpdateIdentifier("");
        jPanel17.add(deviceChoice13);

        deviceField30.setIdentifier("");
        deviceField30.setLabelString("Seg. Len: ");
        deviceField30.setNumCols(6);
        deviceField30.setOffsetNid(167);
        jPanel17.add(deviceField30);

        jPanel5.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("PV14"));

        deviceField31.setIdentifier("");
        deviceField31.setLabelString("PV Name: ");
        deviceField31.setNumCols(20);
        deviceField31.setOffsetNid(185);
        deviceField31.setTextOnly(true);
        jPanel18.add(deviceField31);

        deviceChoice14.setChoiceIntValues(new int[] {0, -1});
        deviceChoice14.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice14.setConvert(true);
        deviceChoice14.setIdentifier("");
        deviceChoice14.setLabelString("Output: ");
        deviceChoice14.setOffsetNid(178);
        deviceChoice14.setUpdateIdentifier("");
        jPanel18.add(deviceChoice14);

        deviceField32.setIdentifier("");
        deviceField32.setLabelString("Seg. Len: ");
        deviceField32.setNumCols(6);
        deviceField32.setOffsetNid(179);
        jPanel18.add(deviceField32);

        jPanel5.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("PV15"));

        deviceField33.setIdentifier("");
        deviceField33.setLabelString("PV Name: ");
        deviceField33.setNumCols(20);
        deviceField33.setOffsetNid(197);
        deviceField33.setTextOnly(true);
        jPanel19.add(deviceField33);

        deviceChoice15.setChoiceIntValues(new int[] {0, -1});
        deviceChoice15.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice15.setConvert(true);
        deviceChoice15.setIdentifier("");
        deviceChoice15.setLabelString("Output: ");
        deviceChoice15.setOffsetNid(190);
        deviceChoice15.setUpdateIdentifier("");
        jPanel19.add(deviceChoice15);

        deviceField34.setIdentifier("");
        deviceField34.setLabelString("Seg. Len: ");
        deviceField34.setNumCols(6);
        deviceField34.setOffsetNid(191);
        jPanel19.add(deviceField34);

        jPanel5.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("PV16"));

        deviceField35.setIdentifier("");
        deviceField35.setLabelString("PV Name: ");
        deviceField35.setNumCols(20);
        deviceField35.setOffsetNid(209);
        deviceField35.setTextOnly(true);
        jPanel20.add(deviceField35);

        deviceChoice16.setChoiceIntValues(new int[] {0, -1});
        deviceChoice16.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
        deviceChoice16.setConvert(true);
        deviceChoice16.setIdentifier("");
        deviceChoice16.setLabelString("Output: ");
        deviceChoice16.setOffsetNid(202);
        deviceChoice16.setUpdateIdentifier("");
        jPanel20.add(deviceChoice16);

        deviceField36.setIdentifier("");
        deviceField36.setLabelString("Seg. Len: ");
        deviceField36.setNumCols(6);
        deviceField36.setOffsetNid(203);
        jPanel20.add(deviceField36);

        jPanel5.add(jPanel20);

        jScrollPane1.setViewportView(jPanel5);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice10;
    private DeviceChoice deviceChoice11;
    private DeviceChoice deviceChoice12;
    private DeviceChoice deviceChoice13;
    private DeviceChoice deviceChoice14;
    private DeviceChoice deviceChoice15;
    private DeviceChoice deviceChoice16;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceChoice deviceChoice4;
    private DeviceChoice deviceChoice5;
    private DeviceChoice deviceChoice6;
    private DeviceChoice deviceChoice7;
    private DeviceChoice deviceChoice8;
    private DeviceChoice deviceChoice9;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField15;
    private DeviceField deviceField16;
    private DeviceField deviceField17;
    private DeviceField deviceField18;
    private DeviceField deviceField19;
    private DeviceField deviceField2;
    private DeviceField deviceField20;
    private DeviceField deviceField21;
    private DeviceField deviceField22;
    private DeviceField deviceField23;
    private DeviceField deviceField24;
    private DeviceField deviceField25;
    private DeviceField deviceField26;
    private DeviceField deviceField27;
    private DeviceField deviceField28;
    private DeviceField deviceField29;
    private DeviceField deviceField3;
    private DeviceField deviceField30;
    private DeviceField deviceField31;
    private DeviceField deviceField32;
    private DeviceField deviceField33;
    private DeviceField deviceField34;
    private DeviceField deviceField35;
    private DeviceField deviceField36;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
