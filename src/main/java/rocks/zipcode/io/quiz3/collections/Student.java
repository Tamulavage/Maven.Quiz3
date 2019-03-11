package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private HashMap<Lab, LabStatus> labs = new HashMap<>();
    Set set = labs.entrySet();

    public Student() {
        //this(null);
      //  labs = new HashMap<Lab, LabStatus>();
    }

    public Student(HashMap<Lab, LabStatus> map) {
       // this.labs = map;
    }

    public Lab getLab(String labName) {
        Iterator k = set.iterator();
        Lab retVal = null;
        while(k.hasNext()) {
         Map.Entry me = (Map.Entry) k.next();
           Lab lab = (Lab) me.getKey();
           if(labName.equals(lab.getName())){
               retVal = lab;
           }
        }

       return retVal;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if(lab != null) {
            this.labs.put(lab, labStatus);
        }
        else {
            throw new UnsupportedOperationException("Lab was not forked");
        }

    }


    public void forkLab(Lab lab) {
        this.labs.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        Lab lab = getLab(labName);
        return this.labs.get(lab);
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public String toString(){
        Iterator k = set.iterator();

        StringBuilder retVal = new StringBuilder();
        while(k.hasNext()) {
            Map.Entry me = (Map.Entry) k.next();
            Lab lab = (Lab) me.getKey();
            retVal.append(lab.getName());
            retVal.append(" -> ");
            retVal.append(me.getValue());
            retVal.append(" \n");

        }

        return retVal.toString();

    }
}
