package histogram;

import histogram.view.MailListReader;
import histogram.view.MailHistogramBuilder;
import histogram.model.Histogram;
import histogram.view.HistogramDisplay;
import histogram.model.Mail;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        String fileName = "mail.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);

        new HistogramDisplay("HISTOGRAM", histogram).execute();
    }
    
}
