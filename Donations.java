public class Donations {

    int numIndividual;
    double amtIndividual;
    int numBusiness; 
    double amtBusiness;
    int numOther;
    double amtOther;

    public void processDonation(String cat,double donation) {
       
        if (cat.equals("individual")) {
            if (donation > 0) {
                numIndividual++;
                amtIndividual = donation + amtIndividual;
            }
            else {
                numIndividual--;
                amtIndividual = donation - amtIndividual;
            }
        }
         if (cat.equals("business")) {
          if(donation > 0) {
                numBusiness++;
                amtBusiness = donation + amtBusiness;
            }
            else {
                numBusiness--;
                amtBusiness = donation - amtBusiness;
            }
        }
         if (cat.equals("other")) {
            if (donation > 0) {
                numOther++;
                amtOther = donation + amtOther;
            }
            else {
                numOther--;
                amtOther = donation - amtOther;
            }
        }

        System.out.printf("%-13s \"donation amount\" %5.2f\n",cat,donation);

    }

    public void getStatistics() {

        System.out.println();
        
        System.out.println("The number of individual donations: " + numIndividual);
        
        System.out.println("The total of all individual donations: " + amtIndividual);
        
        System.out.println();
        
        System.out.println("The number of business donations: " + numBusiness);
        
        System.out.println("The total of all business donations: " + amtBusiness);
        
        System.out.println();
        
        System.out.println("The number of other donations: " + numOther);
        
        System.out.println("The total of all other donations: " + amtOther);
    	}

	}