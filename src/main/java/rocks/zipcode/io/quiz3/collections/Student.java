package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private Map<Lab, LabStatus> labLabStatusMap;
    private Map<String, Lab> labNameMap = new TreeMap<>();

    public Student() {
        this(new HashMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labLabStatusMap = map;
        setLabNameMap();
    }

    private void setLabNameMap() {
        Set<Lab> labSet = labLabStatusMap.keySet();
        for (Lab lab : labSet) {
                labNameMap.put(lab.getName(), lab);
        }
    }

    public Lab getLab(String labName) {
        return labNameMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (labNameMap.containsKey(labName)) {
            labLabStatusMap.put(labNameMap.get(labName), labStatus);
        } else {
            throw new UnsupportedOperationException();
        }
    }


    public void forkLab(Lab lab) {
        labLabStatusMap.put(lab, LabStatus.PENDING);
        labNameMap.put(lab.getName(), lab);
    }

    public LabStatus getLabStatus(String labName) {
        return labLabStatusMap.get(labNameMap.get(labName));
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Set<String> labSet = labNameMap.keySet();
        int counter = labSet.size();
        for (String name : labSet) {
            Lab lab = labNameMap.get(name);
            string.append(lab.getName()).append(" > ").append(labLabStatusMap.get(lab));
            counter--;
            if (counter > 0) {
                string.append("\n");
            }
        }
        return string.toString();
    }
}
