package webadv.s17201128.p02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 17201128曾祥发
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) throws IOException {
    	FileWriter fw=new FileWriter("password.txt");
    	BufferedWriter bw = new BufferedWriter(fw);
    	bw.write("17201128\n");
    	bw.write(sha256hex("123456"));
    	bw.close();
    	
    	String ID="";
    	String password="";
    	Scanner input = new Scanner(System.in);
    	System.out.print("ID:");
    	ID=input.nextLine();
    	System.out.print("password:");
    	password=input.nextLine();
    	
    	FileReader fr = new FileReader("password.txt");
    	BufferedReader br = new BufferedReader(fr);
    	String rID=br.readLine();
    	String rPassword=br.readLine();
    	br.close();
	System.out.println("ID"+ID+"p"+password);
    	System.out.println("ID"+rID+"p"+rPassword);
    	System.out.println("ID"+ID+"p"+sha256hex(password));
        if (rID.equals(ID)&&rPassword.equals(sha256hex(password))) {
            System.out.println("Logined!");
        }else
        	System.out.println("ID or password error!");
//        System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

