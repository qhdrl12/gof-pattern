package com.jenson.data.patternsduty.gof.proxy.virtual;

/**
 * Proxy
 * 1. 객체 생성에서는 별 다른 동작을 하지않음.
 * 2. 실제 데이터를 가져와야할 때 SecretTextFile 객체를 생성하고, 기능을 위임함
 */
public class ProxyTextFile implements TextFile {
    private String fileName;
    private TextFile textFile;

    public ProxyTextFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String fetch() {
        if (textFile == null) {
            textFile = new SecretTextFile(fileName);
        }
        return "[PROXY]" + textFile.fetch();
    }
}
