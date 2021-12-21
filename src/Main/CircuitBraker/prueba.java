package Main.CircuitBraker;

public class prueba {
	
	private Double IntentosFallidos;
	private Double IntentosTotal;
	private float LimiteError;
	private Integer IntentosMax;
	private Integer IntentosActual;
	
	
	
	public prueba(Double intentosFallidos, Double intentosTotal, float limiteError, Integer IntentosMax, Integer IntentosActual) {
		super();
		this.IntentosFallidos = intentosFallidos;
		this.IntentosTotal = intentosTotal;
		this.LimiteError = limiteError;
	}
	
	public String getEstado() {
		Double Total = IntentosFallidos + IntentosTotal;
		Double fallos = (IntentosFallidos*100) / Total;
		if(fallos>=LimiteError)
			if(IntentosActual<IntentosMax)
				return "Half-open";
			else
				return "open";		
		return "close";
	}
	
	
	
}
