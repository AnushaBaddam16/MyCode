package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Traverse {
    public List<String> getList(ArrayList<String> employeeList) {
            List<String> outputList = new ArrayList<>();
            for(int i = 0; i < employeeList.size(); i++) {
                outputList.add(employeeList.get(i));
            }
            return outputList;
        }

        public List<String> getListEnhancedForLoop(ArrayList<String> employeeList) {
            List<String> outputList = new ArrayList<>();
            for(String name : employeeList) {
                outputList.add(name);
            }
            return outputList;
        }
    }
