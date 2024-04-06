WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class IncorrectDeviceIDException extends Exception 
{
    public IncorrectDeviceIDException(String username, String deviceID)
    {
        super("Incorrect device ID: " + deviceID + " for user " + username);
    }
}
