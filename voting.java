import java.util.Scanner;

class VotingNotEligibleException extends Exception {
    public VotingNotEligibleException() {
        super("Sorry! You are not eligible to vote.");
    }
}
  class voting
  {
	  public static void main(String[] args)throws VotingNotEligibleException
	  {
		  while(true){
			  Scanner scn=new Scanner(System.in);
			  System.out.println(":::Enter Your Age:::");
			  int age=scn.nextInt();
			  if(age>=18){
		  System.out.println("Congratulation ! You Are Eligible");
				  
  }else{
	  throw new VotingNotEligibleException();
			}
		  }
	  }
  }