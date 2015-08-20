package cc150;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by xianyu.hxy on 2015/8/11.
 */
public class test {
    public static void main(String[] args){
        File file=new File("E:"+File.separator+"test"+File.separator+"hxy"+File.separator+"hxy");
        if(file.exists()){
            file.delete();
        }

        }
    }

