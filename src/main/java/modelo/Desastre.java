package modelo;

public class Desastre {
	private long _id;
	private String _nombre;
	private int _cantidad;
	private int _topeCantidadDePersonasAfectadas;
	private int _topeCantidadImpactoEconomico;
	private int _a�oTopeDeCantidad;
	private int _a�oTopeDePersonasAfectadas;
	private int _a�oTopeDeImpactosEconomicos;
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

	public int getA�oTopeDeCantidad() {
		return this._a�oTopeDeCantidad;
	}

	public void setA�oTopeDeCantidad(int aA�oTopeDeCantidad) {
		this._a�oTopeDeCantidad = aA�oTopeDeCantidad;
	}

	public int getA�oTopeDePersonasAfectadas() {
		return this._a�oTopeDePersonasAfectadas;
	}

	public void setA�oTopeDePersonasAfectadas(int aA�oTopeDePersonasAfectadas) {
		this._a�oTopeDePersonasAfectadas = aA�oTopeDePersonasAfectadas;
	}

	public int getA�oTopeDeImpactosEconomicos() {
		return this._a�oTopeDeImpactosEconomicos;
	}

	public void setA�oTopeDeImpactosEconomicos(int aA�oTopeDeImpactosEconomicos) {
		this._a�oTopeDeImpactosEconomicos = aA�oTopeDeImpactosEconomicos;
	}

	public long getContador() {
		return this._contador;
	}

	public void setContador(long aContador) {
		this._contador = aContador;
	}
}