WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class UnauthenticatedUserException extends Exception 
{
    public UnauthenticatedUserException(String username)
    {
        super("User " + username + " is not sufficiently authenticated");
    }
}
