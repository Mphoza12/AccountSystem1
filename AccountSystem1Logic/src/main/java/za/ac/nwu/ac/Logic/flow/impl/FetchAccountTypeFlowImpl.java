package za.ac.nwu.ac.Logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.Logic.flow.FetchAccountTypeFlow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("MILES", "Miles",LocalDate.now()));
        return accountTypeDtos;

    }
    public boolean methodToTest(){
        return true;
    }
}
