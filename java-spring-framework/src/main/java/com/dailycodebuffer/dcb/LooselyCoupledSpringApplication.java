package com.dailycodebuffer.dcb;

import com.dailycodebuffer.dcb.importer.ImporterService;
import com.dailycodebuffer.dcb.importer.SpringImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LooselyCoupledSpringApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringImportConfig.class);

        ImporterService importerService = context.getBean(ImporterService.class);
        importerService.importAll();

        ImporterService jsonImporterService = (ImporterService) context.getBean("jsonImporterService");
        jsonImporterService.importAll();

    }
}
