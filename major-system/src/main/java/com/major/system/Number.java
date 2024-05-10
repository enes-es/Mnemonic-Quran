package com.major.system;
public class Number extends MnemonicElement {
    
    Number(Integer number, String mnemonicString) {
        super(number, mnemonicString);
    }

    Number(Integer number) {
        super(number);
    }

    @Override
    Integer getElementData() {
        return (Integer) elementData;
    }
    

}
