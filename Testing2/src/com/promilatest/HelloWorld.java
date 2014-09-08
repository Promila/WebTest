package com.promilatest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.blackdiamondreporting.www.PartnerDataWebService;
import com.blackdiamondreporting.www.PartnerDataWebServiceLocator;
import com.blackdiamondreporting.www.PartnerDataWebServiceSoap;
import com.blackdiamondreporting.www.PartnerDataWebServiceSoapStub;
import com.blackdiamondreporting.www.RetrieveDataResponseRetrieveDataResult;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
public class HelloWorld {

	public float addValue ( float value )
    {
      return (value + 10);
    }

    public float subtractValue ( float value )
    {
      return (value - 10);
    }
   public String callBD( String token)
    {
    	String retStr="";;
    	/*****Below Code is to initialize request to Server *******/
    	try
    	{
	    // token="SALESFORCE_MANSA-|-9n8Upe/9puHzR9IYgYE9qrRhbV0md67uAOD++URNj4CalSbllm0s2uT4WQ5GFT8TMZPbU9k7tLW8kXH3Eldtt+MeC7K+S9W6+FsRNQ4me16O7eAR+thih81KmuZc85Wytxyr7XxkIXyBMutmrl2xlw==";
        DefaultHttpClient  httpClient = new DefaultHttpClient ();
        httpClient.getParams().getIntParameter("http.connection.timeout", 60000);
        String endUrl ="https://integrations.bdreporting.com/services/PartnerDataWebService.asmx";
        HttpPost request = new HttpPost(endUrl);
       
       // String soapBody="<?xml version="1.0" encoding="UTF-8"?><env:Envelope xmlns:env="http://schemas.xmlsoap.org/soap/envelope/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"><env:Header /><env:Body><RetrieveData xmlns="http://www.blackdiamondreporting.com/"><token>SALESFORCE_MANSA-&#124;-9n8Upe/9puHzR9IYgYE9qrRhbV0md67uAOD++URNj4CHrC3Z034zF5C303AIFPxCWHQxkbQBPkmKMV7VswqnKa2oqOaIN7kiWgzq9dS6KBFI2R9GFON6ACOW8us2/NStQhcBtnQL20LDq6vJ+5yiRQ==</token></RetrieveData></env:Body></env:Envelope>"; 
        //String soapBody="<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><RetrieveData xmlns=\"http://www.blackdiamondreporting.com/\"><token>"+FinalDataBody1+"</token></RetrieveData></soap:Body></soap:Envelope>";
        String soapBody="<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body><RetrieveData xmlns=\"http://www.blackdiamondreporting.com/\"><token>"+token+"</token></RetrieveData></soap:Body></soap:Envelope>";
        request.addHeader("Content-Type", "text/xml; charset=utf-8");
        request.addHeader("Host", "integrations.bdreporting.com");
        request.addHeader("SOAPAction", "http://www.blackdiamondreporting.com/RetrieveData");
        InputStream inputStream1=new ByteArrayInputStream(soapBody.getBytes());//init your own inputstream
        InputStreamEntity inputStreamEntity=new InputStreamEntity(inputStream1,soapBody.length());
        /*InputStream inputStream=new ByteArrayInputStream(soapBody.getBytes());//init your own inputstream
        InputStreamEntity inputStreamEntity=new InputStreamEntity(inputStream,soapBody.length());*/
        request.setEntity(inputStreamEntity); // initialize request entity
        HttpResponse response = httpClient.execute(request);
        System.out.println("--Response is-"+response.getEntity().getContent().toString());
        System.out.println("--Response is-"+response.getStatusLine());
        InputStream inputStream = new BufferedInputStream(response.getEntity().getContent());
        //SOAPMessage request1 = MessageFactory.newInstance().createMessage(null, inputStream);
       // SOAPBody body = request1.getSOAPBody();
       // System.out.println("======"+request1.getSOAPPart().getXmlVersion());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            retStr=line;
        	//line = bufferedReader.readLine();
        }
       
       System.out.println("Return value is "+retStr);
        inputStream.close();
        bufferedReader.close();
    	/*System.out.println("hello");
		//String token="SALESFORCE_MANSA-|-9n8Upe/9puHzR9IYgYE9qrRhbV0md67uAOD++URNj4CalSbllm0s2uT4WQ5GFT8TMZPbU9k7tLW8kXH3Eldtt+MeC7K+S9W6+FsRNQ4me16O7eAR+thih81KmuZc85Wytxyr7XxkIXyBMutmrl2xlw==";
		String endpoint="https://integrations.bdreporting.com";
		//Service service = factory.createService(new QName("PartnerDataWebService"));;
		//RetrieveData rData=new RetrieveData(token);
		//PartnerDataWebServiceSoapProxy partSoap=new PartnerDataWebServiceSoapProxy(endpoint);
		//partSoap.setEndpoint(endpoint);
	//PartnerDataWebServiceSoap pd=PartnerDataWebServiceSoap.
		
		//PartnerDataWebServiceLocator pd=new PartnerDataWebServiceLocator();
		//pd.getServiceName();
		//pd.setPartnerDataWebServiceSoapEndpointAddress(endpoint);
		
		try
		{
			PartnerDataWebService pdWeb=new PartnerDataWebServiceLocator();
			pdWeb.getPartnerDataWebServiceSoapAddress();
			pdWeb.getPartnerDataWebServiceSoap();
		//	pdWeb.getPorts();
			PartnerDataWebServiceSoap pSoap=pdWeb.getPartnerDataWebServiceSoap();
			
			PartnerDataWebServiceSoapStub pStub=new PartnerDataWebServiceSoapStub();
			pStub.setTimeout(60000);
			//System.out.println("=Result="+pSoap.retrieveData(token));
			// RetrieveDataResponse rd=new RetrieveDataResponse();
			RetrieveDataResponseRetrieveDataResult rd=pSoap.retrieveData(token);//pSoap.retrieveData(token);
		//	rd.getDeserializer(mechType, _javaType, _xmlType)
			System.out.println("=="+rd.toString());
			System.out.println("bye");*/
			//retStr= "bye "+rd.toString();
		}
		catch(Exception e)
		{
			System.out.println("bye1 "+e);
			retStr=e.toString();
		}
		return retStr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
