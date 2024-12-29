package eventos;

public class Evento {
	
	//CREAMOS MI ATRIBUTOS DE MI OBJETO EVENTO 
	// ESTA CLASE CREARA DISTINTOS EVENTOS DE FORMA DIMANIMA CADA VES EL EL USUARIO QUIERA AÑADIR ALGUNO :D
	
	String id;
	String nombre;
	String fecha;
	String horaInicio ;
	String horaFin;
	String lugar;
	String publicoObjetivo;
	String url;
	
	
	
	public Evento(String id, String nombre, String fecha, String horaInicio, String horaFin, String lugar,
			String publicoObjetivo, String url) {
		
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.lugar = lugar;
		this.publicoObjetivo = publicoObjetivo;
		this.url = url;
	
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getHoraInicio() {
		return horaInicio;
	}



	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}



	public String getHoraFin() {
		return horaFin;
	}



	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}



	public String getLugar() {
		return lugar;
	}



	public void setLugar(String lugar) {
		this.lugar = lugar;
	}



	public String getPublicoObjetivo() {
		return publicoObjetivo;
	}



	public void setPublicoObjetivo(String publicoObjetivo) {
		this.publicoObjetivo = publicoObjetivo;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	@Override
	
	public String toString() {
		return id  +","+ nombre  +","+ fecha  +"," + horaInicio + "," + horaFin +","+ lugar +","+ publicoObjetivo +","+ url;
	}
	
	
	
	
	
	

	
	
	

}
