package com.c19.api.c19api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class C19DAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    private String agebracket;
    private String contractedfromwhichpatientsuspected;
    private String currentstatus;
    private String dateannounced;
    private String detectedcity;
    private String detecteddistrict;
    private String detectedstate;
    private String entryid;
    private String gender;
    private String nationality;
    @Transient
    private String notes;
    private String numcases;
    private String source1;
    private String source2;
    private String source3;
    private String statecode;
    private String statepatientnumber;
    private String statuschangedate;
    private String typeoftransmission;

    public C19DAO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgebracket() {
        return agebracket;
    }

    public void setAgebracket(String agebracket) {
        this.agebracket = agebracket;
    }

    public String getContractedfromwhichpatientsuspected() {
        return contractedfromwhichpatientsuspected;
    }

    public void setContractedfromwhichpatientsuspected(String contractedfromwhichpatientsuspected) {
        this.contractedfromwhichpatientsuspected = contractedfromwhichpatientsuspected;
    }

    public String getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(String currentstatus) {
        this.currentstatus = currentstatus;
    }

    public String getDateannounced() {
        return dateannounced;
    }

    public void setDateannounced(String dateannounced) {
        this.dateannounced = dateannounced;
    }

    public String getDetectedcity() {
        return detectedcity;
    }

    public void setDetectedcity(String detectedcity) {
        this.detectedcity = detectedcity;
    }

    public String getDetecteddistrict() {
        return detecteddistrict;
    }

    public void setDetecteddistrict(String detecteddistrict) {
        this.detecteddistrict = detecteddistrict;
    }

    public String getDetectedstate() {
        return detectedstate;
    }

    public void setDetectedstate(String detectedstate) {
        this.detectedstate = detectedstate;
    }

    public String getEntryid() {
        return entryid;
    }

    public void setEntryid(String entryid) {
        this.entryid = entryid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNumcases() {
        return numcases;
    }

    public void setNumcases(String numcases) {
        this.numcases = numcases;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getSource2() {
        return source2;
    }

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    public String getSource3() {
        return source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatepatientnumber() {
        return statepatientnumber;
    }

    public void setStatepatientnumber(String statepatientnumber) {
        this.statepatientnumber = statepatientnumber;
    }

    public String getStatuschangedate() {
        return statuschangedate;
    }

    public void setStatuschangedate(String statuschangedate) {
        this.statuschangedate = statuschangedate;
    }

    public String getTypeoftransmission() {
        return typeoftransmission;
    }

    public void setTypeoftransmission(String typeoftransmission) {
        this.typeoftransmission = typeoftransmission;
    }
}