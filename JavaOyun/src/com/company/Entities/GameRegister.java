package com.company.Entities;

public class GameRegister {
    private String nameOfGame;
    private float discount;
    private String nameOfCampaign;
    private String[] labels;
    private float price;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }


    public float getDiscount() {

        return discount;
    }

    public void setDiscount(float discount) {

        this.discount = discount;
    }


    public String getNameOfCampaign() {

        return nameOfCampaign;
    }

    public void setNameOfCampaign(String nameOfCampaign) {

        this.nameOfCampaign = nameOfCampaign;
    }



}
