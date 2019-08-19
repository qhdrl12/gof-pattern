package com.jenson.data.patternsduty.gof.proxy.virtual;

/**
 * RealSubject
 * 1. 생성 비용이 몹시큰 객체로 가정
 * 2. 해당 객체는 수정할 권한이 없음
 */
public class SecretTextFile implements TextFile {
    private String plainText;

    public SecretTextFile(String plainText) {
        this.plainText = SecretFileHolder.decodeFileName(plainText);
    }

    @Override
    public String fetch() {
        return this.plainText;
    }
}
