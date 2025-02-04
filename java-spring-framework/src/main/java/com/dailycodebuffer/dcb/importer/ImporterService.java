package com.dailycodebuffer.dcb.importer;

public class ImporterService {

    private BaseImporter importer;

    public ImporterService(BaseImporter importer) {
        this.importer = importer;
    }

    public void importAll() {
        System.out.println("Importing File using importer" + importer);
        importer.getHeaders();
        importer.importFile();
    }
}
