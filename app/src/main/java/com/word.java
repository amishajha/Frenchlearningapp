package com;

public class word {

    private String mdefaulttranslation;
    private String mfrenchtranslation;
    private int mresourceid= NO_IMAGE_PROVIDED;
    private static int NO_IMAGE_PROVIDED=-1;
public word(String defaulttranslation,String frenchtranslation){
mdefaulttranslation=defaulttranslation;
mfrenchtranslation=frenchtranslation;

}
public word(String defaulttranslation,String frenchtranslation,int resourceid){
        mdefaulttranslation=defaulttranslation;
        mfrenchtranslation=frenchtranslation;
        mresourceid=resourceid;

    }



public String getMdefaulttranslation(){
return mdefaulttranslation;
}
public String getMfrenchtranslation(){

    return mfrenchtranslation;
}
public int getMresourceid(){
    return mresourceid;
}

public boolean hasimage(){
    return mresourceid!=NO_IMAGE_PROVIDED;
}
}