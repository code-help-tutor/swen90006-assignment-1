WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class IncorrectPasswordException extends Exception 
{
    public IncorrectPasswordException(String username, String password)
    {
        super("Incorrect password: " + password + " for user " + username);
    }
}
