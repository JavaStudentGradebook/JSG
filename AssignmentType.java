/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

/**
 *
 * @author justinlesko
 */
public class AssignmentType {
    private String type;
    private int weight;

    public AssignmentType() {
        type = "";
        weight = 0;
    }
    public AssignmentType(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }
    public void print(){
        System.out.printf("Assignment Type: %s\nWeight: %d\n\n", type, weight);
    }
    
}
