/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.time.Clock;
import java.util.Scanner;
import model.CurrentWeatherReport;
import model.WeatherRequest;
import reporitory.WeatherRepository;
import utility.Constants;

/**
 *
 * @author Kairit
 */
public class Console {
    public static void main(String[] args) throws Exception{
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Sisesta linnanimi ja kood formaadis Linn,KOOD");
    String userInput = sc.nextLine();
    String[] nameAndCode = userInput.split(",");
    String cityName = nameAndCode[0];
    String countryCode = nameAndCode[1];
    WeatherRequest wr = new WeatherRequest(cityName,countryCode, Constants.UNIT.metric);
    CurrentWeatherReport cw = new WeatherRepository().getCurrentWeather(wr);
    System.out.println(cw.toString());
    sc.close();
}
    
}
