package princeautomationlabs;


import java.util.ArrayList;
import java.util.List;

public class Collections01 {


    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(20);
        listOfNumbers.add(30);
        listOfNumbers.add(10);
        listOfNumbers.add(40);
        System.out.println(listOfNumbers);
        System.out.println("----------------");
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("sahil");
        listOfNames.add("kumar");
        listOfNames.add("mufti");
        listOfNames.add("jeans");
        System.out.println(listOfNames);
        System.out.println("----------------");
        List<String> listOfEmployees = new ArrayList<String>(List.of("Amit","MacMohan","Sumit","Bolly"));
        System.out.println(listOfEmployees);
        }
    }

