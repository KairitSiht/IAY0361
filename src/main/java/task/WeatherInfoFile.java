/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import Exceptions.WeatherReportNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.CurrentWeatherReport;
import model.WeatherRequest;
import reporitory.WeatherRepository;
import utility.Constants;

/**
 *
 * @author Kairit
 */
public class WeatherInfoFile {

    public static final String input = ("C:/Users/Kairit/Desktop/Automatic-Testing/files/input.txt");
    private static final String output = ("C:/Users/Kairit/Desktop/Automatic-Testing/files/output.txt");
    public static void main(String[] args) throws FileNotFoundException, IOException, WeatherReportNotFoundException {
        
        FileReader in = new FileReader(input);
        BufferedReader br = new BufferedReader(in);
        String cityName = br.readLine();
        WeatherRequest wr = new WeatherRequest(cityName, Constants.COUNTRY_CODE.EE, Constants.UNIT.metric);
        CurrentWeatherReport cw = new WeatherRepository().getCurrentWeather(wr);
        System.out.println(cw.toString());

        BufferedWriter bw = null;
        FileWriter fw = null;
        fw = new FileWriter(output);
            bw = new BufferedWriter(fw);
            bw.write(cw.toString());
        if (bw != null){
            System.out.println("Done");
            bw.close();
        }
        if (fw != null)
            fw.close();

    }
}
    

