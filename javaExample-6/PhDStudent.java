
package studentapp;

public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    int numberOfArticle;
    PhDStudent(int id,float mid,float fin,int conf,int numberOfArticle){
        super(id,mid,fin,conf);
        this.numberOfArticle=numberOfArticle;
    }
    public float articleScore(){
        return numberOfArticle*8;
    }
    public float computeTotalScore(){
        return computeTotalScore()+articleScore();
    }
}
