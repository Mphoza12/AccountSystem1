package za.ac.nwu.ac.Logic.flow.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.ac.Logic.CreateAccountTypeFlow;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import java.time.LocalDate;


@Transactional
@Component("createAccountTypeFlow")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;
    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType){
        if (null == accountType.getCreation_date()){
            accountType.setCreation_date(LocalDate.now());
        }
        return accountTypeTranslator.create(accountType);
    }
}
