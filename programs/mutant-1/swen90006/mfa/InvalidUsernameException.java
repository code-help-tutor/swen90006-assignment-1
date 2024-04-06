WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class InvalidUsernameException extends Exception
{
    public InvalidUsernameException(String username)
    {
        super("Username " + username + " does not comply with the requirements\n" +
	      "\t- must contains at least " +
	      MFA.MINIMUM_USERNAME_LENGTH + " characters" +
	      " and contain only letters (a-z, A-Z)");
    }
}
