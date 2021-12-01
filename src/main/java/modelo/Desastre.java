package modelo;

public class Desastre {

	private long id;
	private String nombre;
	private String cantidad;
	private String topeCantidadDePersonasAfectadas;
	private String topeCantidadImpactoEconomico;
	private String añoTopeDeCantidad;
	private String añoTopeDePersonasAfectadas;
	private String añoTopeDeImpactosEconomicos;
	private static long contador =1;

	public Desastre(long id, String nombre, String cantidad, String topeCantidadDePersonasAfectadas, String topeCantidadImpactoEconomico, String añoTopeDeCantidad,
					String añoTopeDePersonasAfectadas, String añoTopeDeImpactosEconomicos){
		this.id=id;
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.topeCantidadDePersonasAfectadas=topeCantidadDePersonasAfectadas;
		this.topeCantidadImpactoEconomico=topeCantidadImpactoEconomico;
		this.añoTopeDeCantidad=añoTopeDeCantidad;
		this.añoTopeDePersonasAfectadas=añoTopeDePersonasAfectadas;
		this.añoTopeDeImpactosEconomicos=añoTopeDeImpactosEconomicos;
		contador++;
		System.out.println();

	}
	public Desastre(String nombre,String cantidad,String topeCantidadDePersonasAfectadas, String topeCantidadImpactoEconomico, String añoTopeDeCantidad,
					String añoTopeDePersonasAfectadas, String añoTopeDeImpactosEconomicos){
		this.id=contador++;
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.topeCantidadDePersonasAfectadas=topeCantidadDePersonasAfectadas;
		this.topeCantidadImpactoEconomico=topeCantidadImpactoEconomico;
		this.añoTopeDeCantidad=añoTopeDeCantidad;
		this.añoTopeDePersonasAfectadas=añoTopeDePersonasAfectadas;
		this.añoTopeDeImpactosEconomicos=añoTopeDeImpactosEconomicos;
	}
	public String[] toTableRow(){
		String[] row = {
				String.valueOf(this.id),
				this.nombre,
				this.cantidad,
				this.topeCantidadDePersonasAfectadas,
				this.topeCantidadImpactoEconomico,
				this.añoTopeDeCantidad,
				this.añoTopeDePersonasAfectadas,
				String.valueOf(this.añoTopeDeImpactosEconomicos)
		};
		return row;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getTopeCantidadDePersonasAfectadas() {
		return this.topeCantidadDePersonasAfectadas;
	}

	public void setTopeCantidadDePersonasAfectadas(String topeCantidadDePersonasAfectadas) {
		this.topeCantidadDePersonasAfectadas = topeCantidadDePersonasAfectadas;
	}

	public String getTopeCantidadImpactoEconomico() {
		return this.topeCantidadImpactoEconomico;
	}

	public void setTopeCantidadImpactoEconomico(String topeCantidadImpactoEconomico) {
		this.topeCantidadImpactoEconomico = topeCantidadImpactoEconomico;
	}

	public String getAñoTopeDeCantidad() {
		return this.añoTopeDeCantidad;
	}

	public void setAñoTopeDeCantidad(String añoTopeDeCantidad) {
		this.añoTopeDeCantidad = añoTopeDeCantidad;
	}

	public String getAñoTopeDePersonasAfectadas() {
		return this.añoTopeDePersonasAfectadas;
	}

	public void setAñoTopeDePersonasAfectadas(String añoTopeDePersonasAfectadas) {
		this.añoTopeDePersonasAfectadas = añoTopeDePersonasAfectadas;
	}

	public String getAñoTopeDeImpactosEconomicos() {
		return this.añoTopeDeImpactosEconomicos;
	}

	public void setAñoTopeDeImpactosEconomicos(String añoTopeDeImpactosEconomicos) {
		this.añoTopeDeImpactosEconomicos = añoTopeDeImpactosEconomicos;
	}

	public long getContador() {
		return this.contador;
	}

	public void setContador(long contador) {
		this.contador = contador;
	}

}