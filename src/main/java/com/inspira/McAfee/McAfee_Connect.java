package com.inspira.McAfee;

import jdk.nashorn.internal.ir.debug.ClassHistogramElement;

import javax.net.ssl.*;
import java.io.*;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class McAfee_Connect {
    public static void main(String[] args) throws IOException {
        System.out.println(" jfndjsfh ");
        connect();
    }

    private static void connect() throws IOException {
        System.out.println(" connect called!!!");
        disableSslVerification();
        String uri = "https://192.168.11.52/rs/esm/login";
        String requestBody = "{\n" + "\t\"username\":\"aWVpcGwuc3ltcGhvbnk=\",\n" +
                "\t\"password\":\"aWVpcGxNYXlAMjAyMA==\",\n" + "\t\"locale\":\"en_US\"\n" + "}";
        URL url = new URL(uri);
        StringBuilder response = new StringBuilder();
        HttpsURLConnection connection = null;
        connection = (HttpsURLConnection) url.openConnection();
        //connection.setSSLSocketFactory(sc.getSocketFactory());
        try{
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Accept-Encoding", "gzip,deflate");
            connection.setRequestProperty("Content-Type", "text/xml");
            connection.setRequestProperty("Content-Length", Integer.toString(requestBody.getBytes().length));
            connection.setRequestProperty("User-Agent", "Apache-HttpClient/4.1.1 (java 1.5)");
            connection.setConnectTimeout(50000);
            connection.setReadTimeout(50000);
            connection.setUseCaches(false);
            connection.setDoOutput(true);
            connection.setDoInput(true);


            //Send request
            OutputStream outputStream = connection.getOutputStream();
            DataOutputStream wr = new DataOutputStream(outputStream);
            wr.writeBytes(requestBody);
            wr.close();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception occoured!!!");
        }
    	finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
    private static void disableSslVerification() {
        try {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager()
                {
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {return null;}
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {}
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {}
                }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier()
            {
                public boolean verify(String hostname, SSLSession session) {return true;}
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        }
        catch (NoSuchAlgorithmException e){
            System.out.println(" NoSuchAlgorithmException ocured!");
        }
        catch (KeyManagementException e){
            System.out.println("KeyManagementException ocured!!");
        }
    }
}
