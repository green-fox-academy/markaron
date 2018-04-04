package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

  private List<BankAccount> accountList;

  public Bank() {
    accountList = new ArrayList<>();
    fill();
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

  public void fill(){
    accountList.add(new BankAccount(true,"Scar",666,"lion", false));
    accountList.add(new BankAccount(false,"Shenzi", 10,"hyena",false));
    accountList.add(new BankAccount(false,"Banzai", 30,"hyena",false));
    accountList.add(new BankAccount(false,"Ed", 15,"hyena",false));
    accountList.add(new BankAccount(false,"Timon", 10,"meerkat",true));
    accountList.add(new BankAccount(false,"Bumba", 45,"warthog",true));
  }

  @Override
  public String toString() {
    return "Bank{" +
            "accountList=" + accountList +
            '}';
  }
}
