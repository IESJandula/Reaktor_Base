package es.iesjandula.reaktor.base.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author Francisco Manuel Benítez Chico
 */
public class BaseConstants
{
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
	
	
	/*********************************************************/
	/********************* Colecciones ***********************/
	/*********************************************************/
	
	/** JWT Attribute - Usuarios - Email */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_EMAIL     = "email" ;
	
	/** JWT Attribute - Usuarios - Nombre */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_NOMBRE    = "nombre" ;
	
	/** JWT Attribute - Usuarios - Apellidos */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_APELLIDOS = "apellidos" ;
	
	/** JWT Attribute - Usuarios - Roles */
	public static final String JWT_ATTR_USUARIOS_ATTRIBUTE_ROLES 	  = "roles" ;
	
	/** JWT Attribute - Aplicaciones - Nombre */
	public static final String JWT_ATTR_APLICACIONES_ATTRIBUTE_NOMBRE = "nombre" ;
	
	/** JWT Attribute - Aplicaciones - Roles */
	public static final String JWT_ATTR_APLICACIONES_ATTRIBUTE_ROLES  = "roles" ;
	
	
	/*********************************************************/
	/************************ Roles **************************/
	/*********************************************************/
	
	/** Role - Administrador */
	public static final String ROLE_ADMINISTRADOR 	  = "ADMINISTRADOR" ;
	
	/** Role - Profesor */
	public static final String ROLE_PROFESOR 	  	  = "PROFESOR" ;
	
	/** Role - Dirección */
	public static final String ROLE_DIRECCION 	  	  = "DIRECCION" ;
	
	/** Role - Cliente impresora */
	public static final String ROLE_CLIENTE_IMPRESORA = "CLIENTE_IMPRESORA" ;
	
	/** Lista de roles permitidos para usuarios web */
	public static final List<String> ROLES_USUARIOS_LIST = Arrays.asList(new String[] { ROLE_ADMINISTRADOR,
																						ROLE_PROFESOR,
																						ROLE_DIRECCION }) ;
	/** Lista de roles permitidos para aplicaciones */
	public static final List<String> ROLES_APPS_LIST     = Arrays.asList(new String[] { ROLE_CLIENTE_IMPRESORA }) ;
}