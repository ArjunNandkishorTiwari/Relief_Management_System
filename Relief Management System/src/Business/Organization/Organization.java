/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *
 * @author meghanshubhatt
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    public HashSet<Role> roles;
    
    
    public enum Type{
        CDCManager("CDCManager Organization"),
        Clinic("Clinic Organization"),
        Supplier("Supplier Organization"), 
        Provider("Provider Organization"),
        NGOManager("NGOManager Organization"),
        SponsorManager("Sponsor Organization"),
        ResearchLabAdmin("ResearchLabAdmin Organization"),
        BloodBank("BloodBank Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
}