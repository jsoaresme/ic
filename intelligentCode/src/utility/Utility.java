package utility;

import java.sql.Date;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Utility {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static NumberFormat nf1 = NumberFormat.getInstance(new Locale("pt","BR"));
	private static NumberFormat nf2 = NumberFormat.getInstance(new Locale("pt","BR"));

	static {
		nf2.setMaximumFractionDigits (2);	   // O default é 3.
		nf2.setMinimumFractionDigits (2);
		nf2.setGroupingUsed(false);
	}

	public static Date strToDate(String date) {
		String day = date.substring(0,2);
		String month = date.substring(3,5);
		String year = date.substring(6,10);

		return Date.valueOf(year + "-" + month + "-" + day);
	}

	public static String dateToStr(Date date) {
		return sdf.format(date);
	}

	public static double strToDouble(String monetaryValue) throws ParseException {
		if (monetaryValue == null || "".equals(monetaryValue))
			return 0;
		else {
			return nf1.parse(monetaryValue).doubleValue();
		}		
	}

	public static String doubleToStr(double monetaryValue) throws ParseException {
		return nf2.format(monetaryValue);	
	}
}
