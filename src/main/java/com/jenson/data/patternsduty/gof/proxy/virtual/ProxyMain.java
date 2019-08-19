package com.jenson.data.patternsduty.gof.proxy.virtual;

import java.util.ArrayList;
import java.util.List;

public class ProxyMain {

    public static void main(String[] args) {
        List<TextFile> textFiles = new ArrayList<>();

//        textFiles.addAll(TextFileProvider.getSecretTextFile(0,20));

        textFiles.addAll(TextFileProvider.getSecretTextFile(0,5));
        textFiles.addAll(TextFileProvider.getProxyTextFile(5,20));

        textFiles.stream().map(TextFile::fetch).forEach(System.out::println);

//        TextFileProvider.getSecretTextFile(0, 10)
//                .stream().map(TextFile::fetch).forEach(System.out::println);
//        TextFileProvider.getProxyTextFile(10, 20)
//                .stream().map(TextFile::fetch).forEach(System.out::println);

//        TextFile secretFile = new SecretTextFile("a");
//        System.out.println("secretFile : " + secretFile.fetch());

//        TextFile proxyFile = new ProxyTextFile("b");
//        System.out.println("proxyFile : " + proxyFile.fetch());
    }
}
