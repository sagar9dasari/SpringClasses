import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krypto.test.domain.Customer;
import com.krypto.test.service.ICustomerService;

public class CustomerServiceTest {
	private static ApplicationContext applicationContext = null ;
	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("customer-app.xml");
		
		ICustomerService customerService = (ICustomerService) applicationContext.getBean("customerService") ;
		
		Customer goutham = new Customer(1L, "Goutham", 123456L, "ABCD") ;
		Customer sai = new Customer(2L, "Sai", 123567L, "CDEF") ;
		Customer nanda = new Customer(3L, "Nanda", 123789L, "ABGH") ;
		
		customerService.insertCustomer(goutham);
		customerService.insertCustomer(sai);
		customerService.insertCustomer(nanda);
		List<Customer> cusList = customerService.getAllCustomer() ;
		cusList.forEach(System.out::println);
	}
}
