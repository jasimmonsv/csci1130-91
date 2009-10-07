

public class NetflixAPI {
	//Constant global declarations
	private final String API_KEY="";//Developers App customer key
	private final String OAUTH_SIGNATURE_METHOD="HMAC-SHA1"; //This does not change
	private double OAUTH_VERSION=1.0;
	
	//Global variables
	private long currentSecTime = System.currentTimeMillis()/1000;
	
	private String nOnceCalculate()
	{
		Random r = new Random();
		String token = Long.toString(Math.abs(r.nextLong()), 36);
		return token;
	}//end method nOnceCalculate */
	
	public String oAuthSigFunction()
	{
		
		return oAuthSig;
	}//end method oAuthSigFunction */

}
