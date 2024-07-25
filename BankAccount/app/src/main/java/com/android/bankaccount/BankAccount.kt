package com.android.bankaccount

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory= mutableListOf<String>()
    fun deposit(amount: Double){
        balance+= amount
        transactionHistory.add("$accountHolder deposited $ $amount")
    }
    fun withdraw(amount: Double){
        if(amount<=balance){
            //we can withdraw
            balance-=amount
            transactionHistory.add("$accountHolder withdrew $ $amount")
        }
        else{
            //we cannot withdraw
            println("you don't have the funds to withdraw $ $amount")
        }

    }
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}