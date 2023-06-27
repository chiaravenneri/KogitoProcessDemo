package bff.demo.kogito;

import java.util.Date;


public class BankTransaction {

   
    private String transactionId;
    private Date dataTransazione; 
    private Double importo; 
    private String nome; 
    private String cognome; 

    public BankTransaction(){}

    public BankTransaction(String transactionId, Date dataTransazione, Double importo, String nome, String cognome) {
        this.transactionId = transactionId;
        this.dataTransazione = dataTransazione;
        this.importo = importo;
        this.nome = nome;
        this.cognome = cognome;
    }


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
    
    public Date getDataTransazione() {
        return dataTransazione;
    }

    public void setDataTransazione(Date dataTransazione) {
        this.dataTransazione = dataTransazione;
    }
    
    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "BankTransaction [transactionId=" + transactionId + ", dataTransazione=" + dataTransazione + ", importo="
                + importo + ", nome=" + nome + ", cognome=" + cognome + "]";
    }



}
