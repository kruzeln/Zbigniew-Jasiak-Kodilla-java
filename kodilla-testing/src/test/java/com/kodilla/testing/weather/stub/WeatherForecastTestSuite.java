package com.kodilla.testing.weather.stub;
import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //G
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

         //W
         int quantityOfSensors = weatherForecast.calculateForecast().size();

         //T
            Assert.assertEquals(4, quantityOfSensors);


    }
}
