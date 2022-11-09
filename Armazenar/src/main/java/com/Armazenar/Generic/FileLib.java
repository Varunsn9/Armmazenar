package com.Armazenar.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class FileLib extends BaseClass{

public String propertyFile(WebDriver driver, String Stringdata) throws IOException {
FileInputStream fis=new FileInputStream("./src/main/resources/PropertyFile.property");
Properties p=new Properties();
p.load(fis);
String data=p.getProperty(Stringdata);
return data;
}
}
