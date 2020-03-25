import java.util.Scanner ;
 
public class Cipher {
    public static String encrypt(String text, int shift) { 
    	String result = "";
  
        for (int i = 0; i < text.length(); i++) { 
        	
            if (Character.isUpperCase(text.charAt(i))) { // upper case
            	
                char ch = (char) (( (int) text.charAt(i) + shift - 65) % 26 + 65); // Encryption = (letter + shift) mod 26 | 65 because of the ASCII values
                result += ch;
                
            } else if (Character.isLowerCase(text.charAt(i))) { //lower case
            	
            	char ch = (char) (( (int) text.charAt(i) + shift - 97) % 26 + 97); // Encryption = (letter + shift) mod 26 | 97 because of the ASCII values
                result += ch;
            
        	} else { //space
            	
                result += " ";
                
            } 
        } 
        
        return result; 
    } 
    
    public static String decrypt(String text, int shift) { 
    	String result = "";
  
        for (int i = 0; i < text.length(); i++) { 
        	
            if (Character.isUpperCase(text.charAt(i))) { //upper case
            	
                char ch = (char) (( (int) text.charAt(i) - shift - 65) % 26 + 65); // Decryption = (letter - shift) mod 26 | 65 because of the ASCII values
                if (ch < 65) {
                	ch += 26;
                }
                result += ch;
                
            } else if (Character.isLowerCase(text.charAt(i))) { //lower case
            	
            	char ch = (char) (( (int) text.charAt(i) - shift - 97) % 26 + 97); // Decryption = (letter - shift) mod 26 | 97 because of the ASCII values
            	if (ch < 97) {
                	ch += 26;
                }
            	result += ch;
            
        	} else { //space
            	
                result += " ";
                
            } 
        } 
        
        return result; 
    } 
  
    public static void main(String[] args) { 
    	
    	Scanner scan = new Scanner(System.in);
    	String mode = " ";
    	
    	System.out.println("Welcome to a Caesar Cipher Encrptor and Decryptor!");
    	
    	while(!(mode.equals("encrypt") || mode.equals("decrypt") )) {
    		if (mode.equals(" ")) {
    			System.out.print("Enter if you want to encrypt or decrypt: ");
    		} else {
    			System.out.print("Please type in encrypt or decrypt: ");
    		}
	    	mode = scan.nextLine();
    	}
    	
    	if (mode.equals("encrypt")) {
    		
    		
    		System.out.print("Enter the text you want to encrypt: ");
            String text = scan.nextLine();
            System.out.print("Enter the shift: ");
            int s = scan.nextInt();
            
            System.out.println("Your text was:\t " + text); 
            System.out.println("The shift is:\t " + s); 
            System.out.println("Encrypted text:\t " + encrypt(text, s)); 
            
    	} else if (mode.equals("decrypt")) {
    		
    		
        	System.out.print("Enter the text you want to decrypt: ");
            String text = scan.nextLine();
            System.out.print("Enter the shift: ");
            int s = scan.nextInt();
                
            System.out.println("Your text was:\t " + text); 
            System.out.println("The shift is:\t " + s); 
            System.out.println("Decrypted text:\t " + decrypt(text, s)); 
    		
    	} else {
    		
    	}
    	
    	
        
    } 
}

