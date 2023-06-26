package bff.demo.kogito.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import bff.demo.kogito.BankTransaction;
import bff.demo.kogito.Invoice;

@ApplicationScoped
public class BankTransactionsService {


    public List<BankTransaction> getMovimentiBancari(Invoice invoice){

        List<BankTransaction> transazioni = new ArrayList<BankTransaction>();

        BankTransaction TransUno;
        BankTransaction TransDue;
        BankTransaction TransTre;

        System.out.println("Dentro al servizio : \n nome : " + invoice.getNome() + " cognome " +invoice.getCognome() );

            if(invoice.getNome().equals("Chiara") && invoice.getCognome().equals( "Venneri")){
            TransUno = new BankTransaction("1",new Date(), 100.00, invoice.getNome(), invoice.getCognome());
            TransDue = new BankTransaction("2",new Date(), 1000.00, invoice.getNome(), invoice.getCognome());
            TransTre = new BankTransaction("3",new Date(), 600.00, invoice.getNome(), invoice.getCognome());
            } else {
                TransUno = new BankTransaction("1",new Date(), 300.00, invoice.getNome(), invoice.getCognome());
                TransDue = new BankTransaction("2",new Date(), 400.00, invoice.getNome(), invoice.getCognome());
                TransTre = new BankTransaction("3",new Date(), 3100.00, invoice.getNome(), invoice.getCognome());
            }

         

        transazioni.add(TransUno);
        transazioni.add(TransDue);
        transazioni.add(TransTre);


        System.out.print("DENTRO AL SERVIZIO:  " + transazioni.toString());

        return transazioni;

    }

}
