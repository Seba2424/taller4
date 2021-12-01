package modelo;

public class Desastre {
	private long _id;
	private String _nombre;
	private int _cantidad;
	private int _topeCantidadDePersonasAfectadas;
	private int _topeCantidadImpactoEconomico;
	private int _añoTopeDeCantidad;
	private int _añoTopeDePersonasAfectadas;
	private int _añoTopeDeImpactosEconomicos;
	private long _contador;

	public long getId() {
		return this._id;
	}

	public void setId(long aId) {
		this._id = aId;
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public int getCantidad() {
		return this._cantidad;
	}

	public void setCantidad(int aCantidad) {
		this._cantidad = aCantidad;
	}

	public int getTopeCantidadDePersonasAfectadas() {
		return this._topeCantidadDePersonasAfectadas;
	}

	public void setTopeCantidadDePersonasAfectadas(int aTopeCantidadDePersonasAfectadas) {
		this._topeCantidadDePersonasAfectadas = aTopeCantidadDePersonasAfectadas;
	}

	public int getTopeCantidadImpactoEconomico() {
		return this._topeCantidadImpactoEconomico;
	}

	public void setTopeCantidadImpactoEconomico(int aTopeCantidadImpactoEconomico) {
		this._topeCantidadImpactoEconomico = aTopeCantidadImpactoEconomico;
	}

	public int getAñoTopeDeCantidad() {
		return this._añoTopeDeCantidad;
	}

	public void setAñoTopeDeCantidad(int aAñoTopeDeCantidad) {
		this._añoTopeDeCantidad = aAñoTopeDeCantidad;
	}

	public int getAñoTopeDePersonasAfectadas() {
		return this._añoTopeDePersonasAfectadas;
	}

	public void setAñoTopeDePersonasAfectadas(int aAñoTopeDePersonasAfectadas) {
		this._añoTopeDePersonasAfectadas = aAñoTopeDePersonasAfectadas;
	}

	public int getAñoTopeDeImpactosEconomicos() {
		return this._añoTopeDeImpactosEconomicos;
	}

	public void setAñoTopeDeImpactosEconomicos(int aAñoTopeDeImpactosEconomicos) {
		this._añoTopeDeImpactosEconomicos = aAñoTopeDeImpactosEconomicos;
	}

	public long getContador() {
		return this._contador;
	}

	public void setContador(long aContador) {
		this._contador = aContador;
	}
}