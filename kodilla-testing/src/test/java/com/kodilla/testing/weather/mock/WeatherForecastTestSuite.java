package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class WeatherForecastTestSuite {
    @Test
    public void testCalculateFoecastWithMock(){
        //G
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<Integer, Double>();
        temperaturesMap.put(0, 25.5);
        temperaturesMap.put(1, 26.2);
        temperaturesMap.put(2, 24.8);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 27.0);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //W
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //T
        Assert.assertEquals(5, quantityOfSensors);
    }
}
