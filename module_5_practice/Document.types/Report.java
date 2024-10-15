

package Documents.types;

import documents.Document;




class Report implements Document {
    @Override
    public void open() {
        System.out.println("Opening a report document.");
    }
}