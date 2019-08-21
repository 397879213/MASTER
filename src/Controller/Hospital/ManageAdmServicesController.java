/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.ManageAdmServices;
import Handler.Hospital.ManageAdmServicesHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class ManageAdmServicesController {

    ManageAdmServicesHandler hdlManageAdmServices = new ManageAdmServicesHandler();

    public List<ManageAdmServices> selectPatientAdmissions(String patientId) {
        return hdlManageAdmServices.selectPatientAdmissions(patientId);
    }

    public List<ManageAdmServices> selectAdmissionWiseServices(String patientId,
            String admissionNo) {
        return hdlManageAdmServices.selectAdmissionWiseServices(patientId, admissionNo);
    }

    public List<ManageAdmServices> selectPatientInvoices(String patientId,
            String admissionNo) {
        return hdlManageAdmServices.selectPatientInvoices(patientId, admissionNo);
    }

    public List<ManageAdmServices> selectInvoiceDetail(String invoiceNo) {
        return hdlManageAdmServices.selectInvoiceDetail(invoiceNo);
    }

    public boolean updateAdmissionNo(ManageAdmServices objRv) {
        String[] table = {"INVOICE_MASTER", "PATHOLOGY_RESULT_MASTER"};
        boolean ret = true;
        for (int i = 0; i < table.length; i++) {
            ret = hdlManageAdmServices.updateAdmissionNo(objRv, table[i]);
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
        }
        return ret;
    }
    
    public boolean updateAdmissionDiagnisisRemarks(ManageAdmServices objRv) {
        boolean ret = hdlManageAdmServices.updateAdmissionDiagnisisRemarks(objRv);
            if (ret) {
                Constants.dao.commitTransaction();
            }
            if (!ret) {
                Constants.dao.rollBack();
            }
            return ret;
    }
}
