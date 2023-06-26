package bff.demo.kogito;

import java.util.Date;


public class BankTransaction {

   
    private String ID;
    private Date dataTransazione; 
    private Double importo; 
    private String nome; 
    private String cognome; 

    public BankTransaction(){}

    public BankTransaction(String ID, Date dataTransazione, Double importo, String nome, String cognome) {
        this.ID = ID;
        this.dataTransazione = dataTransazione;
        this.importo = importo;
        this.nome = nome;
        this.cognome = cognome;
    }


    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
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
        return "BankTransaction [ID=" + ID + ", dataTransazione=" + dataTransazione + ", importo=" + importo + ", nome="
                + nome + ", cognome=" + cognome + "]";
    }


}
