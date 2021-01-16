package _15JavaApplicationPerformanceAndMemoryManagement._2JITCompliation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Price implements Iterable<Double> {

	private Map<String, Double> rates;
	private Double value;

	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String, Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}

	public Double convert(String toCurrency) {
		if (toCurrency.equals("USD")) {
			return value;
		} else {
			Double conversion = rates.get("USD") * rates.get(toCurrency);
			//value = conversion * value;
			//return value;
			return conversion * value;
		}
	}

	public String toString() {
		return this.value.toString();
	}

	public Map<String, Double> getRates() {
		// return rates;
		// return new HashMap<String,Double>(this.rates);
		// return new HashMap<>(this.rates);
		return Collections.unmodifiableMap(this.rates);

	}

	@Override
	public Iterator<Double> iterator() {
		return this.rates.values().iterator();
	}

}
