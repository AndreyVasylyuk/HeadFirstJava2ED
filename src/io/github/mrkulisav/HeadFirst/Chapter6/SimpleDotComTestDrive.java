package io.github.mrkulisav.HeadFirst.Chapter6;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("2");
        arr.add("3");
        arr.add("4");
        
        dot.setLocationCells(arr);
        
        dot.checkYourself("1");
        dot.checkYourself("2");
        dot.checkYourself("3");
        
    }

}
