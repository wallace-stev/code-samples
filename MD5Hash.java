import java.util.Scanner;
import java.math.BigInteger;
import java.security.MessageDigest;
/*
 * Title: Java MD5 Hash Generator
 * Author: Wallace S. Msagusa
 */

/*
 * Hashing is one of ways through which you can secure your users passwords
 * in the system you develop. Of many of the advantages, here are a few:
 * 	2. It's is a one way encryption.
 * 	2. Each different word creates a unique hash.
 * 
 * There are other hashing algorithms such as SHA-1, MD2, SHa-2, SHA-3, RSA
 * and many more, here is an MD5 hashing algorithm using java.
 */
public class MD5Hash {
	public static Scanner input;
	//main function
	public static void main(String[]args){
		input = new Scanner(System.in);
		String password;
		System.out.println("Enter the value you want to convert:");
		password=input.nextLine();
		String hashPassword=MD5(password);
		
		System.out.println("Your original text was: "+password);
		System.out.println("Hash value of " +password + " is " +hashPassword);
		input.close();
	}
	
	//hashing function
	public static String MD5(String pwordString){
		try {
			MessageDigest MDHash=MessageDigest.getInstance("MD5");
			byte[] messageDigest=MDHash.digest(pwordString.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashPword= number.toString(16);
			while (hashPword.length()<32){
				hashPword="0"+hashPword;
			}
			return hashPword;
		}catch (Exception hashFail){
			throw new RuntimeException(hashFail);
		}
	}
}
