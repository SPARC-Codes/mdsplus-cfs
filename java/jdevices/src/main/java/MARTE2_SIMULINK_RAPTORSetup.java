/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdsplus
 */
public class MARTE2_SIMULINK_RAPTORSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_SIMULINK_RAPTORSetup
     */
    public MARTE2_SIMULINK_RAPTORSetup() {
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
        deviceField1 = new DeviceField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        deviceInputs1 = new DeviceInputs();
        deviceOutputs1 = new DeviceOutputs();
        deviceParameters1 = new DeviceParameters();

        setDeviceProvider("spilds:8100");
        setDeviceTitle("MARTe2 RAPTOR");
        setDeviceType("MARTE2_SIMULINK_RAPTOR");
        setHeight(800);
        setUpdateEvent("");
        setWidth(800);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Timebase: ");
        deviceField1.setNumCols(20);
        deviceField1.setOffsetNid(3);
        jPanel2.add(deviceField1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        deviceInputs1.setOffsetNid(449);
        jTabbedPane1.addTab("Inputs", deviceInputs1);

        deviceOutputs1.setOffsetNid(1250);
        jTabbedPane1.addTab("Outputs", deviceOutputs1);

        deviceParameters1.setNumParameters(144);
        deviceParameters1.setOffsetNid(4);
        deviceParameters1.setParameterOffset(4);
        jTabbedPane1.addTab("Parameters", deviceParameters1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField1;
    private DeviceInputs deviceInputs1;
    private DeviceOutputs deviceOutputs1;
    private DeviceParameters deviceParameters1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
