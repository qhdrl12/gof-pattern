package com.jenson.data.patternsduty.gof.proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReportGeneratorClient {

    public static void main(String[] args) {
        new ReportGeneratorClient().generatorReport();
    }

    public void generatorReport() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            ReportGenerator reportGenerator = (ReportGenerator) registry.lookup("RemoteGenerator");
            String response = reportGenerator.generateDailyReport();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
