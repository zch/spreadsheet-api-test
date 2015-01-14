package com.vaadin;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;

public class ChangeCellStyling extends AbstractTab {

    public ChangeCellStyling() {
        Cell cell = spreadsheet.createCell(0, 0, "");
        //cell = spreadsheet.getCell(0,0);
        cell.setCellValue("foo bar baz");

//        Cell cell2 = spreadsheet.getCell("A1");
        Cell cell3 = spreadsheet.getCell(0, 0);

        Font font = spreadsheet.getWorkbook().createFont();
        font.setItalic(true);
        font.setColor(Font.COLOR_RED);
        cell.getCellStyle().setFont(font);

        spreadsheet.markCellAsUpdated(cell, true);
        spreadsheet.updateMarkedCells(); // should happen in beforeClientResponse
//        spreadsheet.refreshCell(cell);
//        spreadsheet.refreshCells(cell1, cell2, cell3);
//        spreadsheet.refreshCells(Arrays.asList(cell,cell2,cell3));

        // Currently this is needed to get the style changes visible :(
        // markCellAsUpdated doesn't update it.
        spreadsheet.resetSpreadsheetFromData();
//        spreadsheet.reload();  // rename to this.
    }
}
