package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labname;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labname = labName;
    }

    public String getName() {
        return this.labname;
    }
}
