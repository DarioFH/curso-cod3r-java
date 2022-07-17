package fundamentos;

import java.util.Locale;

public class TesteLocale {
	public static void main(String[] args) {
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));
	}
}
