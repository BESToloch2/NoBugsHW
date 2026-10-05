package javaCollectionsHW;

import java.util.HashSet;

public class ExtraTask_4 {

    //4. Учёт посещений страниц
    //Задача: Отслеживать уникальные страницы и общее количество посещений.
    private int totalCount;
    private HashSet<String> webSites;
    public ExtraTask_4(){
        this.webSites = new HashSet<>();
    }

    public void visitWebSite(String link){
        webSites.add(link);
        totalCount++;
    }

    public void printAmountOfUniqueSites(){
        System.out.println(webSites.size());
    }

    public void printAmountOfSitesVisits(){
        System.out.println(totalCount);
    }



}
