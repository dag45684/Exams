package fp.dam.examen2ev;

import java.util.Locale;

public class Ejercicio3 implements Comparable<Locale> {

		Locale locale;

		@Override
		public int compareTo(Locale o) {
			if (this.locale.getDisplayLanguage().compareTo(o.getDisplayLanguage())>0) {
				return 1;
			}
			else if (this.locale.getDisplayLanguage().compareTo(o.getDisplayLanguage())<0) {
				return -1;
			}
			else {
				if (this.locale.getCountry().compareTo(o.getCountry())>0) {
					return 1;
				}
				else return -1;
			}
		}


}
