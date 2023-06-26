package bff.demo.kogito;

public class InvoiceInstance {

    private Invoice invoice;
    private String idInvoice; 

    public InvoiceInstance() {}

    public InvoiceInstance(Invoice invoice, String idInvoice) {
        this.invoice = invoice;
        this.idInvoice = idInvoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    @Override
    public String toString() {
        return "InvoiceInstance [invoice=" + invoice + ", idInvoice=" + idInvoice + "]";
    }

    
    
}
