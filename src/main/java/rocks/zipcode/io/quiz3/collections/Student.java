package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private static Map<Lab, LabStatus> mapLabStatus = new HashMap<>();

    public Student() {

        this(mapLabStatus);
    }

    public Student(Map<Lab, LabStatus> map) {
        this.mapLabStatus = map;
    }

    public Lab getLab(String labName) {
        Lab retLab = new Lab();
        for (Map.Entry<Lab, LabStatus> entry : mapLabStatus.entrySet()) {
            if (entry.getKey().equals(labName)) {
                retLab = entry.getKey();
            }
        }

        return retLab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        mapLabStatus.put(new Lab(labName), labStatus);
    }


    public void forkLab(Lab lab) {
        mapLabStatus.put(lab,LabStatus.PENDING );

    }

    public LabStatus getLabStatus(String labName) {
        return mapLabStatus.get(labName);

        //throw new UnsupportedOperationException("Method not yet implemented");
    }
}
