package es.iesjandula.reaktor.base.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Francisco Manuel Benítez Chico
 */
public class BaseConstants
{
	/** String - Coma */
	public static final String STRING_COMA = "," ;

	/*********************************************************/
	/*********************** Errores *************************/
	/*********************************************************/
	
	/** Error - Excepción genérica - Código */
	public static final int ERR_GENERIC_EXCEPTION_CODE 	 		= 0 ;
	
	/** Error - Excepción genérica - Mensaje */
	public static final String ERR_GENERIC_EXCEPTION_MSG 		= "Excepción genérica en " ;
	
	public static final int EXC_ERR_CODE_RESOURCES_HANDLER 		= 1 ;
	
	/** Error - Error mientras se obtenía la clave pública */
	public static final int ERR_GETTING_PUBLIC_KEY	 	 		= 2 ;

	/** Error - Error al convertir la fecha */
	public static final int ERR_CONVERTING_DATE 	 		    = 3 ;

	/** Error - Error al convertir la hora */
	public static final int ERR_CONVERTING_TIME 	 		    = 4 ;

	/*********************************************************/
	/********************* Tipos de eventos ******************/
	/*********************************************************/

	/** Tipo de evento - USUARIO */
	public static final String STRING_TIPO_EVENTO_USUARIO = "USUARIO";

	/** Tipo de evento - APLICACION */
	public static final String STRING_TIPO_EVENTO_APLICACION = "APLICACION";
	
	/*********************************************************/
	/********************* JWT Usuarios **********************/
	/*********************************************************/
	
	/** JWT Attribute - Usuarios - Email */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_EMAIL     = "email" ;
	
	/** JWT Attribute - Usuarios - Nombre */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_NOMBRE    = "nombre" ;
	
	/** JWT Attribute - Usuarios - Apellidos */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_APELLIDOS = "apellidos" ;
	
	/** JWT Attribute - Usuarios - Departamento */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_DEPARTAMENTO = "departamento" ;
	
	/** JWT Attribute - Usuarios - Fecha de cumpleaños */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_FECHA_NACIMIENTO = "fechaNacimiento" ;
	
	/** JWT Attribute - Usuarios - Roles */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_ROLES 	  = "roles" ;

	/*********************************************************/
	/********************* JWT Aplicaciones ******************/
	/*********************************************************/
	
	/** JWT Attribute - Aplicaciones - Nombre */
	public static final String JWT_ATTR_APLICACIONES_ATTRIBUTE_NOMBRE = "nombre" ;
	
	/** JWT Attribute - Aplicaciones - Roles */
	public static final String JWT_ATTR_APLICACIONES_ATTRIBUTE_ROLES  = "roles" ;
	
	/*********************************************************/
	/************************ Roles **************************/
	/*********************************************************/
	
	/** Role - Administrador */
	public static final String ROLE_ADMINISTRADOR 	          = "ADMINISTRADOR" ;
	
	/** Role - Profesor */
	public static final String ROLE_PROFESOR 	  	          = "PROFESOR" ;
	
	/** Role - Dirección */
	public static final String ROLE_DIRECCION 	  	          = "DIRECCION" ;

	/** Role - Friends and Family */
	public static final String ROLE_FRIENDS_AND_FAMILY 	  	  = "FRIENDS_AND_FAMILY" ;

	/** Role - Departamento Informática */
	public static final String ROLE_DEPARTAMENTO_INFORMATICA  = "DEPARTAMENTO_INFORMATICA" ;
	
	/** Role - Cliente impresora */
	public static final String ROLE_CLIENTE_IMPRESORA         = "CLIENTE_IMPRESORA" ;
	
	/** Role - Cliente proyector */
	public static final String ROLE_CLIENTE_PROYECTOR         = "CLIENTE_PROYECTOR" ;

	/** Role - Cliente puerta */
	public static final String ROLE_CLIENTE_PUERTA            = "CLIENTE_PUERTA" ;

	/** Role - Cliente clonador de imágenes */
	public static final String ROLE_CLIENTE_CLONADOR_IMAGENES = "CLIENTE_CLONADOR_IMAGENES" ;

	/** Role - Sensor */
	public static final String ROLE_APLICACION_SENSOR         = "CLIENTE_SENSOR" ;

	/** Role - Actuador */
	public static final String ROLE_APLICACION_ACTUADOR       = "CLIENTE_ACTUADOR" ;

	/** Role - Aplicacion notificaciones */
	public static final String ROLE_APLICACION_NOTIFICACIONES = "APLICACION_NOTIFICACIONES" ;

	/** Role - Aplicacion impresora */
	public static final String ROLE_APLICACION_IMPRESORA      = "APLICACION_IMPRESORA" ;

	/** Role - Aplicacion school base */
	public static final String ROLE_APLICACION_SCHOOL_BASE    = "APLICACION_SCHOOL_BASE" ;
	
	/** Lista de roles permitidos para usuarios web */
	public static final List<String> ROLES_USUARIOS_LIST      = Arrays.asList(new String[] { ROLE_ADMINISTRADOR, ROLE_PROFESOR, ROLE_DIRECCION, ROLE_FRIENDS_AND_FAMILY, ROLE_DEPARTAMENTO_INFORMATICA }) ;

	/** Lista de roles permitidos para aplicaciones */
	public static final List<String> ROLES_APPS_LIST          = Arrays.asList(new String[] { ROLE_CLIENTE_IMPRESORA, ROLE_CLIENTE_PROYECTOR, ROLE_CLIENTE_PUERTA, 
		 			                                                                         ROLE_APLICACION_SENSOR, ROLE_APLICACION_ACTUADOR, 
																							 ROLE_APLICACION_NOTIFICACIONES, ROLE_APLICACION_IMPRESORA, ROLE_APLICACION_SCHOOL_BASE,
																							 ROLE_CLIENTE_CLONADOR_IMAGENES }) ;

	/*********************************************************/
	/******************* Formatos de fechas *****************/
	/*********************************************************/

	/** Formato de fecha - dd/MM/yyyy */
	public static final String FORMATO_FECHA_DD_MM_YYYY = "dd/MM/yyyy" ;

	/** Formato de hora - HH:mm */
	public static final String FORMATO_HORA_HH_MM       = "HH:mm" ;
}
