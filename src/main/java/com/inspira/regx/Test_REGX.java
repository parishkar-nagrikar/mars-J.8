package com.inspira.regx;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.InetAddress;

public class Test_REGX {
    //^[0-9]
    private  Pattern pattern;
    private Matcher matcher;

    public static void main(String[] args) {
        Test_REGX test_regx = new Test_REGX();
//      test_regx.validateNumber("1");
        Boolean b = test_regx.checkNumericValue("9");
        System.out.println(" checkNumericValue :"+ b);

        Boolean bb = test_regx.validateDomain("gmail.com");
        System.out.println(" validateDomain :"+bb);

        Boolean bbb = test_regx.validateName("gmail");
        System.out.println(" validateName :"+bbb);

    }

    /**
     * This method validates the input num address with EMAIL_REGEX pattern
     *
     * @param num
     * @return boolean
     */
    public boolean validateNumber(String num) {
        String NUMBER_REGEX = "\\\\d+";
        pattern = Pattern.compile(NUMBER_REGEX, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(num);
        return matcher.matches();
    }
    public boolean checkNumericValue(String value) {
        value = checkInputValue(value);
        value = value.trim();

        if(value=="" || value.equals(""))
            return false;
        else if(value.contains("."))
            return false;

       try {
            Double dblVal = Double.valueOf(value);
        }
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    private String checkInputValue(String value) {

        if(value == null || value.equals("null"))
            value="";
        return value;
    }
    public boolean validateDomain(String value){
        System.out.println(" inside 1");
        value = (checkInputValue(value)).trim();

        if(value=="" || value.equals(""))
            return false;
        else if(!value.contains("."))
            return false;

        String hostName="",Ip="",hostname="";

        if (!value.equals("")) {
            System.out.println(" inside 2");

            try {
                System.out.println(" inside 3");
//              String[] emailId= value.split("@");
                hostName=value;
                System.out.println(" hostName :"+hostName);
                InetAddress addr = InetAddress.getByName(hostName);
//              Gets the fully qualified domain name for this IP address.
                Ip = addr.getHostAddress();
                hostname = addr.getHostName();
            }
            catch (Exception e) {
                System.out.println(" inside 4");
                try {
                    System.out.println(" inside 5");
                    InetAddress addr1 = InetAddress.getByName("www."+hostName);
                    Ip = addr1.getHostAddress();
                    hostname = addr1.getHostName();
                }
                catch(Exception ie) {
                    return false;
                }
            }
            finally {
                hostName = null;
                Ip = null;
                hostname = null;
            }
        }
        return true;
    }
    public boolean validateName(String value) {
        value = checkInputValue(value);

        if (!value.equals(""))
        {
            Map<String, String> map = new HashMap<String, String>();
            value = (checkInputValue(value)).trim();
            String validStr = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int strLen = value.length();
            char charArray[] = value.toCharArray();

            for(int i=0;i<strLen;i++) {
                if((validStr.indexOf(charArray[i]))== -1) {
                    map.put("char", "" + charArray[i]);
                    map = null;
                    return false;
                }
            }
            validStr = null;
            map = null;
        }
        return true;
    }
}
