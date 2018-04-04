package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

  private List<BankAccount> accountList;

  public Bank() {
    accountList = new ArrayList<>();
    fill();
  }

  public void addAccount(BankAccount bankAccount){
    accountList.add(bankAccount);
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

  public void fill(){
    accountList.add(new BankAccount("Shenzi", 10,"hyena"));
    accountList.add(new BankAccount("Banzai", 30,"hyena"));
    accountList.add(new BankAccount("Ed", 15,"hyena"));
    accountList.add(new BankAccount("Timon", 10,"meerkat"));
    accountList.add(new BankAccount("Bumba", 45,"warthog"));
  }

  @Override
  public String toString() {
    return "Bank{" +
            "accountList=" + accountList +
            '}';
  }
}
