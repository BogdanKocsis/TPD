package standaloneClient;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.StatelessEjbRemote;

public class Main {

	public static void main(String[] args) throws NamingException {

		InitialContext context = new InitialContext();
		StatelessEjbRemote firstEjb = (StatelessEjbRemote) context
				.lookup("java:global/Ear/Ejb/StatelessEjb!com.example.StatelessEjbRemote");
		firstEjb.insert("Bogdan Kocsis");
	}
}
