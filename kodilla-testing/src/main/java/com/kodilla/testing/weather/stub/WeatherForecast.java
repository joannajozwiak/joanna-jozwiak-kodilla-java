package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast<field> {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemp () {
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum = temperature.getValue() + sum;
        }
        double average = sum / temperatures.getTemperatures().size();
        return average;
    }

    public double median () {

        List<Double> tempValues= new ArrayList<Double>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
                tempValues.add(temperature.getValue());
        }

        Collections.sort(tempValues);

        double mediana =0.0;
        double avg =0.0;

        if (tempValues.size() % 2 == 0 )
        {
            avg = tempValues.get(tempValues.size()/2) + tempValues.get(tempValues.size()/2-1);

            mediana = avg/2.0;

        }
        else {
            mediana = tempValues.get(tempValues.size()/2);
        }

        return mediana;

    }
}
