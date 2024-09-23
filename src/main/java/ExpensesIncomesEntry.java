/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tymurnabokov
 */
//package expense_income_tracker;
public class ExpensesIncomesEntry {
    private String date;
    private String description;
    private double amount;
    private String type;



    public ExpensesIncomesEntry( String date, String description, double amount, String type){
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.type = type;
    }
    public String getDate(){ return date;}
    public String getDescription(){ return description;}
    public double getAmount(){ return amount;}
    public String getType(){ return type;}
}

