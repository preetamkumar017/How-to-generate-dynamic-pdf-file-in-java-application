import java.awt.Font;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
  
import com.itextpdf.text.Anchor;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.DocumentException;  
import com.itextpdf.text.FontFactory;  
import com.itextpdf.text.PageSize;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.CMYKColor;  
import com.itextpdf.text.pdf.PdfWriter;  
  
  
public class pdfFile {  
   public static void main(String arg[]) throws FileNotFoundException, DocumentException  
   {  
    Document document = new Document(PageSize.A4, 50, 50, 50, 50);  
    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\Java Setup\\ITextTest.pdf"));  
               
            document.open();  
          
              Paragraph paragraph1 = new Paragraph();  
           
              paragraph1.setSpacingBefore(100);  
           
          
              document.add(paragraph1);  
           
        document.add(new Paragraph("Somejghj more text on the first page with different color and font type.",   
           
        FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0))));  
         document.close();   
   }  
}  
