package es.iesjandula.reaktor.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase auxiliar para la gestión de fechas
 */
public class FechasUtils
{
	/**
	 * Logger of the class
	 */
	private static final Logger log = LoggerFactory.getLogger(FechasUtils.class);

	/**
	 * Método auxiliar para convertir una fecha a Date
	 * @param fecha Fecha
	 * @return Date
	 * @throws BaseException Excepción base
	 */
	public static Date convertirFecha(String fecha) throws BaseException
	{
		try
		{
			return new SimpleDateFormat(BaseConstants.FORMATO_FECHA_DD_MM_YYYY).parse(fecha);
		}
		catch (ParseException parseException)
		{
			String errorMessage = "Error al convertir la fecha: " + fecha;
			log.error(errorMessage, parseException);
			throw new BaseException(BaseConstants.ERR_CONVERTING_DATE, errorMessage, parseException);
		}
	}

    /**
     * Método auxiliar para convertir una fecha a String
     * @param fecha Fecha
     * @return String
     */
    public static String convertirFecha(LocalDateTime fecha)
    {
        return fecha.format(DateTimeFormatter.ofPattern(BaseConstants.FORMATO_FECHA_DD_MM_YYYY));
    }

	/**
	 * Método auxiliar para convertir una hora a LocalTime
	 * @param hora Hora
	 * @return LocalTime
	 * @throws BaseException Excepción base
	 */
	public static LocalTime convertirHora(String hora) throws BaseException
	{
		try
		{
			return LocalTime.parse(hora, DateTimeFormatter.ofPattern(BaseConstants.FORMATO_HORA_HH_MM));
		}
		catch (DateTimeParseException dateTimeParseException)
		{
			String errorMessage = "Error al convertir la hora: " + hora;
			log.error(errorMessage, dateTimeParseException);
			throw new BaseException(BaseConstants.ERR_CONVERTING_TIME, errorMessage, dateTimeParseException);
		}
	}

    /**
     * Método auxiliar para convertir una hora a String
     * @param hora Hora
     * @return String
     */
    public static String convertirHora(LocalDateTime hora)
    {
        return hora.format(DateTimeFormatter.ofPattern(BaseConstants.FORMATO_HORA_HH_MM));
    }

	/**
	 * Método auxiliar para obtener el curso académico actual
	 * Si el mes está entre el 1 de septiembre del año X y el 31 de agosto del año X+1, el curso académico es el año X-X+1
	 * @return
	 */
	public static String obtenerCursoAcademicoActual()
	{
		// Declaramos la variable que contendrá el curso académico actual
		String cursoAcademicoActual = "";

		// Obtenemos la fecha actual
		LocalDateTime fechaActual = LocalDateTime.now();

		// Obtenemos el año y el mes actual
		int anioActual = fechaActual.getYear();
		int mesActual = fechaActual.getMonthValue();

		// Si el mes es mayor o igual a septiembre ...
		if (mesActual >= 9)
		{
			// ... el curso académico es el año actual y el año siguiente
			cursoAcademicoActual = anioActual + "/" + (anioActual + 1);
		}
		else
		{
			// en otro caso, el curso académico es el año anterior y el actual
			cursoAcademicoActual = (anioActual - 1) + "/" + anioActual;
		}

		// Devolvemos el curso académico actual
		return cursoAcademicoActual;
	}
}
