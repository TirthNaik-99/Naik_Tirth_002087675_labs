/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

/**
 *
 * @author tirthnaik
 */
public class UserMapComparator implements  Comparator<User>{
    
    HashMap<Integer, Integer> userPostMap;
    
    public UserMapComparator(HashMap<Integer, Integer> userPostMap){
        this.userPostMap = userPostMap;
    }

    @Override
    public int compare(User o1, User o2) {
        Integer value1 = userPostMap.get(o1.getId());
        Integer value2 = userPostMap.get(o2.getId());

        // Treat null values as 0 (or another default value)
        value1 = (value1 == null) ? 0 : value1;
        value2 = (value2 == null) ? 0 : value2;

        return Integer.compare(value1, value2);
}

}
