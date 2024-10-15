

package Documents.creators;

import documents.Document;
import documents.types.Report;


class ReportCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new Report();
    }
}