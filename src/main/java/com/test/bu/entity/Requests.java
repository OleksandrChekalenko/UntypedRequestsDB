package com.test.bu.entity;

import javax.persistence.*;

@Entity
@Table(name = "requests")
public class Requests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "offers_id")
    private Offers offers_id;
    private double price;
    private int count;

    @ManyToOne
    @JoinColumn(name = "operators_id")
    private Operators operators_id;

   public Requests(int id,double price, int count) {
        this.id = id;
        this.price = price;
        this.count = count;
    }

    public Requests() {
    }

    public Requests(int id, String name) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Offers getOffers() {
        return offers_id;
    }

    public void setOffers(Offers offers) {
        this.offers_id = offers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Operators getOperators() {
        return operators_id;
    }

    public void setOperators(Operators operators) {
        this.operators_id = operators;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Requests{");
        sb.append("id=").append(id);
        sb.append(", offers_id=").append(offers_id);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", operators_id=").append(operators_id);
        sb.append('}');
        return sb.toString();
    }
}