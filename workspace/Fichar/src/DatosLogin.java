
public class DatosLogin {

	String user="";
	String pas="";
	
	public int probarpass(){
		
		user=LoginAdmin.username.getText();
		pas=LoginAdmin.pass.getText();
		
		if(user.equals("isa")&&pas.equals("1234")){
			
			return 1;
		}
		else{
			return 0;
			
		}
	}
	
	
}
