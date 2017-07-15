import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krypto.test.domain.Customer;
import com.krypto.test.service.ICustomerService;

public class CustomerServiceTest {
	private static ApplicationContext applicationContext = null ;
	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("customer-app.xml");
		
		ICustomerService customerService = (ICustomerService) applicationContext.getBean("customerService") ;
		
		Customer goutham = new Customer(1L, "Goutham", 123L, "ABCD") ;
		/*Customer sai = new Customer(2L, "Sai", 32423L, "CDEF") ;
		Customer nanda = new Customer(3L, "Nanda", 324L, "ABGH") ;*/
		
		customerService.insertCustomer(goutham);
		/*customerService.updateCustomer(sai);
		customerService.updateCustomer(nanda);*/
		
		/*nanda =  new Customer(4L, "Nanda", 324L, "ABGH") ;
		customerService.updateCustomer(nanda);
		
		customerService.deleteCustomer(nanda);*/
		
		/*List<Customer> cusList = customerService.getAllCustomer() ;
		cusList.forEach(System.out::println);*/
		
		Customer customer = customerService.getCustomer(1L) ;
		//load class com.krypto.test.domain.Customer_$$_javassist_0
		//get com.krypto.test.domain.Customer
		customerService.test(customer);
		
	}
}
