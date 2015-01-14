package com.vaadin;

public class ProtectedSheets extends AbstractTab {

    public ProtectedSheets() {
//        spreadsheet.addProtectedEditListener(new ProtectedEditListener() {
//            @Override
//            public void writeAttempted(ProtectedEditEvent event) {
//                Cell cell = event.getCell();
//                Notification.show("Tried to edit protected cell at " + cell.getRowIndex() + ", " + cell.getColumnIndex());
//            }
//        });
        spreadsheet.setSheetProtected(0, "passw0rd");
//        spreadsheet.isSheetProtected(0);
        spreadsheet.setActiveSheetProtected("passw0rd");
//        spreadsheet.isActiveSheetProtected();
    }
}
