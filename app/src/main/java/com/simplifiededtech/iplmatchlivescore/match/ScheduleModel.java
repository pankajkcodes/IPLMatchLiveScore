package com.simplifiededtech.iplmatchlivescore.match;

public class ScheduleModel {
    String imgUrl1;
    String imgUrl2;
    String team1;
    String team2;
    String date;

    public ScheduleModel(String imgUrl1, String imgUrl2, String team1, String team2, String date) {
        this.imgUrl1 = imgUrl1;
        this.imgUrl2 = imgUrl2;
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
    }

    public String getImgUrl1() {
        return imgUrl1;
    }

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
