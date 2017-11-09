/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

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

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        String cityName = sc.nextLine();
        WeatherRequest wr = new WeatherRequest(cityName, Constants.COUNTRY_CODE.EE, Constants.UNIT.metric);
        CurrentWeatherReport cw = new WeatherRepository().getCurrentWeather(wr);
        System.out.println(cw.toString());
}
    
}
