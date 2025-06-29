DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE bank_accounts
    SET account_balance = account_balance * 1.01
    WHERE account_type = 'SAVINGS';
END$$

DELIMITER ;
