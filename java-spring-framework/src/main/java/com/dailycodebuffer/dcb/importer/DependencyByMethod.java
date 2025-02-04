package com.dailycodebuffer.dcb.importer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DependencyByMethod {

    public DependencyByMethod() {
        System.out.println("DependencyByMethod Init");
    }

    public BaseImporter baseImporter;

    @Autowired
    @Qualifier("jsonImporter")
    public void setImporter(BaseImporter baseImporter) {  // Dependency Injection using Method - @Autowired
        this.baseImporter = baseImporter;
    }

    public void importAll() {
        System.out.println("Importing File using importer" + baseImporter);
        baseImporter.getHeaders();
        baseImporter.importFile();
    }
}
