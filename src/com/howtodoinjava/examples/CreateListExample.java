package com.howtodoinjava.examples;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.GreekList;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import org.omg.CORBA.Environment;

import static com.howtodoinjava.examples.Utils.getAccountsCell;
import static com.howtodoinjava.examples.Utils.getAccountsCellR;
import static com.howtodoinjava.examples.Utils.getBillHeaderCell;
import static com.howtodoinjava.examples.Utils.getBillRowCell;
import static com.howtodoinjava.examples.Utils.getIRDCell;
import static com.howtodoinjava.examples.Utils.getIRHCell;
import static com.howtodoinjava.examples.Utils.getValidityCell;
import static com.howtodoinjava.examples.Utils.getdescCell;

public class CreateListExample {
	public static void main(String[] args) {
		Document document = new Document();
       try {
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("AddTableExample.pdf"));
		    document.open();
            PdfPTable irdTable = new PdfPTable(2);
            irdTable.addCell(getIRDCell("Invoice No"));
            irdTable.addCell(getIRDCell("Invoice Date"));
            irdTable.addCell(getIRDCell("XE1234")); // pass invoice number
            irdTable.addCell(getIRDCell("13-Mar-2016")); // pass invoice date

            PdfPTable irhTable = new PdfPTable(3);
            irhTable.setWidthPercentage(100);

            irhTable.addCell(getIRHCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIRHCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIRHCell("Invoice", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIRHCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIRHCell("", PdfPCell.ALIGN_RIGHT));
            PdfPCell invoiceTable = new PdfPCell(irdTable);
            invoiceTable.setBorder(0);
            irhTable.addCell(invoiceTable);

            FontSelector fs = new FontSelector();
            Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 13, Font.BOLD);
            fs.addFont(font);
            Phrase bill = fs.process("Bill To"); // customer information
            Paragraph name = new Paragraph("Mr.Venkateswara Rao");
            name.setIndentationLeft(20);
            Paragraph contact = new Paragraph("9652886877");
            contact.setIndentationLeft(20);
            Paragraph address = new Paragraph("Kuchipudi,Movva");
            address.setIndentationLeft(20);

            PdfPTable billTable = new PdfPTable(6); //one page contains 15 records
            billTable.setWidthPercentage(100);
            billTable.setWidths(new float[] { 1, 2,5,2,1,2 });
            billTable.setSpacingBefore(30.0f);
            billTable.addCell(getBillHeaderCell("Index"));
            billTable.addCell(getBillHeaderCell("Item"));
            billTable.addCell(getBillHeaderCell("Description"));
            billTable.addCell(getBillHeaderCell("Unit Price"));
            billTable.addCell(getBillHeaderCell("Qty"));
            billTable.addCell(getBillHeaderCell("Amount"));

            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("Mobile"));
            billTable.addCell(getBillRowCell("Nokia Lumia 610 \n IMI:WQ361989213 "));
            billTable.addCell(getBillRowCell("12000.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("12000.0"));

            billTable.addCell(getBillRowCell("2"));
            billTable.addCell(getBillRowCell("Accessories"));
            billTable.addCell(getBillRowCell("Nokia Lumia 610 Panel \n Serial:TIN3720 "));
            billTable.addCell(getBillRowCell("200.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("200.0"));


            billTable.addCell(getBillRowCell("3"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("4"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("5"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("6"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("7"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("8"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("9"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("10"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("11"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("12"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("13"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("14"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("15"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("16"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("17"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));

            billTable.addCell(getBillRowCell("18"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("19"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));


            billTable.addCell(getBillRowCell("20"));
            billTable.addCell(getBillRowCell("Other"));
            billTable.addCell(getBillRowCell("16Gb Memorycard \n Serial:UR8531 "));
            billTable.addCell(getBillRowCell("420.0"));
            billTable.addCell(getBillRowCell("1"));
            billTable.addCell(getBillRowCell("420.0"));



            PdfPTable validity = new PdfPTable(1);
            validity.setWidthPercentage(100);
            validity.addCell(getValidityCell(" "));
            validity.addCell(getValidityCell("Warranty"));
            validity.addCell(getValidityCell(" * Products purchased comes with 1 year national warranty \n   (if applicable)"));
            validity.addCell(getValidityCell(" * Warranty should be claimed only from the respective manufactures"));
            PdfPCell summaryL = new PdfPCell (validity);
            summaryL.setColspan (3);
            summaryL.setPadding (1.0f);
            billTable.addCell(summaryL);

            PdfPTable accounts = new PdfPTable(2);
            accounts.setWidthPercentage(100);
            accounts.addCell(getAccountsCell("Subtotal"));
            accounts.addCell(getAccountsCellR("12620.00"));
            accounts.addCell(getAccountsCell("Discount (10%)"));
            accounts.addCell(getAccountsCellR("1262.00"));
            accounts.addCell(getAccountsCell("Tax(2.5%)"));
            accounts.addCell(getAccountsCellR("315.55"));
            accounts.addCell(getAccountsCell("Total"));
            accounts.addCell(getAccountsCellR("11673.55"));
            PdfPCell summaryR = new PdfPCell (accounts);
            summaryR.setColspan (3);
            billTable.addCell(summaryR);

            PdfPTable describer = new PdfPTable(1);
            describer.setWidthPercentage(100);
            describer.addCell(getdescCell(" "));
            describer.addCell(getdescCell("Goods once sold will not be taken back or exchanged || Subject to product justification || Product damage no one responsible || "
                    + " Service only at concarned authorized service centers"));

            document.open();//PDF document opened........

           // document.add(image);
            document.add(irhTable);
            document.add(bill);
            document.add(name);
            document.add(contact);
            document.add(address);
            document.add(billTable);
            document.add(describer);


            document.close();

            writer.close();

          //  Toast.makeText(getApplicationContext(),"Pdf Created Successfully",Toast.LENGTH_SHORT).show();

            System.out.println("Pdf created successfully..");

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
