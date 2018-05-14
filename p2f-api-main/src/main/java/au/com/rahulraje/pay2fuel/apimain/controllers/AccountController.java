/**
 * 
 */
package au.com.rahulraje.pay2fuel.apimain.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import au.com.rahulraje.pay2fuel.apimain.resources.Account;

/**
 * @author rahul
 *
 */
@RestController
public class AccountController {

    /**
     * @param id
     * @return
     */
    @GetMapping(value = "/accounts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAccount(@PathVariable("id") int id) {
		final Account account = new Account();
		account.setId(id);
		account.setName("Account " + id);
		return account;
	}
}