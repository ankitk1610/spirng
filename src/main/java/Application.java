import com.ankit.service.CustmerService;
import com.ankit.service.CustmerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustmerService custmerService = new CustmerServiceImpl();
		System.out.println(custmerService.findAll().get(0).getFirstName());
return;
	}

}
