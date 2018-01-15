package com.cobi.board.domain;

import java.sql.Timestamp;

public class Board {
    int seq;
    String title;
    String contents;
    Timestamp createDate;
    Timestamp updateDate;
    int hit;
    String name;

    public Board() {
    }

    public Board(int seq, String title, String contents, Timestamp createDate, Timestamp updateDate, int hit, String name) {
        this.seq = seq;
        this.title = title;
        this.contents = contents;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.hit = hit;
        this.name = name;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
