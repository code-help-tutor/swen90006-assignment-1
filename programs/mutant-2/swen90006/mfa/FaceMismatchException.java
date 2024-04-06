WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package swen90006.mfa;

public class FaceMismatchException extends Exception{
	
	public FaceMismatchException(boolean status) {
		super("Face Matches "+ status);
	}

}
