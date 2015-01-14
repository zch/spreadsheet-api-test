package com.vaadin;

import com.vaadin.addon.spreadsheet.Spreadsheet;
import com.vaadin.ui.VerticalLayout;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

public class OpenAndSaveXLSXInSpreadsheet extends AbstractTab {

    public OpenAndSaveXLSXInSpreadsheet() {
        try {
            File file = new File(this.getClass().getResource("example.xlsx").toURI());
            InputStream url = new URL("http://localhost:8080/example.xlsx");

//            spreadsheet.read(file);

            // Add a second spreadsheet.
            Spreadsheet sheet2 = new Spreadsheet();
//            sheet2.read(stream);
            addComponent(sheet2);

            // And a third
            Spreadsheet sheet3 = new Spreadsheet(file);
            addComponent(sheet3);

            // And a fourth
//            sheet4 = new Spreadsheet(stream);
//            addComponent(sheet4);

//            sheet4.write(new File("/tmp/foo.xslx"));
//            sheet4.write(stream);
        } catch (InvalidFormatException e) { // WE DON'T WANT TO HANDLE THIS (rethrow as ioexception)
            e.printStackTrace();
        } catch (IOException e) { // ONLY WANT TO HANDLE THIS
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
