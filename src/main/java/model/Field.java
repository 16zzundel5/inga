package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Zach Zundel on 14.04.2016.
 */
public class Field {
    Date date;
    Plant plant;
    int origID;
    String evm;
    String expMin;
    String expMax;
    int efn;
    int ants;
    double antsEFN;
    String antCollection;
    int totalHerbivores;
    ArrayList<HerbivoreSpeciesObservation> herbivoreSpeciesObservation;
    ArrayList<HerbivoreCollectionObservation> herbiforeCollectionObservation;
    String notes;

    public Field(Date date, Plant plant, int origID, String evm, String expMin, String expMax, int efn, int ants,
                 double antsEFN, String antCollection, int totalHerbivores,
                 ArrayList<HerbivoreSpeciesObservation> herbivoreSpeciesObservation,
                 ArrayList<HerbivoreCollectionObservation> herbiforeCollectionObservation, String notes) {
        this.date = date;
        this.plant = plant;
        this.origID = origID;
        this.evm = evm;
        this.expMin = expMin;
        this.expMax = expMax;
        this.efn = efn;
        this.ants = ants;
        this.antsEFN = antsEFN;
        this.antCollection = antCollection;
        this.totalHerbivores = totalHerbivores;
        this.herbivoreSpeciesObservation = herbivoreSpeciesObservation;
        this.herbiforeCollectionObservation = herbiforeCollectionObservation;
        this.notes = notes;
    }

    public Field() {
        this.date = null;
        this.plant = null;
        this.origID = 0;
        this.evm = null;
        this.expMin = null;
        this.expMax = null;
        this.efn = 0;
        this.ants = 0;
        this.antsEFN = 0;
        this.antCollection = null;
        this.totalHerbivores = 0;
        this.herbivoreSpeciesObservation = null;
        this.herbiforeCollectionObservation = null;
        this.notes = null;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public int getOrigID() {
        return origID;
    }

    public void setOrigID(int origID) {
        this.origID = origID;
    }

    public String getEvm() {
        return evm;
    }

    public void setEvm(String evm) {
        this.evm = evm;
    }

    public String getExpMin() {
        return expMin;
    }

    public void setExpMin(String expMin) {
        this.expMin = expMin;
    }

    public String getExpMax() {
        return expMax;
    }

    public void setExpMax(String expMax) {
        this.expMax = expMax;
    }

    public int getEfn() {
        return efn;
    }

    public void setEfn(int efn) {
        this.efn = efn;
    }

    public int getAnts() {
        return ants;
    }

    public void setAnts(int ants) {
        this.ants = ants;
    }

    public double getAntsEFN() {
        return antsEFN;
    }

    public void setAntsEFN(double antsEFN) {
        this.antsEFN = antsEFN;
    }

    public String getAntCollection() {
        return antCollection;
    }

    public void setAntCollection(String antCollection) {
        this.antCollection = antCollection;
    }

    public int getTotalHerbivores() {
        return totalHerbivores;
    }

    public void setTotalHerbivores(int totalHerbivores) {
        this.totalHerbivores = totalHerbivores;
    }

    public ArrayList<HerbivoreSpeciesObservation> getHerbivoreSpeciesObservation() {
        return herbivoreSpeciesObservation;
    }

    public void setHerbivoreSpeciesObservation(ArrayList<HerbivoreSpeciesObservation> herbivoreSpeciesObservation) {
        this.herbivoreSpeciesObservation = herbivoreSpeciesObservation;
    }

    public ArrayList<HerbivoreCollectionObservation> getHerbiforeCollectionObservation() {
        return herbiforeCollectionObservation;
    }

    public void setHerbiforeCollectionObservation(ArrayList<HerbivoreCollectionObservation> herbiforeCollectionObservation) {
        this.herbiforeCollectionObservation = herbiforeCollectionObservation;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
