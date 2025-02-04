package com.dailycodebuffer.dcb.importer;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ImporterService {

    private BaseImporter importer;

    public ImporterService(BaseImporter importer) {
        this.importer = importer;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing Data for ImporterService");
        System.out.println("Is Base Importer Null ?" + (importer == null));
    }

    public void importAll() {
        System.out.println("Importing File using importer" + importer);
        importer.getHeaders();
        importer.importFile();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying the ImporterService Bean");
    }
}
