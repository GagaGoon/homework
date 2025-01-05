package module1;

public class Ex12 {
    public int determineGroup(int age){
        if(age >=7&&age<=13){
            return 1;
        }
        else if(age >=14&&age<=18){
            return 2;
        }
        else if(age >=19&&age<=65){
            return 3;
        }
        else{
            return -1;
        }
    }
}
