package com.major.system;
import java.util.ArrayList;
import java.util.Date;

public abstract class MnemonicElement {
    
    Object elementData;
    String mnemonic;
    ArrayList<Log> memoryLogs;

    void doPractice() {}

    MnemonicElement(Object targetElement, String mnemonic) {
        elementData = targetElement;
        this.mnemonic = mnemonic;
        memoryLogs = new ArrayList<Log>();
    }
    
    MnemonicElement(Object targetElement) {
        elementData = targetElement;
        mnemonic = null;
        memoryLogs = null;
    }

    abstract Object getElementData();

    

    private class Log {
        Date date;
        Boolean isCorrect;
        Log(Date date, Boolean isCorrect) {
            this.date = date;
            this.isCorrect = isCorrect;
        }
    }
    
}
