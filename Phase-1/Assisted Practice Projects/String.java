public class String {

	public static void main(String[] args) {
		// methods of strings
		System.out.println(Messages.getString("String.0")); //$NON-NLS-1$

		String sl = new String();
		System.out.println(sl.length());

		// substring
		String sub = new String();
		System.out.println(sub.substring(2));

		// String Comparison
		java.lang.String s1 = Messages.getString("String.1"); //$NON-NLS-1$
		java.lang.String s2 = Messages.getString("String.2"); //$NON-NLS-1$
		System.out.println(s1.compareTo(s2));

		// IsEmpty
		java.lang.String s4 = Messages.getString("String.3"); //$NON-NLS-1$
		System.out.println(s4.isEmpty());

		// toLowerCase
		java.lang.String s5 = Messages.getString("String.4"); //$NON-NLS-1$
		System.out.println(s1.toLowerCase());

		// replace
		java.lang.String s6 = Messages.getString("String.5"); //$NON-NLS-1$
		java.lang.String replace = s2.replace('d', 'l');
		System.out.println(replace);

		// equals
		java.lang.String x = Messages.getString("String.6"); //$NON-NLS-1$
		java.lang.String y = Messages.getString("String.7"); //$NON-NLS-1$
		System.out.println(x.equals(y));

		System.out.println(Messages.getString("String.8")); //$NON-NLS-1$
		System.out.println(Messages.getString("String.9")); //$NON-NLS-1$
		// Creating StringBuffer and append method
		StringBuffer s = new StringBuffer(Messages.getString("String.10")); //$NON-NLS-1$
		s.append(Messages.getString("String.11")); //$NON-NLS-1$
		System.out.println(s);

		// insert method
		s.insert(0, 'w');
		System.out.println(s);

		// replace method
		StringBuffer sb = new StringBuffer(Messages.getString("String.12")); //$NON-NLS-1$
		sb.replace(0, 2, Messages.getString("String.13")); //$NON-NLS-1$
		System.out.println(sb);

		// delete method
		sb.delete(0, 1);
		System.out.println(sb);

		// StringBuilder
		System.out.println(Messages.getString("String.14")); //$NON-NLS-1$
		System.out.println(Messages.getString("String.15")); //$NON-NLS-1$
		StringBuilder sb1 = new StringBuilder(Messages.getString("String.16")); //$NON-NLS-1$
		sb1.append(Messages.getString("String.17")); //$NON-NLS-1$
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, Messages.getString("String.18"))); //$NON-NLS-1$

		System.out.println(sb1.reverse());

		// conversion
		System.out.println(Messages.getString("String.19")); //$NON-NLS-1$
		System.out.println(Messages.getString("String.20")); //$NON-NLS-1$

		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer();
		sbr.reverse();
		System.out.println(Messages.getString("String.21")); //$NON-NLS-1$
		System.out.println(sbr);

		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder();
		sbl.append(Messages.getString("String.22")); //$NON-NLS-1$
		System.out.println(Messages.getString("String.23")); //$NON-NLS-1$
		System.out.println(sbl);
	}

	private char[] substring(int i) {

		return null;
	}

	private char[] length() {

		return null;
	}
}