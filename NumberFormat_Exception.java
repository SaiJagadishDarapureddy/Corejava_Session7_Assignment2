package exception;

public class NumberFormat_Exception {
	public static void main(String args[])
	   {
	      try{
		 int number=Integer.parseInt ("XYZ") ;
		 System.out.println(number);
	      }catch(NumberFormatException e){
		  System.out.println("Exception occured " +e);
	       }
	   }
}
