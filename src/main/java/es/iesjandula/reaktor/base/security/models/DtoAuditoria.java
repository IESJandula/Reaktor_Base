package es.iesjandula.reaktor.base.security.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Evento de auditoría HTTP (post-request) publicado a RabbitMQ en JSON.
 * Contrato compartido entre microservicios (BaseServer) y AuditServer.
 */
public class DtoAuditoria
{
	/** Nombre del servicio que genera el evento */
	private String serviceName;

	/** Tipo de principal que genera el evento */
	private String tipoEventoUsuarioAplicacion ;

	/** Curso académico del usuario que genera el evento */
	private String cursoAcademicoUsuario;

	/** Nombre de la aplicación que genera el evento */
	private String nombreAplicacion;

	/** Email del usuario que genera el evento */
	private String emailUsuario;

	/** Nombre del usuario que genera el evento */
	private String nombreUsuario;

	/** Apellidos del usuario que genera el evento */
	private String apellidosUsuario;

	/** Roles del principal que genera el evento */
	private List<String> roles = new ArrayList<>();

	/** Método HTTP del evento */
	private String metodo;

	/** Endpoint del evento */
	private String endpoint;

	/** User agent del evento */
	private String userAgent;

	/** Timestamp del evento */
	private LocalDateTime timestamp;

	/** Estado HTTP del evento */
	private int status;

	/** Duración del evento en milisegundos */
	private long durationMs;

	/**
	 * Obtiene el nombre del servicio que genera el evento
	 * @return Nombre del servicio que genera el evento
	 */
	public String getServiceName()
	{
		return this.serviceName;
	}

	/**
	 * Establece el nombre del servicio que genera el evento
	 * @param serviceName Nombre del servicio que genera el evento
	 */
	public void setServiceName(String serviceName)
	{
		this.serviceName = serviceName;
	}

	/**
	 * Obtiene el tipo de evento (USUARIO o APLICACION) que genera el evento
	 * @return Tipo de evento (USUARIO o APLICACION) que genera el evento
	 */
	public String getTipoEventoUsuarioAplicacion()
	{
		return this.tipoEventoUsuarioAplicacion;
	}

	/**
	 * Establece el tipo de evento (USUARIO o APLICACION) que genera el evento
	 * @param tipoEventoUsuarioAplicacion Tipo de evento (USUARIO o APLICACION) que genera el evento
	 */
	public void setTipoEventoUsuarioAplicacion(String tipoEventoUsuarioAplicacion)
	{
		this.tipoEventoUsuarioAplicacion = tipoEventoUsuarioAplicacion ;
	}

	/**
	 * Obtiene el curso académico del usuario que genera el evento
	 * @return Curso académico del usuario que genera el evento
	 */
	public String getCursoAcademicoUsuario()
	{
		return this.cursoAcademicoUsuario;
	}

	/**
	 * Establece el curso académico del usuario que genera el evento
	 * @param cursoAcademicoUsuario Curso académico del usuario que genera el evento
	 */
	public void setCursoAcademicoUsuario(String cursoAcademicoUsuario)
	{
		this.cursoAcademicoUsuario = cursoAcademicoUsuario;
	}
	/**
	 * Obtiene el nombre de la aplicación que genera el evento
	 * @return Nombre de la aplicación que genera el evento
	 */
	public String getNombreAplicacion()
	{
		return this.nombreAplicacion;
	}

	/**
	 * Establece el nombre de la aplicación que genera el evento
	 * @param nombreAplicacion Nombre de la aplicación que genera el evento
	 */
	public void setNombreAplicacion(String nombreAplicacion)
	{
		this.nombreAplicacion = nombreAplicacion;
	}

	/**
	 * Obtiene el email del usuario que genera el evento
	 * @return Email del usuario que genera el evento
	 */
	public String getEmailUsuario()
	{
		return this.emailUsuario;
	}

	/**
	 * Establece el email del usuario que genera el evento
	 * @param emailUsuario Email del usuario que genera el evento
	 */
	public void setEmailUsuario(String emailUsuario)
	{
		this.emailUsuario = emailUsuario;
	}

	/**
	 * Obtiene el nombre del usuario que genera el evento
	 * @return Nombre del usuario que genera el evento
	 */
	public String getNombreUsuario()
	{
		return this.nombreUsuario;
	}

	/**
	 * Establece el nombre del usuario que genera el evento
	 * @param nombreUsuario Nombre del usuario que genera el evento
	 */
	public void setNombreUsuario(String nombreUsuario)
	{
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * Obtiene los apellidos del usuario que genera el evento
	 * @return Apellidos del usuario que genera el evento
	 */
	public String getApellidosUsuario()
	{
		return this.apellidosUsuario;
	}

	/**
	 * Establece los apellidos del usuario que genera el evento
	 * @param apellidosUsuario Apellidos del usuario que genera el evento
	 */
	public void setApellidosUsuario(String apellidosUsuario)
	{
		this.apellidosUsuario = apellidosUsuario;
	}
	/**
	 * Obtiene los roles del principal que genera el evento
	 * @return Roles del principal que genera el evento
	 */
	public List<String> getRoles()
	{
		return this.roles;
	}

	/**
	 * Establece los roles del principal que genera el evento
	 * @param roles Roles del principal que genera el evento
	 */
	public void setRoles(List<String> roles)
	{
		this.roles = roles != null ? new ArrayList<>(roles) : new ArrayList<>();
	}

	/**
	 * Obtiene el método HTTP del evento
	 * @return Método HTTP del evento
	 */
	public String getMetodo()
	{
		return this.metodo;
	}

	/**
	 * Establece el método HTTP del evento
	 * @param metodo Método HTTP del evento
	 */
	public void setMetodo(String metodo)
	{
		this.metodo = metodo;
	}

	/**
	 * Obtiene el endpoint del evento
	 * @return Endpoint del evento
	 */
	public String getEndpoint()
	{
		return this.endpoint;
	}

	/**
	 * Establece el endpoint del evento
	 * @param endpoint Endpoint del evento
	 */
	public void setEndpoint(String endpoint)
	{
		this.endpoint = endpoint;
	}

	/**
	 * Obtiene el user agent del evento
	 * @return User agent del evento
	 */
	public String getUserAgent()
	{
		return this.userAgent;
	}

	/**
	 * Establece el user agent del evento
	 * @param userAgent User agent del evento
	 */
	public void setUserAgent(String userAgent)
	{
		this.userAgent = userAgent;
	}

	/**
	 * Obtiene el timestamp del evento
	 * @return Timestamp del evento
	 */
	public LocalDateTime getTimestamp()
	{
		return this.timestamp;
	}

	/**
	 * Establece el timestamp del evento
	 * @param timestamp Timestamp del evento
	 */
	public void setTimestamp(LocalDateTime timestamp)
	{
		this.timestamp = timestamp;
	}

	/**
	 * Obtiene el estado HTTP del evento
	 * @return Estado HTTP del evento
	 */
	public int getStatus()
	{
		return this.status;
	}

	/**
	 * Establece el estado HTTP del evento
	 * @param status Estado HTTP del evento
	 */
	public void setStatus(int status)
	{
		this.status = status;
	}

	/**
	 * Obtiene la duración del evento en milisegundos
	 * @return Duración del evento en milisegundos
	 */
	public long getDurationMs()
	{
		return this.durationMs;
	}

	/**
	 * Establece la duración del evento en milisegundos
	 * @param durationMs Duración del evento en milisegundos
	 */
	public void setDurationMs(long durationMs)
	{
		this.durationMs = durationMs;
	}
}
