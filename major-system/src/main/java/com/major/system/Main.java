package com.major.system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//objectmapper import
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws IOException{
        FileWriter testFile = new FileWriter("/home/perseverance/Memorize Quran/Major System/test.json", true);
        BufferedWriter bufferedwriter = new BufferedWriter(testFile);
        PrintWriter printWriter = new PrintWriter(bufferedwriter);
        
        ObjectMapper objectMapper = new ObjectMapper();

        
        Number myNumber = new Number(1, "tea");
        
        Car fastCar = new Car("911", "Porsche");

        System.out.println(objectMapper.writeValueAsString(fastCar));


        printWriter.close();
    }


}