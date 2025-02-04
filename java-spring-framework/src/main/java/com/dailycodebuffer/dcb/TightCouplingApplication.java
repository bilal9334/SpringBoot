package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.importer.CSVImporter;
import com.dailycodebuffer.dcb.importer.ImporterService;
import com.dailycodebuffer.dcb.importer.JSONImporter;

public class TightCouplingApplication {

    public static void main(String[] args) {
        var csvImporter = new CSVImporter();

        var jsonImporter = new JSONImporter();

        var importerService = new ImporterService(jsonImporter);
        importerService.importAll();
    }
}
