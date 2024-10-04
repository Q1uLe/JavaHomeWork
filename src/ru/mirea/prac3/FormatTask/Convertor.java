package ru.mirea.prac3.FormatTask;

import java.util.HashMap;
import java.util.Map;
import java.text.NumberFormat;
import java.util.Locale;

public class Convertor {
    public float moneyCount;
    public String currencyCode; // Код Тейлора
    private Map<String, Float> pricesForUSD;
    /*
    USD - USA
    RUB - RUSSIA
    CNY - CHINA
    EUR - EU
     */

    public Convertor(float moneyCount, String currencyCode) {
        this.moneyCount = moneyCount;
        this.currencyCode = currencyCode;
        this.pricesForUSD = new HashMap<String, Float>();
        pricesForUSD.put("USD", 1.0F);
        pricesForUSD.put("RUB", 95.03F);
        pricesForUSD.put("CNY", 7.02F);
        pricesForUSD.put("EUR", 0.90638F);
    }
    
    public void convertTo(String currencyCode){
        switch (this.currencyCode){
            case "USD":
                this.currencyCode = currencyCode;
                this.moneyCount *= pricesForUSD.get(currencyCode);
                break;
            case "RUB":
                this.currencyCode = "USD";
                this.moneyCount /= pricesForUSD.get("RUB");
                this.convertTo(currencyCode);
                break;
            case "CNY":
                this.currencyCode = "USD";
                this.moneyCount /= pricesForUSD.get("CNY");
                this.convertTo(currencyCode);
            case "EUR":
                this.currencyCode = "USD";
                this.moneyCount /= pricesForUSD.get("EUR");
                this.convertTo(currencyCode);
        }
    }

    @Override
    public String toString(){
        NumberFormat numberFormat;
        return switch (this.currencyCode) {
            case "USD" -> {
                numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
                yield numberFormat.format(moneyCount);
            }
            case "CNY" -> {
                numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
                yield numberFormat.format(moneyCount);
            }
            case "RUB" -> {
                yield String.format("%.2f ₽", moneyCount);
            }
            case "EUR" -> {
                numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                yield numberFormat.format(moneyCount);
            }
            default -> "EXCEPTION";
        };
    }
}
