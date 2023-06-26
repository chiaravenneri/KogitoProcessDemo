package bff.demo.kogito;

import java.util.Date;


public class Invoice {

   
    private String progressivoFattura; 
    private Date dataEmissione; 
    private Double importo;
    private String nome; 
    private String cognome; 
    private String partitaIVA;
    private String statoFattura;




    public Invoice() {}
    
    public Invoice(String progressivoFattura, Date dataEmissione, Double importo, String nome, String cognome,
            String statoFattura) {
        this.progressivoFattura = progressivoFattura;
        this.dataEmissione = dataEmissione;
        this.importo = importo;
        this.nome = nome;
        this.cognome = cognome;
        this.statoFattura = statoFattura;
    }
    
    public String getProgressivoFattura() {
        return progressivoFattura;
    }
    public void setProgressivoFattura(String progressivoFattura) {
        this.progressivoFattura = progressivoFattura;
    }
    
    public Date getDataEmissione() {
        return dataEmissione;
    }
    public void setDataEmissione(Date dataEmissione) {
        this.dataEmissione = dataEmissione;
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
    
    public String getPartitaIVA() {
        return partitaIVA;
    }
    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }
    
    public String getStatoFattura() {
        return statoFattura;
    }
    public void setStatoFattura(String statoFattura) {
        this.statoFattura = statoFattura;
    }

    @Override
    public String toString() {
        return "Invoice [progressivoFattura=" + progressivoFattura + ", dataEmissione=" + dataEmissione + ", importo="
                + importo + ", nome=" + nome + ", cognome=" + cognome + ", partitaIVA=" + partitaIVA + ", statoFattura=" + statoFattura + "]";
    } 
    


    
}
