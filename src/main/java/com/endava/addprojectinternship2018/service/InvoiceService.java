package com.endava.addprojectinternship2018.service;

import com.endava.addprojectinternship2018.dao.InvoiceDao;
import com.endava.addprojectinternship2018.model.Invoice;
import com.endava.addprojectinternship2018.model.Enums.InvoiceStatus;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;

    public Invoice getInvoiceById(int id) {
        return invoiceDao.findById(id);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceDao.findAll();
    }

    public List<Invoice> getAllInvoiceByContract(int id) {
        return invoiceDao.findByContractId(id);
    }

    public List<Invoice> getAllInvoicesByStatus(InvoiceStatus status) {
        return invoiceDao.findAllByStatus(status);
    }

    public List<Invoice> getAllInvoicesByIssueDate(LocalDate localDate) {
        return invoiceDao.findAllByIssueDate(localDate);
    }

    public List<Invoice> getAllInvoicesByDueDate(LocalDate localDate) {
        return invoiceDao.findAllByDueDate(localDate);
    }

    public List<Invoice> getInvoicesByCustomerId(int id) {
        return invoiceDao.findAllByContractCustomerId(id);
    }

}
