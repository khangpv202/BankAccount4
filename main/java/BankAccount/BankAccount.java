package BankAccount;

import BankAccountDAO.BankAccountDAO;

/**
 * Created with IntelliJ IDEA.
 * User: khangpv
 * Date: 6/28/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    private static BankAccountDAO bankAccountDAO ;

    public static void setMockBankAccount(BankAccountDAO bankAccountDao) {
        bankAccountDAO=bankAccountDao;
    }

    public static void open(String accountNumber) {

    }
}
