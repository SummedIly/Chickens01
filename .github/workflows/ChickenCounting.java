class Main {
  public static void main(String[] args) {
int totalEggs = 15;
    int chickenCount = 3;
  int eggsPerChicken = 5;
totalEggs = chickenCount * eggsPerChicken;

    
    System.out.println("Monday:" + totalEggs);
    chickenCount++;
    totalEggs += chickenCount * eggsPerChicken;

        System.out.println("Tuesday:" + totalEggs);
    totalEggs += chickenCount * eggsPerChicken;
        System.out.println("Wednesday:" + totalEggs);
        chickenCount=2;

        totalEggs += chickenCount * eggsPerChicken;

            System.out.println("Thursday:" + totalEggs);
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println("Friday:" + totalEggs);
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println("Saturday:" + totalEggs);
        totalEggs += chickenCount * eggsPerChicken;

        System.out.println("Sunday:" + totalEggs);
    totalEggs += chickenCount * eggsPerChicken;


  }
}
