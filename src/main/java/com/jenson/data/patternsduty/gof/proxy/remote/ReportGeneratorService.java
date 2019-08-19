package com.jenson.data.patternsduty.gof.proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;

public class ReportGeneratorService implements ReportGenerator {

    protected ReportGeneratorService() {

    }

    @Override
    public String generateDailyReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report********************");
        sb.append("\\n Location ID: 012");
        sb.append("\\n Today's Date: "+ LocalDateTime.now());
        sb.append("\\n Total Pizza's Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("\\n ***************************************************************");
        return sb.toString();
    }

    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGeneratorService();
        try {
            ReportGenerator stub = (ReportGenerator) UnicastRemoteObject.exportObject(reportGenerator, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("RemoteGenerator", stub);
            System.out.println("Server is online now");
//            Naming.rebind("RemoteGenerator", reportGenerator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
