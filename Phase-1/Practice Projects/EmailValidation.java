import java.util.regex.Pattern; 
  
 public class EmailValidation {
 
	 public static boolean isValid(java.lang.String email) 
     { 
         java.lang.String emailRegex = Messages.getString("EmailValidation.0") +  //part before @ //$NON-NLS-1$
                 Messages.getString("EmailValidation.1");  //$NON-NLS-1$
         
         Pattern pat = Pattern.compile(emailRegex); 
         if (email == null) 
        	 return false; 
         return pat.matcher((CharSequence) email).matches(); 
     } 
  
     public static void main(String[] args) 
     { 
         java.lang.String email1 = Messages.getString("EmailValidation.2");  //$NON-NLS-1$
         java.lang.String email2 = Messages.getString("EmailValidation.3"); //$NON-NLS-1$
         java.lang.String email3 = Messages.getString("EmailValidation.4"); //$NON-NLS-1$
         java.lang.String[] emails= {email1,email2,email3};
  
         for (int i = 0; i < emails.length; i++) {
         	java.lang.String email=emails[i];
             if (isValid(email)) 
                 System.out.print(email+Messages.getString("EmailValidation.5"));  //$NON-NLS-1$
             else
                 System.out.print(email+Messages.getString("EmailValidation.6"));  //$NON-NLS-1$
  
             System.out.println();
         }
}
}