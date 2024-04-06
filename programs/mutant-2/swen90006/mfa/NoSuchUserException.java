WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class NoSuchUserException extends Exception
{
    public NoSuchUserException (String username)
    {
        super("Username does not exist: " + username);
    }
}
