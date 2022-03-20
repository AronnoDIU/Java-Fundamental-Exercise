package ObjectOrientedConcept.SOLIDprinciple.DependencyInversionPrinciple.Solution;

import java.util.Arrays;

/**
 * 
 * @author Aronno
 *
 */
public class WeatherAggregator {

	private WeatherSource[] weatherSources;

	public WeatherAggregator(WeatherSource[] weatherSources) {
		this.weatherSources = weatherSources;
	}

	public double getTemperature() {
		return Arrays.stream(weatherSources).mapToDouble(WeatherSource::getTemperatureCelcius).average().getAsDouble();
	}

}