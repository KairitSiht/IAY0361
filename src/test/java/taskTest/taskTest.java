/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskTest;

import Exceptions.WeatherReportNotFoundException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import model.WeatherRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import sun.applet.Main;
import task.WeatherInfoFile;
import utility.Constants;

/**
 *
 * @author Kairit
 */
public class taskTest {
    private static WeatherRequest request;
    
    public taskTest() {
    }
    @BeforeAll
    public static void setUpAllTests(){
        request = new WeatherRequest("Tallinn", "EE", Constants.UNIT.metric);
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  /*  @Test
    public void testConsoleMain() throws Exception{
        //https://www.noppanit.com/how-to-use-junit-to-test-java-command-line-program/
        String data = "Tallinn,EE";
        InputStream stdin = System.in;
            try{
                
                    System.setIn(new ByteArrayInputStream(data.getBytes()));
                    Scanner sc = new Scanner(System.in);
                    String userInput = sc.nextLine();
                    String[] nameAndCode = userInput.split(",");
                    String cityName = nameAndCode[0];
                    String countryCode = nameAndCode[1];
                    //WeatherRequest(cityName,countryCode, Constants.UNIT.metric);
            }
            finally
            {
                    System.setIn(stdin);
            }

    }*/
    //https://stackoverflow.com/questions/36349827/testing-main-method-by-junit
    @Test
    public void testMain() throws IOException, FileNotFoundException, WeatherReportNotFoundException {
        System.out.println("main");
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream
                (new File("C:/Users/Kairit/Desktop/Automatic-Testing/files/input.txt"));
        System.setIn(fips);
      //  Main.main(args);
        WeatherInfoFile.main(args);
        System.setIn(original);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. 

}
