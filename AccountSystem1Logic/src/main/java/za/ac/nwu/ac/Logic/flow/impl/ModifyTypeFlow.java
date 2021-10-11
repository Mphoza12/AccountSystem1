package za.ac.nwu.ac.Logic.flow.impl;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.time.LocalDate;

public interface ModifyTypeFlow {
    AccountTypeDto deleteAccountType(String Account_type_ID);
    AccountTypeDto updateAccountType(String Account_type_ID, String newAccountTypeName, LocalDate newCreation_date);
}
