WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class DuplicateUserException extends Exception 
{
    public DuplicateUserException(String username)
    {
        super("Username already exists: " + username);
    }
}
