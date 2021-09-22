package com.gd.admin.user;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.gd.common.entity.Role;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class RoleRepoTest {

	@Autowired
	private RoleRepository repository;
	
	@Test
	public void testCreateFirstRepo() {
		Role role =new Role("admin"," Manage Everrything");
		Role saveRoll=repository.save(role);
		
		assertThat(saveRoll.getId()).isGreaterThan(0);
	}
}
