package com.dailycodebuffer.dcb.importer;

public class JavaCouplingApplication {

    public static void main(String[] args) {

        var jsonImporter = new JSONImporter();
        var importerService = new ImporterService(jsonImporter);
        importerService.importAll();

        var csvImporter = new CSVImporter();
        var importerService2 = new ImporterService(csvImporter);
        importerService2.importAll();
    }
}
