import java.net.*;
import java.io.*;

class test {

	public static void main(String args[]) {
		//System.out.println("JWTO");
		//Set URL
		try 	{
			URL url = new URL("http://www.lacivita.tv");
			URL url2 = new URL("http://www.jai.me");
		
			//Create connection
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			URLConnection con2 = url2.openConnection();
			System.out.println(con2.getContentLength());
			//System.out.println(con2.getContent());
			BufferedReader jm = new BufferedReader( new InputStreamReader ( con2.getContent() ) );

			int status = con.getResponseCode();
			System.out.println("Status: " + status);


			BufferedReader in = new BufferedReader( new InputStreamReader ( con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			
			con.disconnect();

			System.out.print(content);

			}
		catch (Exception e) {
			System.out.println(e);
			}





	}


}
