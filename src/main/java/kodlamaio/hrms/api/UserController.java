package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;

@RestController // kendisinin controller olduğunu bilmesi için. Android'de ios'da sana istekde bulunabilir
@RequestMapping("/api/user") // dış dünyadan /api/user diye bir istek gelirse bu controller karşılayacak
public class UserController {

	private UserService userService;

	@Autowired // bize userService parametresini new'leyip verir
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	// frontend ve backend arasında 2 tane veri alışveriş çeşidi vardır.
	// Birisi frontend veri ister (getmapping) ve backend verir,
	// ikincisi frontend al bu veriyi değiştir der ve backend değiştirir.

	@GetMapping("/getall")
	public List<User> getAll() {
		return this.userService.getAll();

	}
}
