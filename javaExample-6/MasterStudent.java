
package studentapp;

public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    int numberOfConf;
    MasterStudent(int id,float mid,float fin,int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }
    public float computeTotalScore(){
        return computeBaseScore()+conferenceScore();
    }       
    public float conferenceScore(){
          return numberOfConf*5;
    }
}
