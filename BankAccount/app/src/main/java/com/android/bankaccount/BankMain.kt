package com.android.bankaccount

fun main(){
    val amitBankAccount= BankAccount("Amit Mohan", 1500.00)
    val binaBankAccount= BankAccount("Bina Kumari", 2000.00)
   // println(amitBankAccount.accountHolder)
    amitBankAccount.deposit(5000.00)
    amitBankAccount.withdraw(300.00)
    amitBankAccount.withdraw(5000.00)
    //amitBankAccount.withdraw(2000.00)
    binaBankAccount.deposit(5000.00)
    binaBankAccount.withdraw(300.00)
    binaBankAccount.withdraw(5000.00)

    amitBankAccount.displayTransactionHistory()
    println("${amitBankAccount.accountHolder} has balance $${amitBankAccount.balance}")
    binaBankAccount.displayTransactionHistory()
    println("${binaBankAccount.accountHolder} has balance $${binaBankAccount.balance}")


}