package za.ac.nwu.ac.repo.persistence;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import za.ac.nwu.ac.domain.persistance.AccountType;
import za.ac.nwu.ac.repo.config.RepositoryTestConfig;

import static org.junit.jupiter.api.Assertions.*;


@ContextConfiguration({RepositoryTestConfig.class})

public class AccountTypeRepositoryTest {

    @Autowired
    AccountTypeRepository accountTypeRepository;

    @Before
    public void setUp() throws Exception{

    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void getAccountTypeByAccountTypeIDNativeQueryMiles(){
        AccountType miles = accountTypeRepository.getAccountTypeIdNativeQuery("MILES");
        assertNotNull(miles);
        assertEquals("MILES",miles.getAccount_type_ID());
    }
    @Test
    public void getAccountTypeByAccountTypeIDNativeQuery() {
        AccountType miles = accountTypeRepository.getAccountTypeIdNativeQuery("MILESSS");
        assertNull(miles);
    }

    @Test
    public void getAccountTypeByAccountTypeID(){
        AccountType miles = accountTypeRepository.getAccountTypeId("MILESS");
        assertNotNull(miles);
        assertEquals("MILES",miles.getAccount_type_ID());
    }


}
