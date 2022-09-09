package com.entity;

import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private int numApples;
    @Column
    private double appleVersion;
    @Column
    private int numOranges;
    @Column
    private double orangeVersion;
    @Column
    private double total;

    public Order() {
        setNumApples(0);
        setAppleVersion(1.0);
        setNumOranges(0);
        setOrangeVersion(1.0);
        setTotal(0.0);
    }

    public Order(int numApples, double appleVersion, int numOranges, double orangeVersion, double total) {
        setNumApples(numApples);
        setAppleVersion(appleVersion);
        setNumOranges(numOranges);
        setOrangeVersion(orangeVersion);
        setTotal(total);
    }

    public void setNumApples(int numApples) {
        this.numApples = numApples;
    }
    public void setAppleVersion(double appleVersion) { this.appleVersion = appleVersion; }
    public void setNumOranges(int numOranges) {
        this.numOranges = numOranges;
    }
    public void setOrangeVersion(double orangeVersion) { this.orangeVersion = orangeVersion; }
    public void setTotal(double total) { this.total = total; }

    public int getNumApples() {
        return this.numApples;
    }
    public double getAppleVersion() { return this.appleVersion; }
    public int getNumOranges() {
        return this.numOranges;
    }
    public double getOrangeVersion() { return this.orangeVersion; }
    public double getTotal() { return this.total; }
}
