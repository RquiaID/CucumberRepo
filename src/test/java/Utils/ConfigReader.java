package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

   static Properties prop;

    public static Properties readProperties(){   // this method should return properties

        try {
            FileInputStream file=new FileInputStream(Constants.PROPERTY_FILE_PATH);
            prop = new Properties();
            prop.load(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

    public static String getPropertyValue(String propKey){ // I am expecting the value in here
        // the name of the method to get the value is getProperty(); which will give a String value ,so I have to call my method public static String nameOfMyMethod(){}
        return prop.getProperty(propKey);


    }
}
