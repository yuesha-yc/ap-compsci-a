package labs.ppt7.lab4;

//********************************************************************
// Staff.java Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
// ********************************************************************
public class Staff {
    private final StaffMember[] staffList;

    //-----------------------------------------------------------------
    // Constructor: Sets up the list of staff members.
    // -----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[11];
        staffList[0] = new Executive("Mr. Hatcher", "123 Main Line", "555-0469", "123-45-6789", 100000);

        staffList[1] = new Employee("Ms. Xie", "456 Off Line", "555-0101", "987-65-4321", 65000);
        staffList[2] = new Employee("Mr. Ruppel", "789 Off Rocker", "555-0000", "010-20-3040", 45000);
        staffList[3] = new Hourly("Mr. Niverthi", "678 Fifth Ave.", "555-0690", "958-47-3625", 10);
        staffList[4] = new Hourly("Mr. Gokare", "678 Fifth Ave.", "555-0690", "958-47-3625", 12);
        staffList[5] = new Commission("Mr. Pujari", "678 Fifth Ave.", "555-0690", "958-47-3625", 75000);
        staffList[6] = new Commission("Mr. Juang", "678 Fifth Ave.", "555-0690", "958-47-3625", 125000);
        staffList[7] = new Volunteer("Ms. McClelland", "987 Suds Blvd.", "555-8374");
        staffList[8] = new Volunteer("Mr. Sanchez", "321 Duds Lane", "555-7282");
        staffList[9] = new Commission("Ms. Petry", "678 Fifth Ave.", "555-0690", "958-47-3625", 85000);
        staffList[10] = new Employee("Mr. Kevin", "678 Fifth Ave.", "555-0690", "958-47-3625", 30000);

        ((Executive) staffList[0]).awardBonus(25000);
        ((Hourly) staffList[3]).addHours(41);
        ((Hourly) staffList[4]).addHours(38);
        ((Commission) staffList[5]).awardCommission(1500);
        ((Commission) staffList[6]).awardCommission(12000);
        ((Commission) staffList[9]).awardCommission(1000);
    }

    //-----------------------------------------------------------------
    // Pays all staff members.
    // -----------------------------------------------------------------
    public void payday() {
        double amount;
        System.out.println("Payroll Manager: Kevin");
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay(); // polymorphic
            if (amount == 0.0) System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            System.out.println("-----------------------------------");
        }
    }
}

