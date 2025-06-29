DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN from_account_id INT,
    IN to_account_id INT,
    IN transfer_amount DECIMAL(10,2)
)
BEGIN
    DECLARE current_balance DECIMAL(10,2);

    SELECT account_balance INTO current_balance
    FROM bank_accounts
    WHERE account_id = from_account_id;

    IF current_balance >= transfer_amount THEN
        UPDATE bank_accounts
        SET account_balance = account_balance - transfer_amount
        WHERE account_id = from_account_id;

        UPDATE bank_accounts
        SET account_balance = account_balance + transfer_amount
        WHERE account_id = to_account_id;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance for transfer';
    END IF;
END$$

DELIMITER ;
