package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupRun {
    public static void main(String[] args) throws IOException {
        Document doc= Jsoup.connect("https://www.netshoes.com.br/busca?nsCat=Natural&q=oakley").timeout(6000).get();
        Elements ele = doc.select("div#searchresults_list");
        for (Element element:ele){

        }
    }
}
